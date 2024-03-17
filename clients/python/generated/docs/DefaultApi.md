# openapiiplocation.DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**root_get**](DefaultApi.md#root_get) | **GET** / | Get geolocation of an IP address


# **root_get**
> Get200Response root_get(ip, format=format, delimiter=delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example


```python
import openapiiplocation
from openapiiplocation.models.get200_response import Get200Response
from openapiiplocation.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.iplocation.net
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiiplocation.Configuration(
    host = "https://api.iplocation.net"
)


# Enter a context with an instance of the API client
with openapiiplocation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiiplocation.DefaultApi(api_client)
    ip = 'ip_example' # str | An IPv4 or IPv6 address that you would like to lookup.
    format = 'format_example' # str | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
    delimiter = 'delimiter_example' # str | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)

    try:
        # Get geolocation of an IP address
        api_response = api_instance.root_get(ip, format=format, delimiter=delimiter)
        print("The response of DefaultApi->root_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->root_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **str**| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | **str**| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | **str**| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully processed the request. |  -  |
**400** | Failed to complete the request. |  -  |
**404** | Command not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

