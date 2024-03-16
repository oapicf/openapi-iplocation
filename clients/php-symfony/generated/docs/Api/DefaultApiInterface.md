# OpenAPI\Server\Api\DefaultApiInterface

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](DefaultApiInterface.md#rootGet) | **GET** / | Get geolocation of an IP address


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\DefaultApi:
        tags:
            - { name: "open_api_server.api", api: "default" }
    # ...
```

## **rootGet**
> OpenAPI\Server\Model\Get200Response rootGet($ip, $format, $delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#rootGet
     */
    public function rootGet($ip, ?$format, ?$delimiter, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**AnyType**](../Model/.md)| An IPv4 or IPv6 address that you would like to lookup. |
 **format** | [**AnyType**](../Model/.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional]
 **delimiter** | [**AnyType**](../Model/.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional]

### Return type

[**OpenAPI\Server\Model\Get200Response**](../Model/Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

