

#include "__get_200_response.h"

using namespace Tiny;

__get_200_response::__get_200_response()
{
	ip = std::string();
	ip_number = std::string();
	ip_version = int(0);
	country_name = std::string();
	country_code2 = std::string();
	isp = std::string();
	response_code = std::string();
	response_message = std::string();
}

__get_200_response::__get_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

__get_200_response::~__get_200_response()
{

}

void
__get_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ipKey = "ip";

    if(object.has_key(ipKey))
    {
        bourne::json value = object[ipKey];



        jsonToValue(&ip, value, "std::string");


    }

    const char *ip_numberKey = "ip_number";

    if(object.has_key(ip_numberKey))
    {
        bourne::json value = object[ip_numberKey];



        jsonToValue(&ip_number, value, "std::string");


    }

    const char *ip_versionKey = "ip_version";

    if(object.has_key(ip_versionKey))
    {
        bourne::json value = object[ip_versionKey];



        jsonToValue(&ip_version, value, "int");


    }

    const char *country_nameKey = "country_name";

    if(object.has_key(country_nameKey))
    {
        bourne::json value = object[country_nameKey];



        jsonToValue(&country_name, value, "std::string");


    }

    const char *country_code2Key = "country_code2";

    if(object.has_key(country_code2Key))
    {
        bourne::json value = object[country_code2Key];



        jsonToValue(&country_code2, value, "std::string");


    }

    const char *ispKey = "isp";

    if(object.has_key(ispKey))
    {
        bourne::json value = object[ispKey];



        jsonToValue(&isp, value, "std::string");


    }

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
__get_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["ip"] = getIp();






    object["ip_number"] = getIpNumber();






    object["ip_version"] = getIpVersion();






    object["country_name"] = getCountryName();






    object["country_code2"] = getCountryCode2();






    object["isp"] = getIsp();






    object["response_code"] = getResponseCode();






    object["response_message"] = getResponseMessage();



    return object;

}

std::string
__get_200_response::getIp()
{
	return ip;
}

void
__get_200_response::setIp(std::string  ip)
{
	this->ip = ip;
}

std::string
__get_200_response::getIpNumber()
{
	return ip_number;
}

void
__get_200_response::setIpNumber(std::string  ip_number)
{
	this->ip_number = ip_number;
}

int
__get_200_response::getIpVersion()
{
	return ip_version;
}

void
__get_200_response::setIpVersion(int  ip_version)
{
	this->ip_version = ip_version;
}

std::string
__get_200_response::getCountryName()
{
	return country_name;
}

void
__get_200_response::setCountryName(std::string  country_name)
{
	this->country_name = country_name;
}

std::string
__get_200_response::getCountryCode2()
{
	return country_code2;
}

void
__get_200_response::setCountryCode2(std::string  country_code2)
{
	this->country_code2 = country_code2;
}

std::string
__get_200_response::getIsp()
{
	return isp;
}

void
__get_200_response::setIsp(std::string  isp)
{
	this->isp = isp;
}

std::string
__get_200_response::getResponseCode()
{
	return response_code;
}

void
__get_200_response::setResponseCode(std::string  response_code)
{
	this->response_code = response_code;
}

std::string
__get_200_response::getResponseMessage()
{
	return response_message;
}

void
__get_200_response::setResponseMessage(std::string  response_message)
{
	this->response_message = response_message;
}



