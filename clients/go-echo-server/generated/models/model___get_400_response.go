package models

type Get400Response struct {

	// Response status code to indicate success or failed completion of the API call.
	ResponseCode string `json:"response_code,omitempty"`

	// Response message to indicate success or failed completion of the API call.
	ResponseMessage string `json:"response_message,omitempty"`
}
