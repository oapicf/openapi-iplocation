# Org.OpenAPITools - Azure Functions v4 Server

OpenAPI v3 specification and a set of generated API clients for iplocation.net

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:8080 org.openapitools
```
