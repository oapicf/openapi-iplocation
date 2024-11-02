// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * iplocation.net API
 *
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * API version: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type Get400Response struct {

	// Response status code to indicate success or failed completion of the API call.
	ResponseCode string `json:"response_code,omitempty"`

	// Response message to indicate success or failed completion of the API call.
	ResponseMessage string `json:"response_message,omitempty"`
}

// AssertGet400ResponseRequired checks if the required fields are not zero-ed
func AssertGet400ResponseRequired(obj Get400Response) error {
	return nil
}

// AssertGet400ResponseConstraints checks if the values respects the defined constraints
func AssertGet400ResponseConstraints(obj Get400Response) error {
	return nil
}
