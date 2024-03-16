# OpenApiIplocationClient::Get200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ip** | **Object** | IPv4 or IPv6 address used to lookup geolocation. | [optional] |
| **ip_number** | **Object** | IP number in long integer. | [optional] |
| **ip_version** | **Object** | IP version either 4 or 6. | [optional] |
| **country_name** | **Object** | Full name of the IP country. | [optional] |
| **country_code2** | **Object** | ISO ALPHA-2 Country Code. | [optional] |
| **isp** | **Object** | Internet Service Provider (ISP) who owns the IP address. | [optional] |
| **response_code** | **Object** | Response status code to indicate success or failed completion of the API call. | [optional] |
| **response_message** | **Object** | Response message to indicate success or failed completion of the API call. | [optional] |

## Example

```ruby
require 'openapi_iplocation'

instance = OpenApiIplocationClient::Get200Response.new(
  ip: null,
  ip_number: null,
  ip_version: null,
  country_name: null,
  country_code2: null,
  isp: null,
  response_code: null,
  response_message: null
)
```

