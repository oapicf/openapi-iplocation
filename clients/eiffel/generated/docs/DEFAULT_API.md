# DEFAULT_API

All URIs are relative to *https://api.iplocation.net*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**root_get**](DEFAULT_API.md#root_get) | **Get** / | Get geolocation of an IP address


# **root_get**
> root_get (ip: ANY ; format:  detachable ANY ; delimiter:  detachable ANY ): detachable MODEL__GET_200_RESPONSE


Get geolocation of an IP address

Retrieve geolocation of an IP address. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**ANY**](.md)| An IPv4 or IPv6 address that you would like to lookup. | [default to null]
 **format** | [**ANY**](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] [default to null]
 **delimiter** | [**ANY**](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] [default to null]

### Return type

[**MODEL__GET_200_RESPONSE**](__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

