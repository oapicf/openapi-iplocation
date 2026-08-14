#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "__get_200_response.h"



static __get_200_response_t *__get_200_response_create_internal(
    char *ip,
    char *ip_number,
    int *ip_version,
    char *country_name,
    char *country_code2,
    char *isp,
    char *response_code,
    char *response_message
    ) {
    __get_200_response_t *__get_200_response_local_var = malloc(sizeof(__get_200_response_t));
    if (!__get_200_response_local_var) {
        return NULL;
    }
    memset(__get_200_response_local_var, 0, sizeof(__get_200_response_t));
    __get_200_response_local_var->_library_owned = 1;
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

__attribute__((deprecated)) __get_200_response_t *__get_200_response_create(
    char *ip,
    char *ip_number,
    int *ip_version,
    char *country_name,
    char *country_code2,
    char *isp,
    char *response_code,
    char *response_message
    ) {
    int *ip_version_copy = NULL;
    if (ip_version) {
        ip_version_copy = malloc(sizeof(int));
        if (ip_version_copy) *ip_version_copy = *ip_version;
    }
    __get_200_response_t *result = __get_200_response_create_internal (
        ip,
        ip_number,
        ip_version_copy,
        country_name,
        country_code2,
        isp,
        response_code,
        response_message
        );
    if (!result) {
        free(ip_version_copy);
    }
    return result;
}

void __get_200_response_free(__get_200_response_t *__get_200_response) {
    if(NULL == __get_200_response){
        return ;
    }
    if(__get_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "__get_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (__get_200_response->ip) {
        free(__get_200_response->ip);
        __get_200_response->ip = NULL;
    }
    if (__get_200_response->ip_number) {
        free(__get_200_response->ip_number);
        __get_200_response->ip_number = NULL;
    }
    if (__get_200_response->ip_version) {
        free(__get_200_response->ip_version);
        __get_200_response->ip_version = NULL;
    }
    if (__get_200_response->country_name) {
        free(__get_200_response->country_name);
        __get_200_response->country_name = NULL;
    }
    if (__get_200_response->country_code2) {
        free(__get_200_response->country_code2);
        __get_200_response->country_code2 = NULL;
    }
    if (__get_200_response->isp) {
        free(__get_200_response->isp);
        __get_200_response->isp = NULL;
    }
    if (__get_200_response->response_code) {
        free(__get_200_response->response_code);
        __get_200_response->response_code = NULL;
    }
    if (__get_200_response->response_message) {
        free(__get_200_response->response_message);
        __get_200_response->response_message = NULL;
    }
    free(__get_200_response);
}

cJSON *__get_200_response_convertToJSON(__get_200_response_t *__get_200_response) {
    cJSON *item = cJSON_CreateObject();

    // __get_200_response->ip
    if(__get_200_response->ip) {
    if(cJSON_AddStringToObject(item, "ip", __get_200_response->ip) == NULL) {
    goto fail; //String
    }
    }


    // __get_200_response->ip_number
    if(__get_200_response->ip_number) {
    if(cJSON_AddStringToObject(item, "ip_number", __get_200_response->ip_number) == NULL) {
    goto fail; //String
    }
    }


    // __get_200_response->ip_version
    if(__get_200_response->ip_version) {
    if(cJSON_AddNumberToObject(item, "ip_version", *__get_200_response->ip_version) == NULL) {
    goto fail; //Numeric
    }
    }


    // __get_200_response->country_name
    if(__get_200_response->country_name) {
    if(cJSON_AddStringToObject(item, "country_name", __get_200_response->country_name) == NULL) {
    goto fail; //String
    }
    }


    // __get_200_response->country_code2
    if(__get_200_response->country_code2) {
    if(cJSON_AddStringToObject(item, "country_code2", __get_200_response->country_code2) == NULL) {
    goto fail; //String
    }
    }


    // __get_200_response->isp
    if(__get_200_response->isp) {
    if(cJSON_AddStringToObject(item, "isp", __get_200_response->isp) == NULL) {
    goto fail; //String
    }
    }


    // __get_200_response->response_code
    if(__get_200_response->response_code) {
    if(cJSON_AddStringToObject(item, "response_code", __get_200_response->response_code) == NULL) {
    goto fail; //String
    }
    }


    // __get_200_response->response_message
    if(__get_200_response->response_message) {
    if(cJSON_AddStringToObject(item, "response_message", __get_200_response->response_message) == NULL) {
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

__get_200_response_t *__get_200_response_parseFromJSON(cJSON *__get_200_responseJSON){

    __get_200_response_t *__get_200_response_local_var = NULL;

    char *ip_local_str = NULL;

    char *ip_number_local_str = NULL;

    // define the local variable for __get_200_response->ip_version
    int *ip_version_local_var = NULL;

    char *country_name_local_str = NULL;

    char *country_code2_local_str = NULL;

    char *isp_local_str = NULL;

    char *response_code_local_str = NULL;

    char *response_message_local_str = NULL;

    // __get_200_response->ip
    cJSON *ip = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip");
    if (cJSON_IsNull(ip)) {
        ip = NULL;
    }
    if (ip) { 
    if(!cJSON_IsString(ip) && !cJSON_IsNull(ip))
    {
    goto end; //String
    }
    }

    // __get_200_response->ip_number
    cJSON *ip_number = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip_number");
    if (cJSON_IsNull(ip_number)) {
        ip_number = NULL;
    }
    if (ip_number) { 
    if(!cJSON_IsString(ip_number) && !cJSON_IsNull(ip_number))
    {
    goto end; //String
    }
    }

    // __get_200_response->ip_version
    cJSON *ip_version = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip_version");
    if (cJSON_IsNull(ip_version)) {
        ip_version = NULL;
    }
    if (ip_version) { 
    if(!cJSON_IsNumber(ip_version))
    {
    goto end; //Numeric
    }
    ip_version_local_var = malloc(sizeof(int));
    if(!ip_version_local_var)
    {
        goto end;
    }
    *ip_version_local_var = ip_version->valuedouble;
    }

    // __get_200_response->country_name
    cJSON *country_name = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "country_name");
    if (cJSON_IsNull(country_name)) {
        country_name = NULL;
    }
    if (country_name) { 
    if(!cJSON_IsString(country_name) && !cJSON_IsNull(country_name))
    {
    goto end; //String
    }
    }

    // __get_200_response->country_code2
    cJSON *country_code2 = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "country_code2");
    if (cJSON_IsNull(country_code2)) {
        country_code2 = NULL;
    }
    if (country_code2) { 
    if(!cJSON_IsString(country_code2) && !cJSON_IsNull(country_code2))
    {
    goto end; //String
    }
    }

    // __get_200_response->isp
    cJSON *isp = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "isp");
    if (cJSON_IsNull(isp)) {
        isp = NULL;
    }
    if (isp) { 
    if(!cJSON_IsString(isp) && !cJSON_IsNull(isp))
    {
    goto end; //String
    }
    }

    // __get_200_response->response_code
    cJSON *response_code = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "response_code");
    if (cJSON_IsNull(response_code)) {
        response_code = NULL;
    }
    if (response_code) { 
    if(!cJSON_IsString(response_code) && !cJSON_IsNull(response_code))
    {
    goto end; //String
    }
    }

    // __get_200_response->response_message
    cJSON *response_message = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "response_message");
    if (cJSON_IsNull(response_message)) {
        response_message = NULL;
    }
    if (response_message) { 
    if(!cJSON_IsString(response_message) && !cJSON_IsNull(response_message))
    {
    goto end; //String
    }
    }


    if (ip && !cJSON_IsNull(ip)) ip_local_str = strdup(ip->valuestring);
    if (ip_number && !cJSON_IsNull(ip_number)) ip_number_local_str = strdup(ip_number->valuestring);
    if (country_name && !cJSON_IsNull(country_name)) country_name_local_str = strdup(country_name->valuestring);
    if (country_code2 && !cJSON_IsNull(country_code2)) country_code2_local_str = strdup(country_code2->valuestring);
    if (isp && !cJSON_IsNull(isp)) isp_local_str = strdup(isp->valuestring);
    if (response_code && !cJSON_IsNull(response_code)) response_code_local_str = strdup(response_code->valuestring);
    if (response_message && !cJSON_IsNull(response_message)) response_message_local_str = strdup(response_message->valuestring);

    __get_200_response_local_var = __get_200_response_create_internal (
        ip_local_str,
        ip_number_local_str,
        ip_version_local_var,
        country_name_local_str,
        country_code2_local_str,
        isp_local_str,
        response_code_local_str,
        response_message_local_str
        );

    if (!__get_200_response_local_var) {
        goto end;
    }

    return __get_200_response_local_var;
end:
    if (ip_local_str) {
        free(ip_local_str);
        ip_local_str = NULL;
    }
    if (ip_number_local_str) {
        free(ip_number_local_str);
        ip_number_local_str = NULL;
    }
    if (ip_version_local_var) {
        free(ip_version_local_var);
        ip_version_local_var = NULL;
    }
    if (country_name_local_str) {
        free(country_name_local_str);
        country_name_local_str = NULL;
    }
    if (country_code2_local_str) {
        free(country_code2_local_str);
        country_code2_local_str = NULL;
    }
    if (isp_local_str) {
        free(isp_local_str);
        isp_local_str = NULL;
    }
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
