/*
 * __get_200_response.h
 *
 * 
 */

#ifndef ___get_200_response_H_
#define ___get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct __get_200_response_t __get_200_response_t;




typedef struct __get_200_response_t {
    char *ip; // string
    char *ip_number; // string
    int ip_version; //numeric
    char *country_name; // string
    char *country_code2; // string
    char *isp; // string
    char *response_code; // string
    char *response_message; // string

} __get_200_response_t;

__get_200_response_t *__get_200_response_create(
    char *ip,
    char *ip_number,
    int ip_version,
    char *country_name,
    char *country_code2,
    char *isp,
    char *response_code,
    char *response_message
);

void __get_200_response_free(__get_200_response_t *__get_200_response);

__get_200_response_t *__get_200_response_parseFromJSON(cJSON *__get_200_responseJSON);

cJSON *__get_200_response_convertToJSON(__get_200_response_t *__get_200_response);

#endif /* ___get_200_response_H_ */

