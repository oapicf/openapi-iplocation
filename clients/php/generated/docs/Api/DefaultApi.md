# OpenAPI\Client\DefaultApi

All URIs are relative to https://api.iplocation.net, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rootGet()**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address |


## `rootGet()`

```php
rootGet($ip, $format, $delimiter): \OpenAPI\Client\Model\Get200Response
```

Get geolocation of an IP address

Retrieve geolocation of an IP address.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ip = NULL; // mixed | An IPv4 or IPv6 address that you would like to lookup.
$format = NULL; // mixed | Output format, the following formats are supported: plain xml json jsonp php csv serialized
$delimiter = NULL; // mixed | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".

try {
    $result = $apiInstance->rootGet($ip, $format, $delimiter);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->rootGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ip** | [**mixed**](../Model/.md)| An IPv4 or IPv6 address that you would like to lookup. | |
| **format** | [**mixed**](../Model/.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] |
| **delimiter** | [**mixed**](../Model/.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] |

### Return type

[**\OpenAPI\Client\Model\Get200Response**](../Model/Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
