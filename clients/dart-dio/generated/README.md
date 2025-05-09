# openapi (EXPERIMENTAL)
OpenAPI v3 specification and a set of generated API clients for iplocation.net

This Dart package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.1.1-pre.0
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.DartDioClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-iplocation](https://github.com/oapicf/openapi-iplocation)

## Requirements

* Dart 2.15.0+ or Flutter 2.8.0+
* Dio 5.0.0+ (https://pub.dev/packages/dio)

## Installation & Usage

### pub.dev
To use the package from [pub.dev](https://pub.dev), please include the following in pubspec.yaml
```yaml
dependencies:
  openapi: 1.0.0
```

### Github
If this Dart package is published to Github, please include the following in pubspec.yaml
```yaml
dependencies:
  openapi:
    git:
      url: https://github.com/oapicf/openapi-iplocation.git
      #ref: main
```

### Local development
To use the package from your local drive, please include the following in pubspec.yaml
```yaml
dependencies:
  openapi:
    path: /path/to/openapi
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:openapi/openapi.dart';


final api = Openapi().getDefaultApi();
final String ip = ip_example; // String | An IPv4 or IPv6 address that you would like to lookup.
final String format = format_example; // String | Output format, the following formats are supported: plain xml json jsonp php csv serialized
final String delimiter = delimiter_example; // String | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".

try {
    final response = await api.rootGet(ip, format, delimiter);
    print(response);
} catch on DioException (e) {
    print("Exception when calling DefaultApi->rootGet: $e\n");
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.iplocation.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
[*DefaultApi*](doc/DefaultApi.md) | [**rootGet**](doc/DefaultApi.md#rootget) | **GET** / | Get geolocation of an IP address


## Documentation For Models

 - [Get200Response](doc/Get200Response.md)
 - [Get400Response](doc/Get400Response.md)


## Documentation For Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com

