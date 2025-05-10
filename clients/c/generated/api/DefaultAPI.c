#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "DefaultAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096


// Get geolocation of an IP address
//
// Retrieve geolocation of an IP address. 
//
__get_200_response_t*
DefaultAPI_rootGet(apiClient_t *apiClient, char *ip, char *format, char *delimiter)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/");





    // query parameters
    char *keyQuery_ip = NULL;
    char * valueQuery_ip = NULL;
    keyValuePair_t *keyPairQuery_ip = 0;
    if (ip)
    {
        keyQuery_ip = strdup("ip");
        valueQuery_ip = strdup((ip));
        keyPairQuery_ip = keyValuePair_create(keyQuery_ip, valueQuery_ip);
        list_addElement(localVarQueryParameters,keyPairQuery_ip);
    }

    // query parameters
    char *keyQuery_format = NULL;
    char * valueQuery_format = NULL;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = strdup((format));
        keyPairQuery_format = keyValuePair_create(keyQuery_format, valueQuery_format);
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // query parameters
    char *keyQuery_delimiter = NULL;
    char * valueQuery_delimiter = NULL;
    keyValuePair_t *keyPairQuery_delimiter = 0;
    if (delimiter)
    {
        keyQuery_delimiter = strdup("delimiter");
        valueQuery_delimiter = strdup((delimiter));
        keyPairQuery_delimiter = keyValuePair_create(keyQuery_delimiter, valueQuery_delimiter);
        list_addElement(localVarQueryParameters,keyPairQuery_delimiter);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Successfully processed the request.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Failed to complete the request.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Command not found.");
    //}
    //nonprimitive not container
    __get_200_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = __get_200_response_parseFromJSON(DefaultAPIlocalVarJSON);
        cJSON_Delete(DefaultAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_ip){
        free(keyQuery_ip);
        keyQuery_ip = NULL;
    }
    if(valueQuery_ip){
        free(valueQuery_ip);
        valueQuery_ip = NULL;
    }
    if(keyPairQuery_ip){
        keyValuePair_free(keyPairQuery_ip);
        keyPairQuery_ip = NULL;
    }
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(valueQuery_format){
        free(valueQuery_format);
        valueQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    if(keyQuery_delimiter){
        free(keyQuery_delimiter);
        keyQuery_delimiter = NULL;
    }
    if(valueQuery_delimiter){
        free(valueQuery_delimiter);
        valueQuery_delimiter = NULL;
    }
    if(keyPairQuery_delimiter){
        keyValuePair_free(keyPairQuery_delimiter);
        keyPairQuery_delimiter = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

