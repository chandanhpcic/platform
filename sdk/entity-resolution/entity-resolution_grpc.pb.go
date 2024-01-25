// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: entity-resolution/entity-resolution.proto

package entity_resolution

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	EntityResolutionService_EntityResolution_FullMethodName = "/entityresolution.EntityResolutionService/EntityResolution"
)

// EntityResolutionServiceClient is the client API for EntityResolutionService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type EntityResolutionServiceClient interface {
	EntityResolution(ctx context.Context, in *EntityResolutionRequest, opts ...grpc.CallOption) (*EntityResolutionResponse, error)
}

type entityResolutionServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewEntityResolutionServiceClient(cc grpc.ClientConnInterface) EntityResolutionServiceClient {
	return &entityResolutionServiceClient{cc}
}

func (c *entityResolutionServiceClient) EntityResolution(ctx context.Context, in *EntityResolutionRequest, opts ...grpc.CallOption) (*EntityResolutionResponse, error) {
	out := new(EntityResolutionResponse)
	err := c.cc.Invoke(ctx, EntityResolutionService_EntityResolution_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// EntityResolutionServiceServer is the server API for EntityResolutionService service.
// All implementations must embed UnimplementedEntityResolutionServiceServer
// for forward compatibility
type EntityResolutionServiceServer interface {
	EntityResolution(context.Context, *EntityResolutionRequest) (*EntityResolutionResponse, error)
	mustEmbedUnimplementedEntityResolutionServiceServer()
}

// UnimplementedEntityResolutionServiceServer must be embedded to have forward compatible implementations.
type UnimplementedEntityResolutionServiceServer struct {
}

func (UnimplementedEntityResolutionServiceServer) EntityResolution(context.Context, *EntityResolutionRequest) (*EntityResolutionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method EntityResolution not implemented")
}
func (UnimplementedEntityResolutionServiceServer) mustEmbedUnimplementedEntityResolutionServiceServer() {
}

// UnsafeEntityResolutionServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to EntityResolutionServiceServer will
// result in compilation errors.
type UnsafeEntityResolutionServiceServer interface {
	mustEmbedUnimplementedEntityResolutionServiceServer()
}

func RegisterEntityResolutionServiceServer(s grpc.ServiceRegistrar, srv EntityResolutionServiceServer) {
	s.RegisterService(&EntityResolutionService_ServiceDesc, srv)
}

func _EntityResolutionService_EntityResolution_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(EntityResolutionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EntityResolutionServiceServer).EntityResolution(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: EntityResolutionService_EntityResolution_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EntityResolutionServiceServer).EntityResolution(ctx, req.(*EntityResolutionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// EntityResolutionService_ServiceDesc is the grpc.ServiceDesc for EntityResolutionService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var EntityResolutionService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "entityresolution.EntityResolutionService",
	HandlerType: (*EntityResolutionServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "EntityResolution",
			Handler:    _EntityResolutionService_EntityResolution_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "entity-resolution/entity-resolution.proto",
}
