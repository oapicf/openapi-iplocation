
# Table `__get_200_response`
(mapped from: Get200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ip** | ip | text |  | **kotlin.String** | IPv4 or IPv6 address used to lookup geolocation. |  [optional]
**ipNumber** | ip_number | long |  | [**Int64**](Int64.md) | IP number in long integer. |  [optional] [foreignkey]
**ipVersion** | ip_version | int |  | **kotlin.Int** | IP version either 4 or 6. |  [optional]
**countryName** | country_name | text |  | **kotlin.String** | Full name of the IP country. |  [optional]
**countryCode2** | country_code2 | text |  | **kotlin.String** | ISO ALPHA-2 Country Code. |  [optional]
**isp** | isp | text |  | **kotlin.String** | Internet Service Provider (ISP) who owns the IP address. |  [optional]
**responseCode** | response_code | text |  | **kotlin.String** | Response status code to indicate success or failed completion of the API call. |  [optional]
**responseMessage** | response_message | text |  | **kotlin.String** | Response message to indicate success or failed completion of the API call. |  [optional]










