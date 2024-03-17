# DefaultApi

All URIs are relative to *https://api.iplocation.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rootGet**](DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="rootGet"></a>
# **rootGet**
```java
Mono<Get200Response> DefaultApi.rootGet(ip_formatdelimiter)
```

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ip** | `String`| An IPv4 or IPv6 address that you would like to lookup. | |
| **_format** | `String`| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional parameter] |
| **delimiter** | `String`| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. | [optional parameter] |


### Return type
[**Get200Response**](Get200Response.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

