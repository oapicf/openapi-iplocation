# Get200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip** | **string** | IPv4 or IPv6 address used to lookup geolocation. | [optional] [default to undefined]
**ip_number** | **string** | IP number in long integer (represented as string). | [optional] [default to undefined]
**ip_version** | **number** | IP version either 4 or 6. | [optional] [default to undefined]
**country_name** | **string** | Full name of the IP country. | [optional] [default to undefined]
**country_code2** | **string** | ISO ALPHA-2 Country Code. | [optional] [default to undefined]
**isp** | **string** | Internet Service Provider (ISP) who owns the IP address. | [optional] [default to undefined]
**response_code** | **string** | Response status code to indicate success or failed completion of the API call. | [optional] [default to undefined]
**response_message** | **string** | Response message to indicate success or failed completion of the API call. | [optional] [default to undefined]

## Example

```typescript
import { Get200Response } from './api';

const instance: Get200Response = {
    ip,
    ip_number,
    ip_version,
    country_name,
    country_code2,
    isp,
    response_code,
    response_message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
