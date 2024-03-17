# DefaultAPI

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_rootGet**](DefaultAPI.md#DefaultAPI_rootGet) | **GET** / | Get geolocation of an IP address


# **DefaultAPI_rootGet**
```c
// Get geolocation of an IP address
//
// Retrieve geolocation of an IP address. 
//
__get_200_response_t* DefaultAPI_rootGet(apiClient_t *apiClient, char *ip, char *format, char *delimiter);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ip** | **char \*** | An IPv4 or IPv6 address that you would like to lookup. | 
**format** | **char \*** | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
**delimiter** | **char \*** | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[__get_200_response_t](__get_200_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

