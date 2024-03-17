# OpenApiIplocationClient::DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**root_get**](DefaultApi.md#root_get) | **GET** / | Get geolocation of an IP address |


## root_get

> <Get200Response> root_get(ip, opts)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Examples

```ruby
require 'time'
require 'openapi_iplocation'

api_instance = OpenApiIplocationClient::DefaultApi.new
ip = 'ip_example' # String | An IPv4 or IPv6 address that you would like to lookup.
opts = {
  format: 'format_example', # String | Output format, the following formats are supported: plain xml json jsonp php csv serialized
  delimiter: 'delimiter_example' # String | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
}

begin
  # Get geolocation of an IP address
  result = api_instance.root_get(ip, opts)
  p result
rescue OpenApiIplocationClient::ApiError => e
  puts "Error when calling DefaultApi->root_get: #{e}"
end
```

#### Using the root_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Get200Response>, Integer, Hash)> root_get_with_http_info(ip, opts)

```ruby
begin
  # Get geolocation of an IP address
  data, status_code, headers = api_instance.root_get_with_http_info(ip, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Get200Response>
rescue OpenApiIplocationClient::ApiError => e
  puts "Error when calling DefaultApi->root_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ip** | **String** | An IPv4 or IPv6 address that you would like to lookup. |  |
| **format** | **String** | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] |
| **delimiter** | **String** | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] |

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

