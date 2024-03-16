#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "__get_200_response.h"



__get_200_response_t *__get_200_response_create(
    any_type_t *ip,
    any_type_t *ip_number,
    any_type_t *ip_version,
    any_type_t *country_name,
    any_type_t *country_code2,
    any_type_t *isp,
    any_type_t *response_code,
    any_type_t *response_message
    ) {
    __get_200_response_t *__get_200_response_local_var = malloc(sizeof(__get_200_response_t));
    if (!__get_200_response_local_var) {
        return NULL;
    }
    __get_200_response_local_var->ip = ip;
    __get_200_response_local_var->ip_number = ip_number;
    __get_200_response_local_var->ip_version = ip_version;
    __get_200_response_local_var->country_name = country_name;
    __get_200_response_local_var->country_code2 = country_code2;
    __get_200_response_local_var->isp = isp;
    __get_200_response_local_var->response_code = response_code;
    __get_200_response_local_var->response_message = response_message;

    return __get_200_response_local_var;
}


void __get_200_response_free(__get_200_response_t *__get_200_response) {
    if(NULL == __get_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (__get_200_response->ip) {
        _free(__get_200_response->ip);
        __get_200_response->ip = NULL;
    }
    if (__get_200_response->ip_number) {
        _free(__get_200_response->ip_number);
        __get_200_response->ip_number = NULL;
    }
    if (__get_200_response->ip_version) {
        _free(__get_200_response->ip_version);
        __get_200_response->ip_version = NULL;
    }
    if (__get_200_response->country_name) {
        _free(__get_200_response->country_name);
        __get_200_response->country_name = NULL;
    }
    if (__get_200_response->country_code2) {
        _free(__get_200_response->country_code2);
        __get_200_response->country_code2 = NULL;
    }
    if (__get_200_response->isp) {
        _free(__get_200_response->isp);
        __get_200_response->isp = NULL;
    }
    if (__get_200_response->response_code) {
        _free(__get_200_response->response_code);
        __get_200_response->response_code = NULL;
    }
    if (__get_200_response->response_message) {
        _free(__get_200_response->response_message);
        __get_200_response->response_message = NULL;
    }
    free(__get_200_response);
}

cJSON *__get_200_response_convertToJSON(__get_200_response_t *__get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // __get_200_response->ip
    if(__get_200_response->ip) {
    cJSON *ip_local_JSON = _convertToJSON(__get_200_response->ip);
    if(ip_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "ip", ip_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->ip_number
    if(__get_200_response->ip_number) {
    cJSON *ip_number_local_JSON = _convertToJSON(__get_200_response->ip_number);
    if(ip_number_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "ip_number", ip_number_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->ip_version
    if(__get_200_response->ip_version) {
    cJSON *ip_version_local_JSON = _convertToJSON(__get_200_response->ip_version);
    if(ip_version_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "ip_version", ip_version_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->country_name
    if(__get_200_response->country_name) {
    cJSON *country_name_local_JSON = _convertToJSON(__get_200_response->country_name);
    if(country_name_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country_name", country_name_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->country_code2
    if(__get_200_response->country_code2) {
    cJSON *country_code2_local_JSON = _convertToJSON(__get_200_response->country_code2);
    if(country_code2_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "country_code2", country_code2_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->isp
    if(__get_200_response->isp) {
    cJSON *isp_local_JSON = _convertToJSON(__get_200_response->isp);
    if(isp_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "isp", isp_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->response_code
    if(__get_200_response->response_code) {
    cJSON *response_code_local_JSON = _convertToJSON(__get_200_response->response_code);
    if(response_code_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "response_code", response_code_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // __get_200_response->response_message
    if(__get_200_response->response_message) {
    cJSON *response_message_local_JSON = _convertToJSON(__get_200_response->response_message);
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

__get_200_response_t *__get_200_response_parseFromJSON(cJSON *__get_200_responseJSON){

    __get_200_response_t *__get_200_response_local_var = NULL;

    // define the local variable for __get_200_response->ip
    _t *ip_local_nonprim = NULL;

    // define the local variable for __get_200_response->ip_number
    _t *ip_number_local_nonprim = NULL;

    // define the local variable for __get_200_response->ip_version
    _t *ip_version_local_nonprim = NULL;

    // define the local variable for __get_200_response->country_name
    _t *country_name_local_nonprim = NULL;

    // define the local variable for __get_200_response->country_code2
    _t *country_code2_local_nonprim = NULL;

    // define the local variable for __get_200_response->isp
    _t *isp_local_nonprim = NULL;

    // define the local variable for __get_200_response->response_code
    _t *response_code_local_nonprim = NULL;

    // define the local variable for __get_200_response->response_message
    _t *response_message_local_nonprim = NULL;

    // __get_200_response->ip
    cJSON *ip = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip");
    if (ip) { 
    ip_local_nonprim = _parseFromJSON(ip); //custom
    }

    // __get_200_response->ip_number
    cJSON *ip_number = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip_number");
    if (ip_number) { 
    ip_number_local_nonprim = _parseFromJSON(ip_number); //custom
    }

    // __get_200_response->ip_version
    cJSON *ip_version = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip_version");
    if (ip_version) { 
    ip_version_local_nonprim = _parseFromJSON(ip_version); //custom
    }

    // __get_200_response->country_name
    cJSON *country_name = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "country_name");
    if (country_name) { 
    country_name_local_nonprim = _parseFromJSON(country_name); //custom
    }

    // __get_200_response->country_code2
    cJSON *country_code2 = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "country_code2");
    if (country_code2) { 
    country_code2_local_nonprim = _parseFromJSON(country_code2); //custom
    }

    // __get_200_response->isp
    cJSON *isp = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "isp");
    if (isp) { 
    isp_local_nonprim = _parseFromJSON(isp); //custom
    }

    // __get_200_response->response_code
    cJSON *response_code = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "response_code");
    if (response_code) { 
    response_code_local_nonprim = _parseFromJSON(response_code); //custom
    }

    // __get_200_response->response_message
    cJSON *response_message = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "response_message");
    if (response_message) { 
    response_message_local_nonprim = _parseFromJSON(response_message); //custom
    }


    __get_200_response_local_var = __get_200_response_create (
        ip ? ip_local_nonprim : NULL,
        ip_number ? ip_number_local_nonprim : NULL,
        ip_version ? ip_version_local_nonprim : NULL,
        country_name ? country_name_local_nonprim : NULL,
        country_code2 ? country_code2_local_nonprim : NULL,
        isp ? isp_local_nonprim : NULL,
        response_code ? response_code_local_nonprim : NULL,
        response_message ? response_message_local_nonprim : NULL
        );

    return __get_200_response_local_var;
end:
    if (ip_local_nonprim) {
        _free(ip_local_nonprim);
        ip_local_nonprim = NULL;
    }
    if (ip_number_local_nonprim) {
        _free(ip_number_local_nonprim);
        ip_number_local_nonprim = NULL;
    }
    if (ip_version_local_nonprim) {
        _free(ip_version_local_nonprim);
        ip_version_local_nonprim = NULL;
    }
    if (country_name_local_nonprim) {
        _free(country_name_local_nonprim);
        country_name_local_nonprim = NULL;
    }
    if (country_code2_local_nonprim) {
        _free(country_code2_local_nonprim);
        country_code2_local_nonprim = NULL;
    }
    if (isp_local_nonprim) {
        _free(isp_local_nonprim);
        isp_local_nonprim = NULL;
    }
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
