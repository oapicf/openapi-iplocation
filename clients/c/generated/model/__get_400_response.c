#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "__get_400_response.h"



static __get_400_response_t *__get_400_response_create_internal(
    char *response_code,
    char *response_message
    ) {
    __get_400_response_t *__get_400_response_local_var = malloc(sizeof(__get_400_response_t));
    if (!__get_400_response_local_var) {
        return NULL;
    }
    memset(__get_400_response_local_var, 0, sizeof(__get_400_response_t));
    __get_400_response_local_var->_library_owned = 1;
    __get_400_response_local_var->response_code = response_code;
    __get_400_response_local_var->response_message = response_message;
    return __get_400_response_local_var;
}

__attribute__((deprecated)) __get_400_response_t *__get_400_response_create(
    char *response_code,
    char *response_message
    ) {
    __get_400_response_t *result = __get_400_response_create_internal (
        response_code,
        response_message
        );
    if (!result) {
    }
    return result;
}

void __get_400_response_free(__get_400_response_t *__get_400_response) {
    if(NULL == __get_400_response){
        return ;
    }
    if(__get_400_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "__get_400_response_free");
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

    char *response_code_local_str = NULL;

    char *response_message_local_str = NULL;

    // __get_400_response->response_code
    cJSON *response_code = cJSON_GetObjectItemCaseSensitive(__get_400_responseJSON, "response_code");
    if (cJSON_IsNull(response_code)) {
        response_code = NULL;
    }
    if (response_code) { 
    if(!cJSON_IsString(response_code) && !cJSON_IsNull(response_code))
    {
    goto end; //String
    }
    }

    // __get_400_response->response_message
    cJSON *response_message = cJSON_GetObjectItemCaseSensitive(__get_400_responseJSON, "response_message");
    if (cJSON_IsNull(response_message)) {
        response_message = NULL;
    }
    if (response_message) { 
    if(!cJSON_IsString(response_message) && !cJSON_IsNull(response_message))
    {
    goto end; //String
    }
    }


    if (response_code && !cJSON_IsNull(response_code)) response_code_local_str = strdup(response_code->valuestring);
    if (response_message && !cJSON_IsNull(response_message)) response_message_local_str = strdup(response_message->valuestring);

    __get_400_response_local_var = __get_400_response_create_internal (
        response_code_local_str,
        response_message_local_str
        );

    if (!__get_400_response_local_var) {
        goto end;
    }

    return __get_400_response_local_var;
end:
    if (response_code_local_str) {
        free(response_code_local_str);
        response_code_local_str = NULL;
    }
    if (response_message_local_str) {
        free(response_message_local_str);
        response_message_local_str = NULL;
    }
    return NULL;

}
