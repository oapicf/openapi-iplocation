# DefaultApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address



## rootGet

Get geolocation of an IP address

Retrieve geolocation of an IP address.

### Example

```bash
 rootGet  ip=value  format=value  delimiter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**AnyType**](.md) | An IPv4 or IPv6 address that you would like to lookup. | [default to null]
 **format** | [**AnyType**](.md) | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] [default to null]
 **delimiter** | [**AnyType**](.md) | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". | [optional] [default to null]

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

