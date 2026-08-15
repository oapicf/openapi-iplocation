#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "__get_200_response.h"
#include "__get_400_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi();

    /**
    * Get geolocation of an IP address.
    *
    * Retrieve geolocation of an IP address. 
    * \param ip An IPv4 or IPv6 address that you would like to lookup. *Required*
    * \param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
    * \param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
    */
    Response<
                __get_200_response
        >
    rootGet(
            
            std::string ip
            , 
            
            std::string format
            , 
            
            std::string delimiter
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */