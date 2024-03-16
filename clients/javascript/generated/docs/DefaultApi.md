# OpenapiIplocation.DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address



## rootGet

> Get200Response rootGet(ip, opts)

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example

```javascript
import OpenapiIplocation from 'openapi_iplocation';

let apiInstance = new OpenapiIplocation.DefaultApi();
let ip = null; // Object | An IPv4 or IPv6 address that you would like to lookup.
let opts = {
  'format': null, // Object | Output format, the following formats are supported: plain xml json jsonp php csv serialized
  'delimiter': null // Object | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
};
apiInstance.rootGet(ip, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**Object**](.md)| An IPv4 or IPv6 address that you would like to lookup. | 
 **format** | [**Object**](.md)| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **delimiter** | [**Object**](.md)| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional] 

### Return type

[**Get200Response**](Get200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

