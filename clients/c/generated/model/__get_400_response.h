/*
 * __get_400_response.h
 *
 * 
 */

#ifndef ___get_400_response_H_
#define ___get_400_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct __get_400_response_t __get_400_response_t;

#include "any_type.h"



typedef struct __get_400_response_t {
    any_type_t *response_code; // custom
    any_type_t *response_message; // custom

} __get_400_response_t;

__get_400_response_t *__get_400_response_create(
    any_type_t *response_code,
    any_type_t *response_message
);

void __get_400_response_free(__get_400_response_t *__get_400_response);

__get_400_response_t *__get_400_response_parseFromJSON(cJSON *__get_400_responseJSON);

cJSON *__get_400_response_convertToJSON(__get_400_response_t *__get_400_response);

#endif /* ___get_400_response_H_ */

