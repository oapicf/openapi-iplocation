# DefaultAPI

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](DefaultAPI.md#rootget) | **GET** / | Get geolocation of an IP address


# **rootGet**
```swift
    open class func rootGet(ip: AnyCodable, format: AnyCodable? = nil, delimiter: AnyCodable? = nil, completion: @escaping (_ data: Get200Response?, _ error: Error?) -> Void)
```

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let ip = TODO // AnyCodable | An IPv4 or IPv6 address that you would like to lookup.
let format = TODO // AnyCodable | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
let delimiter = TODO // AnyCodable | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)

// Get geolocation of an IP address
DefaultAPI.rootGet(ip: ip, format: format, delimiter: delimiter) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**AnyCodable**](.md) | An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [**AnyCodable**](.md) | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | [**AnyCodable**](.md) | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

