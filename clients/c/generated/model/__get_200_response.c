#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "__get_200_response.h"



__get_200_response_t *__get_200_response_create(
    char *ip,
    int64_t *ip_number,
    int ip_version,
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
        free(__get_200_response->ip);
        __get_200_response->ip = NULL;
    }
    if (__get_200_response->ip_number) {
        int64_free(__get_200_response->ip_number);
        __get_200_response->ip_number = NULL;
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
    cJSON *ip_number_local_JSON = int64_convertToJSON(__get_200_response->ip_number);
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
    if(cJSON_AddNumberToObject(item, "ip_version", __get_200_response->ip_version) == NULL) {
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

    // define the local variable for __get_200_response->ip_number
    int64_t *ip_number_local_nonprim = NULL;

    // __get_200_response->ip
    cJSON *ip = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip");
    if (ip) { 
    if(!cJSON_IsString(ip) && !cJSON_IsNull(ip))
    {
    goto end; //String
    }
    }

    // __get_200_response->ip_number
    cJSON *ip_number = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip_number");
    if (ip_number) { 
    ip_number_local_nonprim = int64_parseFromJSON(ip_number); //custom
    }

    // __get_200_response->ip_version
    cJSON *ip_version = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "ip_version");
    if (ip_version) { 
    if(!cJSON_IsNumber(ip_version))
    {
    goto end; //Numeric
    }
    }

    // __get_200_response->country_name
    cJSON *country_name = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "country_name");
    if (country_name) { 
    if(!cJSON_IsString(country_name) && !cJSON_IsNull(country_name))
    {
    goto end; //String
    }
    }

    // __get_200_response->country_code2
    cJSON *country_code2 = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "country_code2");
    if (country_code2) { 
    if(!cJSON_IsString(country_code2) && !cJSON_IsNull(country_code2))
    {
    goto end; //String
    }
    }

    // __get_200_response->isp
    cJSON *isp = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "isp");
    if (isp) { 
    if(!cJSON_IsString(isp) && !cJSON_IsNull(isp))
    {
    goto end; //String
    }
    }

    // __get_200_response->response_code
    cJSON *response_code = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "response_code");
    if (response_code) { 
    if(!cJSON_IsString(response_code) && !cJSON_IsNull(response_code))
    {
    goto end; //String
    }
    }

    // __get_200_response->response_message
    cJSON *response_message = cJSON_GetObjectItemCaseSensitive(__get_200_responseJSON, "response_message");
    if (response_message) { 
    if(!cJSON_IsString(response_message) && !cJSON_IsNull(response_message))
    {
    goto end; //String
    }
    }


    __get_200_response_local_var = __get_200_response_create (
        ip && !cJSON_IsNull(ip) ? strdup(ip->valuestring) : NULL,
        ip_number ? ip_number_local_nonprim : NULL,
        ip_version ? ip_version->valuedouble : 0,
        country_name && !cJSON_IsNull(country_name) ? strdup(country_name->valuestring) : NULL,
        country_code2 && !cJSON_IsNull(country_code2) ? strdup(country_code2->valuestring) : NULL,
        isp && !cJSON_IsNull(isp) ? strdup(isp->valuestring) : NULL,
        response_code && !cJSON_IsNull(response_code) ? strdup(response_code->valuestring) : NULL,
        response_message && !cJSON_IsNull(response_message) ? strdup(response_message->valuestring) : NULL
        );

    return __get_200_response_local_var;
end:
    if (ip_number_local_nonprim) {
        int64_free(ip_number_local_nonprim);
        ip_number_local_nonprim = NULL;
    }
    return NULL;

}
