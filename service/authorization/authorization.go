package authorization

import (
	"context"
	"errors"
	"fmt"
	"log/slog"
	"strconv"
	"strings"
	"time"

	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"github.com/open-policy-agent/opa/metrics"
	"github.com/open-policy-agent/opa/profiler"
	opaSdk "github.com/open-policy-agent/opa/sdk"
	"github.com/opentdf/platform/protocol/go/authorization"
	"github.com/opentdf/platform/protocol/go/policy"
	attr "github.com/opentdf/platform/protocol/go/policy/attributes"
	otdf "github.com/opentdf/platform/sdk"
	"github.com/opentdf/platform/service/internal/access"
	"github.com/opentdf/platform/service/internal/db"
	"github.com/opentdf/platform/service/internal/entitlements"
	"github.com/opentdf/platform/service/internal/opa"
	"github.com/opentdf/platform/service/pkg/serviceregistry"
)

type AuthorizationService struct {
	authorization.UnimplementedAuthorizationServiceServer
	eng    *opa.Engine
	sdk    *otdf.SDK
	config *map[string]interface{}
}

func NewRegistration() serviceregistry.Registration {
	return serviceregistry.Registration{
		Namespace:   "authorization",
		ServiceDesc: &authorization.AuthorizationService_ServiceDesc,
		RegisterFunc: func(srp serviceregistry.RegistrationParams) (any, serviceregistry.HandlerServer) {
			return &AuthorizationService{eng: srp.Engine, sdk: srp.SDK, config: &srp.Config.ExtraProps}, func(ctx context.Context, mux *runtime.ServeMux, server any) error {
				return authorization.RegisterAuthorizationServiceHandlerServer(ctx, mux, server.(authorization.AuthorizationServiceServer))
			}
		},
	}
}

// abstracted into variable for mocking in tests
var retrieveAttributeDefinitions = func(ctx context.Context, ra *authorization.ResourceAttribute, sdk *otdf.SDK) (map[string]*attr.GetAttributeValuesByFqnsResponse_AttributeAndValue, error) {
	resp, err := sdk.Attributes.GetAttributeValuesByFqns(ctx, &attr.GetAttributeValuesByFqnsRequest{
		WithValue: &policy.AttributeValueSelector{
			WithSubjectMaps: true,
		},
		Fqns: ra.GetAttributeValueFqns(),
	})
	if err != nil {
		return nil, err
	}
	return resp.GetFqnAttributeValues(), nil
}

// abstracted into variable for mocking in tests
var retrieveEntitlements = func(ctx context.Context, req *authorization.GetEntitlementsRequest, as AuthorizationService) (*authorization.GetEntitlementsResponse, error) {
	return as.GetEntitlements(ctx, req)
}

func (as AuthorizationService) GetDecisions(ctx context.Context, req *authorization.GetDecisionsRequest) (*authorization.GetDecisionsResponse, error) {
	slog.DebugContext(ctx, "getting decisions")

	// Temporary canned echo response with permit decision for all requested decision/entity/ra combos
	rsp := &authorization.GetDecisionsResponse{
		DecisionResponses: make([]*authorization.DecisionResponse, 0),
	}
	for _, dr := range req.GetDecisionRequests() {
		for _, ra := range dr.GetResourceAttributes() {
			slog.DebugContext(ctx, "getting resource attributes", slog.String("FQNs", strings.Join(ra.GetAttributeValueFqns(), ", ")))

			// get attribute definition/value combinations
			dataAttrDefsAndVals, err := retrieveAttributeDefinitions(ctx, ra, as.sdk)
			if err != nil {
				// TODO: should all decisions in a request fail if one FQN lookup fails?
				return nil, db.StatusifyError(err, db.ErrTextGetRetrievalFailed, slog.String("fqns", strings.Join(ra.GetAttributeValueFqns(), ", ")))
			}
			var attrDefs []*policy.Attribute
			var attrVals []*policy.Value
			for _, v := range dataAttrDefsAndVals {
				attrDefs = append(attrDefs, v.GetAttribute())
				attrVals = append(attrVals, v.GetValue())
			}

			for _, ec := range dr.GetEntityChains() {
				//
				// TODO: we should already have the subject mappings here and be able to just use OPA to trim down the known data attr values to the ones matched up with the entities
				//
				entities := ec.GetEntities()
				req := authorization.GetEntitlementsRequest{
					Entities: entities,
					Scope:    ra,
				}
				ecEntitlements, err := retrieveEntitlements(ctx, &req, as)
				if err != nil {
					// TODO: should all decisions in a request fail if one entity entitlement lookup fails?
					return nil, db.StatusifyError(err, db.ErrTextGetRetrievalFailed, slog.String("getEntitlements request failed ", req.String()))
				}

				// currently just adding each entity retuned to same list
				entityAttrValues := make(map[string][]string)
				for _, e := range ecEntitlements.GetEntitlements() {
					entityAttrValues[e.GetEntityId()] = e.GetAttributeValueFqns()
				}

				// call access-pdp
				accessPDP := access.NewPdp()
				decisions, err := accessPDP.DetermineAccess(
					ctx,
					attrVals,
					entityAttrValues,
					attrDefs,
				)
				if err != nil {
					// TODO: should all decisions in a request fail if one entity entitlement lookup fails?
					return nil, db.StatusifyError(err, db.ErrTextGetRetrievalFailed, slog.String("DetermineAccess request to Access PDP failed", ""))
				}
				// check the decisions
				decision := authorization.DecisionResponse_DECISION_PERMIT
				for _, d := range decisions {
					if !d.Access {
						decision = authorization.DecisionResponse_DECISION_DENY
					}
				}

				decisionResp := &authorization.DecisionResponse{
					Decision:      decision,
					EntityChainId: ec.GetId(),
					Action: &policy.Action{
						Value: &policy.Action_Standard{
							Standard: policy.Action_STANDARD_ACTION_TRANSMIT,
						},
					},
					ResourceAttributesId: ra.GetAttributeValueFqns()[0],
				}
				rsp.DecisionResponses = append(rsp.DecisionResponses, decisionResp)
			}
		}
	}
	return rsp, nil
}

func (as AuthorizationService) GetEntitlements(ctx context.Context, req *authorization.GetEntitlementsRequest) (*authorization.GetEntitlementsResponse, error) {
	slog.DebugContext(ctx, "getting entitlements")
	// Scope is required for because of performance.  Remove and handle 360 no scope
	// https://github.com/opentdf/platform/issues/365
	if req.GetScope() == nil {
		slog.ErrorContext(ctx, "requires scope")
		return nil, errors.New(db.ErrTextFqnMissingValue)
	}
	// get subject mappings
	request := attr.GetAttributeValuesByFqnsRequest{
		Fqns: req.GetScope().GetAttributeValueFqns(),
		WithValue: &policy.AttributeValueSelector{
			WithSubjectMaps: true,
		},
	}
	avf, err := as.sdk.Attributes.GetAttributeValuesByFqns(ctx, &request)
	if err != nil {
		return nil, err
	}
	subjectMappings := avf.GetFqnAttributeValues()
	slog.DebugContext(ctx, "retrieved from subject mappings service", slog.Any("subject_mappings: ", subjectMappings))
	if req.Entities == nil {
		slog.ErrorContext(ctx, "requires entities")
		return nil, errors.New("entity chain is required")
	}
	rsp := &authorization.GetEntitlementsResponse{
		Entitlements: make([]*authorization.EntityEntitlements, len(req.GetEntities())),
	}
	for i, entity := range req.GetEntities() {
		// OPA
		in, err := entitlements.OpaInput(entity, subjectMappings, *as.config)
		if err != nil {
			return nil, err
		}
		slog.DebugContext(ctx, "entitlements", "entity_id", entity.GetId(), "input", fmt.Sprintf("%+v", in))
		// uncomment for debugging
		// if slog.Default().Enabled(ctx, slog.LevelDebug) {
		//	_ = json.NewEncoder(os.Stdout).Encode(in)
		// }
		options := opaSdk.DecisionOptions{
			Now:                 time.Now(),
			Path:                "opentdf/entitlements/attributes", // change to /resolve_entities to get output of idp_plugin
			Input:               in,
			NDBCache:            nil,
			StrictBuiltinErrors: true,
			Tracer:              nil,
			Metrics:             metrics.New(),
			Profiler:            profiler.New(),
			Instrument:          true,
			DecisionID:          fmt.Sprintf("%-v", req.String()),
		}
		decision, err := as.eng.Decision(ctx, options)
		if err != nil {
			return nil, err
		}
		// uncomment for debugging
		// if slog.Default().Enabled(ctx, slog.LevelDebug) {
		//	_ = json.NewEncoder(os.Stdout).Encode(decision.Result)
		// }
		results, ok := decision.Result.([]interface{})
		if !ok {
			slog.DebugContext(ctx, "not ok", "entity_id", entity.GetId(), "decision.Result", fmt.Sprintf("%+v", decision.Result))
			return nil, err
		}
		slog.DebugContext(ctx, "opa results", "entity_id", entity.GetId(), "results", fmt.Sprintf("%+v", results))
		saa := make([]string, len(results))
		for k, v := range results {
			str, okk := v.(string)
			if !okk {
				slog.DebugContext(ctx, "not ok", slog.String("entity_id", entity.GetId()), slog.String(strconv.Itoa(k), fmt.Sprintf("%+v", v)))
			}
			saa[k] = str
		}
		rsp.Entitlements[i] = &authorization.EntityEntitlements{
			EntityId:           entity.GetId(),
			AttributeValueFqns: saa,
		}
	}
	slog.DebugContext(ctx, "opa", "rsp", fmt.Sprintf("%+v", rsp))
	return rsp, nil
}
