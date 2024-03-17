package models

type Get200Response struct {

	// IPv4 or IPv6 address used to lookup geolocation.
	Ip string `json:"ip,omitempty"`

	// IP number in long integer.
	IpNumber int64 `json:"ip_number,omitempty"`

	// IP version either 4 or 6.
	IpVersion int32 `json:"ip_version,omitempty"`

	// Full name of the IP country.
	CountryName string `json:"country_name,omitempty"`

	// ISO ALPHA-2 Country Code.
	CountryCode2 string `json:"country_code2,omitempty"`

	// Internet Service Provider (ISP) who owns the IP address.
	Isp string `json:"isp,omitempty"`

	// Response status code to indicate success or failed completion of the API call.
	ResponseCode string `json:"response_code,omitempty"`

	// Response message to indicate success or failed completion of the API call.
	ResponseMessage string `json:"response_message,omitempty"`
}
