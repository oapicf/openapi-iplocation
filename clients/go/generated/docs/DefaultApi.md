# \DefaultAPI

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RootGet**](DefaultAPI.md#RootGet) | **Get** / | Get geolocation of an IP address



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
	openapiclient "github.com/oapicf/openapi-iplocation"
)

func main() {
	ip := "ip_example" // string | An IPv4 or IPv6 address that you would like to lookup.
	format := "format_example" // string | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
	delimiter := "delimiter_example" // string | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.RootGet(context.Background()).Ip(ip).Format(format).Delimiter(delimiter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.RootGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RootGet`: Get200Response
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.RootGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRootGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **string** | An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | **string** | Output format, the following formats are supported: plain xml json jsonp php csv serialized | 
 **delimiter** | **string** | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | 

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

