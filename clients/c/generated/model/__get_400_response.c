#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "__get_400_response.h"



__get_400_response_t *__get_400_response_create(
    char *response_code,
    char *response_message
    ) {
    __get_400_response_t *__get_400_response_local_var = malloc(sizeof(__get_400_response_t));
    if (!__get_400_response_local_var) {
        return NULL;
    }
    __get_400_response_local_var->response_code = response_code;
    __get_400_response_local_var->response_message = response_message;

    return __get_400_response_local_var;
}


void __get_400_response_free(__get_400_response_t *__get_400_response) {
    if(NULL == __get_400_response){
        return ;
    }
    listEntry_t *listEntry;
    if (__get_400_response->response_code) {
        free(__get_400_response->response_code);
        __get_400_response->response_code = NULL;
    }
    if (__get_400_response->response_message) {
        free(__get_400_response->response_message);
        __get_400_response->response_message = NULL;
    }
    free(__get_400_response);
}

cJSON *__get_400_response_convertToJSON(__get_400_response_t *__get_400_response) {
    cJSON *item = cJSON_CreateObject();

    // __get_400_response->response_code
    if(__get_400_response->response_code) {
    if(cJSON_AddStringToObject(item, "response_code", __get_400_response->response_code) == NULL) {
    goto fail; //String
    }
    }


    // __get_400_response->response_message
    if(__get_400_response->response_message) {
    if(cJSON_AddStringToObject(item, "response_message", __get_400_response->response_message) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

__get_400_response_t *__get_400_response_parseFromJSON(cJSON *__get_400_responseJSON){

    __get_400_response_t *__get_400_response_local_var = NULL;

    // __get_400_response->response_code
    cJSON *response_code = cJSON_GetObjectItemCaseSensitive(__get_400_responseJSON, "response_code");
    if (response_code) { 
    if(!cJSON_IsString(response_code) && !cJSON_IsNull(response_code))
    {
    goto end; //String
    }
    }

    // __get_400_response->response_message
    cJSON *response_message = cJSON_GetObjectItemCaseSensitive(__get_400_responseJSON, "response_message");
    if (response_message) { 
    if(!cJSON_IsString(response_message) && !cJSON_IsNull(response_message))
    {
    goto end; //String
    }
    }


    __get_400_response_local_var = __get_400_response_create (
        response_code && !cJSON_IsNull(response_code) ? strdup(response_code->valuestring) : NULL,
        response_message && !cJSON_IsNull(response_message) ? strdup(response_message->valuestring) : NULL
        );

    return __get_400_response_local_var;
end:
    return NULL;

}
