# Get200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip** | **str** | IPv4 or IPv6 address used to lookup geolocation. | [optional] 
**ip_number** | [**Int64**](Int64.md) | IP number in long integer. | [optional] 
**ip_version** | **int** | IP version either 4 or 6. | [optional] 
**country_name** | **str** | Full name of the IP country. | [optional] 
**country_code2** | **str** | ISO ALPHA-2 Country Code. | [optional] 
**isp** | **str** | Internet Service Provider (ISP) who owns the IP address. | [optional] 
**response_code** | **str** | Response status code to indicate success or failed completion of the API call. | [optional] 
**response_message** | **str** | Response message to indicate success or failed completion of the API call. | [optional] 

## Example

```python
from openapiiplocation.models.get200_response import Get200Response

# TODO update the JSON string below
json = "{}"
# create an instance of Get200Response from a JSON string
get200_response_instance = Get200Response.from_json(json)
# print the JSON string representation of the object
print(Get200Response.to_json())

# convert the object into a dict
get200_response_dict = get200_response_instance.to_dict()
# create an instance of Get200Response from a dict
get200_response_form_dict = get200_response.from_dict(get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


