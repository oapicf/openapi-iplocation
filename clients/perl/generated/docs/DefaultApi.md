# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**root_get**](DefaultApi.md#root_get) | **GET** / | Get geolocation of an IP address


# **root_get**
> Get200Response root_get(ip => $ip, format => $format, delimiter => $delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $ip = new WWW::OpenAPIClient.AnyType(); # AnyType | An IPv4 or IPv6 address that you would like to lookup.
my $format = new WWW::OpenAPIClient.AnyType(); # AnyType | Output format, the following formats are supported: plain xml json jsonp php csv serialized
my $delimiter = new WWW::OpenAPIClient.AnyType(); # AnyType | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".

eval {
    my $result = $api_instance->root_get(ip => $ip, format => $format, delimiter => $delimiter);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->root_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**AnyType**](.md)| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [**AnyType**](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | [**AnyType**](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

