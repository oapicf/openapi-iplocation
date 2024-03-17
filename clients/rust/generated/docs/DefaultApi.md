# \DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**root_get**](DefaultApi.md#root_get) | **GET** / | Get geolocation of an IP address



## root_get

> models::Get200Response root_get(ip, format, delimiter)
Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ip** | **String** | An IPv4 or IPv6 address that you would like to lookup. | [required] |
**format** | Option<**String**> | Output format, the following formats are supported: plain xml json jsonp php csv serialized |  |
**delimiter** | Option<**String**> | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". |  |

### Return type

[**models::Get200Response**](__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

