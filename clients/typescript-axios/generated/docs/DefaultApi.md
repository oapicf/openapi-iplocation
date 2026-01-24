# DefaultApi

All URIs are relative to *https://api.iplocation.net*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**rootGet**](#rootget) | **GET** / | Get geolocation of an IP address|

# **rootGet**
> Get200Response rootGet()

Retrieve geolocation of an IP address. 

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let ip: string; //An IPv4 or IPv6 address that you would like to lookup. (default to undefined)
let format: string; //Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional) (default to undefined)
let delimiter: string; //Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional) (default to undefined)

const { status, data } = await apiInstance.rootGet(
    ip,
    format,
    delimiter
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **ip** | [**string**] | An IPv4 or IPv6 address that you would like to lookup. | defaults to undefined|
| **format** | [**string**] | Output format, the following formats are supported: plain xml json jsonp php csv serialized | (optional) defaults to undefined|
| **delimiter** | [**string**] | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | (optional) defaults to undefined|


### Return type

**Get200Response**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully processed the request. |  -  |
|**400** | Failed to complete the request. |  -  |
|**404** | Command not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

