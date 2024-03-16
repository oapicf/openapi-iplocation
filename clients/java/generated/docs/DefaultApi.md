# DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address |


<a name="rootGet"></a>
# **rootGet**
> Get200Response rootGet(ip, format, delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```java
// Import classes:
import com.cliffano.openapiiplocation.ApiClient;
import com.cliffano.openapiiplocation.ApiException;
import com.cliffano.openapiiplocation.Configuration;
import com.cliffano.openapiiplocation.models.*;
import com.cliffano.openapiiplocation.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.iplocation.net");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Object ip = null; // Object | An IPv4 or IPv6 address that you would like to lookup.
    Object format = null; // Object | Output format, the following formats are supported: plain xml json jsonp php csv serialized
    Object delimiter = null; // Object | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
    try {
      Get200Response result = apiInstance.rootGet(ip, format, delimiter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rootGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ip** | [**Object**](.md)| An IPv4 or IPv6 address that you would like to lookup. | |
| **format** | [**Object**](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] |
| **delimiter** | [**Object**](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] |

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

