# Get400Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseCode** | **String** | Response status code to indicate success or failed completion of the API call. | [optional] 
**ResponseMessage** | **String** | Response message to indicate success or failed completion of the API call. | [optional] 

## Examples

- Prepare the resource
```powershell
$Get400Response = Initialize-PSOpenAPIToolsGet400Response  -ResponseCode null `
 -ResponseMessage null
```

- Convert the resource to JSON
```powershell
$Get400Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

