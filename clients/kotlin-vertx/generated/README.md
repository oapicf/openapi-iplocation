# org.openapitools - Kotlin Server library for iplocation.net API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.iplocation.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**rootGet**](docs/DefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.Get200Response](docs/Get200Response.md)
 - [org.openapitools.server.api.model.Get400Response](docs/Get400Response.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

