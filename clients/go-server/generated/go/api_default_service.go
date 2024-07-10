/*
 * iplocation.net API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// DefaultAPIService is a service that implements the logic for the DefaultAPIServicer
// This service should implement the business logic for every endpoint for the DefaultAPI API.
// Include any external packages or services that will be required by this service.
type DefaultAPIService struct {
}

// NewDefaultAPIService creates a default api service
func NewDefaultAPIService() DefaultAPIServicer {
	return &DefaultAPIService{}
}

// RootGet - Get geolocation of an IP address
func (s *DefaultAPIService) RootGet(ctx context.Context, ip string, format string, delimiter string) (ImplResponse, error) {
	// TODO - update RootGet with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Get200Response{}) or use other options such as http.Ok ...
	// return Response(200, Get200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, Get400Response{}) or use other options such as http.Ok ...
	// return Response(400, Get400Response{}), nil

	// TODO: Uncomment the next line to return response Response(404, Get400Response{}) or use other options such as http.Ok ...
	// return Response(404, Get400Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RootGet method not implemented")
}