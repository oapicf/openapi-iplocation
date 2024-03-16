# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RootGet**](DefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address



## RootGet

> Get200Response RootGet (Object ip, Object format = null, Object delimiter = null)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RootGetExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.iplocation.net";
            var apiInstance = new DefaultApi(Configuration.Default);
            var ip = new Object(); // Object | An IPv4 or IPv6 address that you would like to lookup.
            var format = new Object(); // Object | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional) 
            var delimiter = new Object(); // Object | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional) 

            try
            {
                // Get geolocation of an IP address
                Get200Response result = apiInstance.RootGet(ip, format, delimiter);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DefaultApi.RootGet: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**Object**](Object.md)| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [**Object**](Object.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | [**Object**](Object.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

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

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

