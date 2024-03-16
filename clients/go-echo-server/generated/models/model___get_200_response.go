package models

type Get200Response struct {

	// IPv4 or IPv6 address used to lookup geolocation.
	Ip *interface{} `json:"ip,omitempty"`

	// IP number in long integer.
	IpNumber *interface{} `json:"ip_number,omitempty"`

	// IP version either 4 or 6.
	IpVersion *interface{} `json:"ip_version,omitempty"`

	// Full name of the IP country.
	CountryName *interface{} `json:"country_name,omitempty"`

	// ISO ALPHA-2 Country Code.
	CountryCode2 *interface{} `json:"country_code2,omitempty"`

	// Internet Service Provider (ISP) who owns the IP address.
	Isp *interface{} `json:"isp,omitempty"`

	// Response status code to indicate success or failed completion of the API call.
	ResponseCode *interface{} `json:"response_code,omitempty"`

	// Response message to indicate success or failed completion of the API call.
	ResponseMessage *interface{} `json:"response_message,omitempty"`
}
