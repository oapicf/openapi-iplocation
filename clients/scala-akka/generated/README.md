# openapi-client

iplocation.net API
- API version: 0.9.0-pre.0
  - Generator version: 7.4.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  For more information, please visit [https://github.com/oapicf/openapi-iplocation](https://github.com/oapicf/openapi-iplocation)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "org.openapitools" % "openapi-client" % "1.0.0"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```scala

import org.openapitools.client.core._
import org.openapitools.client.model._
import org.openapitools.client.api.DefaultApi

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object DefaultApiExample extends App {

    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    // Create invoker to execute requests
    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://api.iplocation.net")
    val ip: String = ip_example // String | An IPv4 or IPv6 address that you would like to lookup.

    val format: String = format_example // String | Output format, the following formats are supported: plain xml json jsonp php csv serialized

    val delimiter: String = delimiter_example // String | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".

    val request = apiInstance.rootGet(ip, format, delimiter)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(org.openapitools.client.core.ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")

        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#rootGet")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) =>
            System.err.println("Exception when calling DefaultApi#rootGet")
            exception.printStackTrace();
    }

}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.iplocation.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**rootGet**](docs/DefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address


## Documentation for Models

 - [Get200Response](docs/Get200Response.md)
 - [Get400Response](docs/Get400Response.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
