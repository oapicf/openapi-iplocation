# OpenApiIplocationClient::Get200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ip** | **String** | IPv4 or IPv6 address used to lookup geolocation. | [optional] |
| **ip_number** | **String** | IP number in long integer (represented as string). | [optional] |
| **ip_version** | **Integer** | IP version either 4 or 6. | [optional] |
| **country_name** | **String** | Full name of the IP country. | [optional] |
| **country_code2** | **String** | ISO ALPHA-2 Country Code. | [optional] |
| **isp** | **String** | Internet Service Provider (ISP) who owns the IP address. | [optional] |
| **response_code** | **String** | Response status code to indicate success or failed completion of the API call. | [optional] |
| **response_message** | **String** | Response message to indicate success or failed completion of the API call. | [optional] |

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

