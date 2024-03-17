# OAIDefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](OAIDefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address


# **rootGet**
```objc
-(NSURLSessionTask*) rootGetWithIp: (NSString*) ip
    format: (NSString*) format
    delimiter: (NSString*) delimiter
        completionHandler: (void (^)(OAIGet200Response* output, NSError* error)) handler;
```

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```objc

NSString* ip = @"ip_example"; // An IPv4 or IPv6 address that you would like to lookup.
NSString* format = @"format_example"; // Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
NSString* delimiter = @"delimiter_example"; // Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get geolocation of an IP address
[apiInstance rootGetWithIp:ip
              format:format
              delimiter:delimiter
          completionHandler: ^(OAIGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->rootGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **NSString***| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | **NSString***| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | **NSString***| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**OAIGet200Response***](OAIGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

