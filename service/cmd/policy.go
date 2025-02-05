package cmd

import (
	"fmt"
	"log/slog"

	"github.com/opentdf/platform/service/internal/config"
	"github.com/opentdf/platform/service/internal/db"
	policydb "github.com/opentdf/platform/service/policy/db"
	"github.com/spf13/cobra"
)

var policyFqnReindexCmdLong = `
Reindex FQN across namespaces, attributes, and attribute values

This command will reindex all FQNs across namespaces, attributes, and attribute values. This is
useful when the FQN generation logic changes and the FQNs need to be updated across the platform.
`

var (
	policyCmd = &cobra.Command{
		Use:   "policy",
		Short: "Run policy migrations",
	}

	policyFqnReindexCmd = &cobra.Command{
		Use:   "fqn-reindex",
		Short: "Reindex FQNs across the platform",
		Long:  policyFqnReindexCmdLong,

		Run: func(cmd *cobra.Command, args []string) {
			configFile, _ := cmd.Flags().GetString(configFileFlag)
			configKey, _ := cmd.Flags().GetString(configKeyFlag)
			cfg, err := config.LoadConfig(configKey, configFile)
			if err != nil {
				panic(fmt.Errorf("could not load config: %w", err))
			}
			dbClient, err := policyDBClient(cfg)
			if err != nil {
				panic(fmt.Errorf("could not load config: %w", err))
			}

			res := dbClient.AttrFqnReindex()
			fmt.Print("Namespace FQNs reindexed:\n")
			for _, r := range res.Namespaces {
				fmt.Printf("\t%s: %s\n", r.Id, r.Fqn)
			}

			fmt.Print("Attribute FQNs reindexed:\n")
			for _, r := range res.Attributes {
				fmt.Printf("\t%s: %s\n", r.Id, r.Fqn)
			}

			fmt.Print("Attribute Value FQNs reindexed:\n")
			for _, r := range res.Values {
				fmt.Printf("\t%s: %s\n", r.Id, r.Fqn)
			}
		},
	}
)

func policyDBClient(conf *config.Config) (*policydb.PolicyDBClient, error) {
	slog.Info("creating database client")
	dbClient, err := db.NewClient(conf.DB)
	if err != nil {
		//nolint:wrapcheck // we want to return the error as is. the start command will wrap it
		return nil, err
	}
	return policydb.NewClient(*dbClient), nil
}

func init() {
	policyCmd.AddCommand(policyFqnReindexCmd)
	rootCmd.AddCommand(policyCmd)
}
