# \DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RootGet**](DefaultApi.md#RootGet) | **Get** / | Get geolocation of an IP address



## RootGet

> Get200Response RootGet(ctx).Ip(ip).Format(format).Delimiter(delimiter).Execute()

Get geolocation of an IP address



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    ip := TODO // interface{} | An IPv4 or IPv6 address that you would like to lookup.
    format := TODO // interface{} | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
    delimiter := TODO // interface{} | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.RootGet(context.Background()).Ip(ip).Format(format).Delimiter(delimiter).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.RootGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RootGet`: Get200Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.RootGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRootGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**interface{}**](interface{}.md) | An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [**interface{}**](interface{}.md) | Output format, the following formats are supported: plain xml json jsonp php csv serialized | 
 **delimiter** | [**interface{}**](interface{}.md) | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

