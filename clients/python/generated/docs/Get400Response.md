# Get400Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_code** | **str** | Response status code to indicate success or failed completion of the API call. | [optional] 
**response_message** | **str** | Response message to indicate success or failed completion of the API call. | [optional] 

## Example

```python
from openapiiplocation.models.get400_response import Get400Response

# TODO update the JSON string below
json = "{}"
# create an instance of Get400Response from a JSON string
get400_response_instance = Get400Response.from_json(json)
# print the JSON string representation of the object
print(Get400Response.to_json())

# convert the object into a dict
get400_response_dict = get400_response_instance.to_dict()
# create an instance of Get400Response from a dict
get400_response_from_dict = Get400Response.from_dict(get400_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


