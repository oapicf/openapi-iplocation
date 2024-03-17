# DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RootGet**](DefaultApi.md#RootGet) | **GET** / | Get geolocation of an IP address


# **RootGet**
> Get200Response RootGet(ip, format = var.format, delimiter = var.delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```R
library(openapi)

# Get geolocation of an IP address
#
# prepare function argument(s)
var_ip <- "ip_example" # character | An IPv4 or IPv6 address that you would like to lookup.
var_format <- "format_example" # character | Output format, the following formats are supported: plain xml json jsonp php csv serialized (Optional)
var_delimiter <- "delimiter_example" # character | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (Optional)

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RootGet(var_ip, format = var_format, delimiter = var_delimiterdata_file = "result.txt")
result <- api_instance$RootGet(var_ip, format = var_format, delimiter = var_delimiter)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **character**| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | **character**| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | **character**| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**Get200Response**](__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully processed the request. |  -  |
| **400** | Failed to complete the request. |  -  |
| **404** | Command not found. |  -  |

