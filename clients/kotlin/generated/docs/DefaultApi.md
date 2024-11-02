# DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address |


<a id="rootGet"></a>
# **rootGet**
> Get200Response rootGet(ip, format, delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ip : kotlin.String = ip_example // kotlin.String | An IPv4 or IPv6 address that you would like to lookup.
val format : kotlin.String = format_example // kotlin.String | Output format, the following formats are supported: plain xml json jsonp php csv serialized
val delimiter : kotlin.String = delimiter_example // kotlin.String | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
try {
    val result : Get200Response = apiInstance.rootGet(ip, format, delimiter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#rootGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#rootGet")
    e.printStackTrace()
}
```

### Parameters
| **ip** | **kotlin.String**| An IPv4 or IPv6 address that you would like to lookup. | |
| **format** | **kotlin.String**| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delimiter** | **kotlin.String**| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] |

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

