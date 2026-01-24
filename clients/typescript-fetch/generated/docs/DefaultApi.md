# DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rootGet**](DefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address |



## rootGet

> Get200Response rootGet(ip, format, delimiter)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { RootGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  const body = {
    // string | An IPv4 or IPv6 address that you would like to lookup.
    ip: ip_example,
    // string | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
    format: format_example,
    // string | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)
    delimiter: delimiter_example,
  } satisfies RootGetRequest;

  try {
    const data = await api.rootGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ip** | `string` | An IPv4 or IPv6 address that you would like to lookup. | [Defaults to `undefined`] |
| **format** | `string` | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [Optional] [Defaults to `undefined`] |
| **delimiter** | `string` | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [Optional] [Defaults to `undefined`] |

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully processed the request. |  -  |
| **400** | Failed to complete the request. |  -  |
| **404** | Command not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

