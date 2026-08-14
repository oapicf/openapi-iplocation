# DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**root_get**](DefaultApi.md#root_get) | **GET** / | Get geolocation of an IP address


# **root_get**
> `root_get`(req::`HTTP.Request`, `ip`::`String`; `format`=nothing, `delimiter`=nothing,) -> `Get200Response`

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ip`** | **`String`**| An IPv4 or IPv6 address that you would like to lookup. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`format`** | **`String`**| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [default to nothing]
 **`delimiter`** | **`String`**| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [default to nothing]

### Return type

[**`Get200Response`**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

