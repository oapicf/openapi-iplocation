#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "__get_400_response.h"



__get_400_response_t *__get_400_response_create(
    any_type_t *response_code,
    any_type_t *response_message
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
        _free(__get_400_response->response_code);
        __get_400_response->response_code = NULL;
    }
    if (__get_400_response->response_message) {
        _free(__get_400_response->response_message);
        __get_400_response->response_message = NULL;
    }
    free(__get_400_response);
}

cJSON *__get_400_response_convertToJSON(__get_400_response_t *__get_400_response) {
    cJSON *item = cJSON_CreateObject();

    // __get_400_response->response_code
    if(__get_400_response->response_code) {
    cJSON *response_code_local_JSON = _convertToJSON(__get_400_response->response_code);
    if(response_code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "response_code", response_code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_400_response->response_message
    if(__get_400_response->response_message) {
    cJSON *response_message_local_JSON = _convertToJSON(__get_400_response->response_message);
    if(response_message_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "response_message", response_message_local_JSON);
    if(item->child == NULL) {
        goto fail;
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

    // define the local variable for __get_400_response->response_code
    _t *response_code_local_nonprim = NULL;

    // define the local variable for __get_400_response->response_message
    _t *response_message_local_nonprim = NULL;

    // __get_400_response->response_code
    cJSON *response_code = cJSON_GetObjectItemCaseSensitive(__get_400_responseJSON, "response_code");
    if (response_code) { 
    response_code_local_nonprim = _parseFromJSON(response_code); //custom
    }

    // __get_400_response->response_message
    cJSON *response_message = cJSON_GetObjectItemCaseSensitive(__get_400_responseJSON, "response_message");
    if (response_message) { 
    response_message_local_nonprim = _parseFromJSON(response_message); //custom
    }


    __get_400_response_local_var = __get_400_response_create (
        response_code ? response_code_local_nonprim : NULL,
        response_message ? response_message_local_nonprim : NULL
        );

    return __get_400_response_local_var;
end:
    if (response_code_local_nonprim) {
        _free(response_code_local_nonprim);
        response_code_local_nonprim = NULL;
    }
    if (response_message_local_nonprim) {
        _free(response_message_local_nonprim);
        response_message_local_nonprim = NULL;
    }
    return NULL;

}
