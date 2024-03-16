# DefaultController

All URIs are relative to `""`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootGet**](#rootGet) | **GET** / | Get geolocation of an IP address

<a name="rootGet"></a>
# **rootGet**
```java
Mono<Get200Response> DefaultController.rootGet(ip_formatdelimiter)
```

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ip** | [**Object**](../../docs/models/.md) | An IPv4 or IPv6 address that you would like to lookup. |
**_format** | [**Object**](../../docs/models/.md) | Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional parameter]
**delimiter** | [**Object**](../../docs/models/.md) | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional parameter]

### Return type
[**Get200Response**](../../docs/models/Get200Response.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

