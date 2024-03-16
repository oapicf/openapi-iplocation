# Get200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ip** | [**AnyType**](.md) | IPv4 or IPv6 address used to lookup geolocation. | [optional] 
**IpNumber** | [**AnyType**](.md) | IP number in long integer. | [optional] 
**IpVersion** | [**AnyType**](.md) | IP version either 4 or 6. | [optional] 
**CountryName** | [**AnyType**](.md) | Full name of the IP country. | [optional] 
**CountryCode2** | [**AnyType**](.md) | ISO ALPHA-2 Country Code. | [optional] 
**Isp** | [**AnyType**](.md) | Internet Service Provider (ISP) who owns the IP address. | [optional] 
**ResponseCode** | [**AnyType**](.md) | Response status code to indicate success or failed completion of the API call. | [optional] 
**ResponseMessage** | [**AnyType**](.md) | Response message to indicate success or failed completion of the API call. | [optional] 

## Examples

- Prepare the resource
```powershell
$Get200Response = Initialize-PSOpenAPIToolsGet200Response  -Ip null `
 -IpNumber null `
 -IpVersion null `
 -CountryName null `
 -CountryCode2 null `
 -Isp null `
 -ResponseCode null `
 -ResponseMessage null
```

- Convert the resource to JSON
```powershell
$Get200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

