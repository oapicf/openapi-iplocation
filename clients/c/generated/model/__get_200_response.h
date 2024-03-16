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

#include "any_type.h"



typedef struct __get_200_response_t {
    any_type_t *ip; // custom
    any_type_t *ip_number; // custom
    any_type_t *ip_version; // custom
    any_type_t *country_name; // custom
    any_type_t *country_code2; // custom
    any_type_t *isp; // custom
    any_type_t *response_code; // custom
    any_type_t *response_message; // custom

} __get_200_response_t;

__get_200_response_t *__get_200_response_create(
    any_type_t *ip,
    any_type_t *ip_number,
    any_type_t *ip_version,
    any_type_t *country_name,
    any_type_t *country_code2,
    any_type_t *isp,
    any_type_t *response_code,
    any_type_t *response_message
);

void __get_200_response_free(__get_200_response_t *__get_200_response);

__get_200_response_t *__get_200_response_parseFromJSON(cJSON *__get_200_responseJSON);

cJSON *__get_200_response_convertToJSON(__get_200_response_t *__get_200_response);

#endif /* ___get_200_response_H_ */

