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




typedef struct __get_400_response_t {
    char *response_code; // string
    char *response_message; // string

} __get_400_response_t;

__get_400_response_t *__get_400_response_create(
    char *response_code,
    char *response_message
);

void __get_400_response_free(__get_400_response_t *__get_400_response);

__get_400_response_t *__get_400_response_parseFromJSON(cJSON *__get_400_responseJSON);

cJSON *__get_400_response_convertToJSON(__get_400_response_t *__get_400_response);

#endif /* ___get_400_response_H_ */

