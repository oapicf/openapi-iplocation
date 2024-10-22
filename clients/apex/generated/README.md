# iplocation.net API API Client


OpenAPI v3 specification and a set of generated API clients for iplocation.net

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASDefaultApi api = new OASDefaultApi();

Map<String, Object> params = new Map<String, Object>{
    'ip' => 'null',
    'format' => 'null',
    'delimiter' => 'null'
};

try {
    // cross your fingers
    OASGet200Response result = api.rootGet(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.iplocation.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASDefaultApi* | [**rootGet**](OASDefaultApi.md#rootGet) | **GET** / | Get geolocation of an IP address


## Documentation for Models

 - [OASGet200Response](OASGet200Response.md)
 - [OASGet400Response](OASGet400Response.md)


## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com

