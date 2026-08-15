

#include "__get_400_response.h"

using namespace Tiny;

__get_400_response::__get_400_response()
{
	response_code = std::string();
	response_message = std::string();
}

__get_400_response::__get_400_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

__get_400_response::~__get_400_response()
{

}

void
__get_400_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *response_codeKey = "response_code";

    if(object.has_key(response_codeKey))
    {
        bourne::json value = object[response_codeKey];



        jsonToValue(&response_code, value, "std::string");


    }

    const char *response_messageKey = "response_message";

    if(object.has_key(response_messageKey))
    {
        bourne::json value = object[response_messageKey];



        jsonToValue(&response_message, value, "std::string");


    }


}

bourne::json
__get_400_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["response_code"] = getResponseCode();






    object["response_message"] = getResponseMessage();



    return object;

}

std::string
__get_400_response::getResponseCode()
{
	return response_code;
}

void
__get_400_response::setResponseCode(std::string  response_code)
{
	this->response_code = response_code;
}

std::string
__get_400_response::getResponseMessage()
{
	return response_message;
}

void
__get_400_response::setResponseMessage(std::string  response_message)
{
	this->response_message = response_message;
}



