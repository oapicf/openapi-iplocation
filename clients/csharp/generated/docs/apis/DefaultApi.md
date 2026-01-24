# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**RootGet**](DefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address |

<a id="rootget"></a>
# **RootGet**
> Get200Response RootGet (string ip, string format = null, string delimiter = null)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ip** | **string** | An IPv4 or IPv6 address that you would like to lookup. |  |
| **format** | **string** | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional]  |
| **delimiter** | **string** | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional]  |

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
| **200** | Successfully processed the request. |  -  |
| **400** | Failed to complete the request. |  -  |
| **404** | Command not found. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

