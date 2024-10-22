# Go API Server for openapi

OpenAPI v3 specification and a set of generated API clients for iplocation.net

## Overview
This server was generated by the [openapi-generator]
(https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate a server stub.
-

To see how to make this your own, look here:

[README](https://openapi-generator.tech)

- API version: 0.9.0-pre.0
- Build date: 2024-07-10T08:32:13.601439932Z[Etc/UTC]
- Generator version: 7.6.0
For more information, please visit [https://github.com/oapicf/openapi-iplocation](https://github.com/oapicf/openapi-iplocation)


### Running the server
To run the server, follow these simple steps:

```
go run main.go
```

To run the server in a docker container
```
docker build --network=host -t openapi .
```

Once image is built use
```
docker run --rm -it openapi
```
