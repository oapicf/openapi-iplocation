# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for iplocation.net API 1.1.1-pre.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://api.iplocation.nethttps://api.iplocation.net

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*rootGet* | *GET* / | Get geolocation of an IP address.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*__get_200_response* | |
|*__get_400_response* | |

