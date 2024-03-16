#ifndef __get_400_response_TEST
#define __get_400_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define __get_400_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/__get_400_response.h"
__get_400_response_t* instantiate___get_400_response(int include_optional);



__get_400_response_t* instantiate___get_400_response(int include_optional) {
  __get_400_response_t* __get_400_response = NULL;
  if (include_optional) {
    __get_400_response = __get_400_response_create(
      null,
      null
    );
  } else {
    __get_400_response = __get_400_response_create(
      null,
      null
    );
  }

  return __get_400_response;
}


#ifdef __get_400_response_MAIN

void test___get_400_response(int include_optional) {
    __get_400_response_t* __get_400_response_1 = instantiate___get_400_response(include_optional);

	cJSON* json__get_400_response_1 = __get_400_response_convertToJSON(__get_400_response_1);
	printf("__get_400_response :\n%s\n", cJSON_Print(json__get_400_response_1));
	__get_400_response_t* __get_400_response_2 = __get_400_response_parseFromJSON(json__get_400_response_1);
	cJSON* json__get_400_response_2 = __get_400_response_convertToJSON(__get_400_response_2);
	printf("repeating __get_400_response:\n%s\n", cJSON_Print(json__get_400_response_2));
}

int main() {
  test___get_400_response(1);
  test___get_400_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // __get_400_response_MAIN
#endif // __get_400_response_TEST
