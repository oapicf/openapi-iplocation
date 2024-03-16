# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RootGet**](DefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address


<a name="rootget"></a>
# **RootGet**
> Get200Response RootGet (Object ip, Object format, Object delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RootGetExample
    {
        public void main()
        {
            var apiInstance = new DefaultApi();
            var ip = new Object(); // Object | An IPv4 or IPv6 address that you would like to lookup.
            var format = new Object(); // Object | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional) 
            var delimiter = new Object(); // Object | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional) 

            try
            {
                // Get geolocation of an IP address
                Get200Response result = apiInstance.RootGet(ip, format, delimiter);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.RootGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**Object**](.md)| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [**Object**](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | [**Object**](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

