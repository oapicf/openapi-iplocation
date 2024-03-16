# default_api

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
****](default_api.md#) | **GET** / | Get geolocation of an IP address


# ****
> models::Get200Response (ip, optional)
Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **ip** | [****](.md)| An IPv4 or IPv6 address that you would like to lookup. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [****](.md)| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [****](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | 
 **delimiter** | [****](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". | 

### Return type

[**models::Get200Response**](__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

