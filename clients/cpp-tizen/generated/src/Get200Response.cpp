#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "__get_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

__get_200_response::__get_200_response()
{
	//__init();
}

__get_200_response::~__get_200_response()
{
	//__cleanup();
}

void
__get_200_response::__init()
{
	//ip = std::string();
	//ip_number = null;
	//ip_version = int(0);
	//country_name = std::string();
	//country_code2 = std::string();
	//isp = std::string();
	//response_code = std::string();
	//response_message = std::string();
}

void
__get_200_response::__cleanup()
{
	//if(ip != NULL) {
	//
	//delete ip;
	//ip = NULL;
	//}
	//if(ip_number != NULL) {
	//
	//delete ip_number;
	//ip_number = NULL;
	//}
	//if(ip_version != NULL) {
	//
	//delete ip_version;
	//ip_version = NULL;
	//}
	//if(country_name != NULL) {
	//
	//delete country_name;
	//country_name = NULL;
	//}
	//if(country_code2 != NULL) {
	//
	//delete country_code2;
	//country_code2 = NULL;
	//}
	//if(isp != NULL) {
	//
	//delete isp;
	//isp = NULL;
	//}
	//if(response_code != NULL) {
	//
	//delete response_code;
	//response_code = NULL;
	//}
	//if(response_message != NULL) {
	//
	//delete response_message;
	//response_message = NULL;
	//}
	//
}

void
__get_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ipKey = "ip";
	node = json_object_get_member(pJsonObject, ipKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ip, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ip_numberKey = "ip_number";
	node = json_object_get_member(pJsonObject, ip_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("Int64")) {
			jsonToValue(&ip_number, node, "Int64", "Int64");
		} else {
			
			Int64* obj = static_cast<Int64*> (&ip_number);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ip_versionKey = "ip_version";
	node = json_object_get_member(pJsonObject, ip_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&ip_version, node, "int", "");
		} else {
			
		}
	}
	const gchar *country_nameKey = "country_name";
	node = json_object_get_member(pJsonObject, country_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&country_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *country_code2Key = "country_code2";
	node = json_object_get_member(pJsonObject, country_code2Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&country_code2, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ispKey = "isp";
	node = json_object_get_member(pJsonObject, ispKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&isp, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *response_codeKey = "response_code";
	node = json_object_get_member(pJsonObject, response_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&response_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *response_messageKey = "response_message";
	node = json_object_get_member(pJsonObject, response_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&response_message, node, "std::string", "");
		} else {
			
		}
	}
}

__get_200_response::__get_200_response(char* json)
{
	this->fromJson(json);
}

char*
__get_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getIp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ipKey = "ip";
	json_object_set_member(pJsonObject, ipKey, node);
	if (isprimitive("Int64")) {
		Int64 obj = getIpNumber();
		node = converttoJson(&obj, "Int64", "");
	}
	else {
		
		Int64 obj = static_cast<Int64> (getIpNumber());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ip_numberKey = "ip_number";
	json_object_set_member(pJsonObject, ip_numberKey, node);
	if (isprimitive("int")) {
		int obj = getIpVersion();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ip_versionKey = "ip_version";
	json_object_set_member(pJsonObject, ip_versionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCountryName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *country_nameKey = "country_name";
	json_object_set_member(pJsonObject, country_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCountryCode2();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *country_code2Key = "country_code2";
	json_object_set_member(pJsonObject, country_code2Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getIsp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ispKey = "isp";
	json_object_set_member(pJsonObject, ispKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResponseCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_codeKey = "response_code";
	json_object_set_member(pJsonObject, response_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResponseMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *response_messageKey = "response_message";
	json_object_set_member(pJsonObject, response_messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

Int64
__get_200_response::getIpNumber()
{
	return ip_number;
}

void
__get_200_response::setIpNumber(Int64  ip_number)
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


