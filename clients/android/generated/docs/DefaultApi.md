# DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address



## rootGet

> Get200Response rootGet(ip, format, delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
OasAnyTypeNotMapped ip = null; // OasAnyTypeNotMapped | An IPv4 or IPv6 address that you would like to lookup.
OasAnyTypeNotMapped format = null; // OasAnyTypeNotMapped | Output format, the following formats are supported: plain xml json jsonp php csv serialized
OasAnyTypeNotMapped delimiter = null; // OasAnyTypeNotMapped | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
try {
    Get200Response result = apiInstance.rootGet(ip, format, delimiter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rootGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**OasAnyTypeNotMapped**](.md)| An IPv4 or IPv6 address that you would like to lookup. | [default to null]
 **format** | [**OasAnyTypeNotMapped**](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] [default to null]
 **delimiter** | [**OasAnyTypeNotMapped**](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] [default to null]

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

