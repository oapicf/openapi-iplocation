#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/__get_200_response.h"
#include "../model/__get_400_response.h"


// Get geolocation of an IP address
//
// Retrieve geolocation of an IP address. 
//
__get_200_response_t*
DefaultAPI_rootGet(apiClient_t *apiClient,  ip ,  format ,  delimiter );


