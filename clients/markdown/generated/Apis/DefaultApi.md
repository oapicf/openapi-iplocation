# DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address |


<a name="rootGet"></a>
# **rootGet**
> __get_200_response rootGet(ip, format, delimiter)

Get geolocation of an IP address

    Retrieve geolocation of an IP address. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ip** | **String**| An IPv4 or IPv6 address that you would like to lookup. | [default to null] |
| **format** | **String**| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] [default to null] |
| **delimiter** | **String**| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] [default to null] |

### Return type

[**__get_200_response**](../Models/__get_200_response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

