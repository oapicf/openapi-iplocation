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