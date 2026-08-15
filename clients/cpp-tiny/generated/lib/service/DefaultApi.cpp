#include "DefaultApi.h"

using namespace Tiny;



        Response<
            __get_200_response
        >
        DefaultApi::
        rootGet(
            
            std::string ip
            , 
            
            std::string format
            , 
            
            std::string delimiter
            
        )
        {
            std::string url = basepath + "/"; //


            // Headers  | 

            // Query    | ip format delimiter 
            addQueryParam("ip",ip);
            addQueryParam("format",format);
            addQueryParam("delimiter",delimiter);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            __get_200_response obj(output_string);


            Response<__get_200_response> response(obj, httpCode);
            return response;
        }



