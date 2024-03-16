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
	//ip = null;
	//ip_number = null;
	//ip_version = null;
	//country_name = null;
	//country_code2 = null;
	//isp = null;
	//response_code = null;
	//response_message = null;
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
	

		if (isprimitive("AnyType")) {
			jsonToValue(&ip, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&ip);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ip_numberKey = "ip_number";
	node = json_object_get_member(pJsonObject, ip_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&ip_number, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&ip_number);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ip_versionKey = "ip_version";
	node = json_object_get_member(pJsonObject, ip_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&ip_version, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&ip_version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *country_nameKey = "country_name";
	node = json_object_get_member(pJsonObject, country_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&country_name, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&country_name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *country_code2Key = "country_code2";
	node = json_object_get_member(pJsonObject, country_code2Key);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&country_code2, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&country_code2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ispKey = "isp";
	node = json_object_get_member(pJsonObject, ispKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&isp, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&isp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *response_codeKey = "response_code";
	node = json_object_get_member(pJsonObject, response_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&response_code, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&response_code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *response_messageKey = "response_message";
	node = json_object_get_member(pJsonObject, response_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&response_message, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&response_message);
			obj->fromJson(json_to_string(node, false));
			
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
	if (isprimitive("AnyType")) {
		AnyType obj = getIp();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ipKey = "ip";
	json_object_set_member(pJsonObject, ipKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIpNumber();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIpNumber());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ip_numberKey = "ip_number";
	json_object_set_member(pJsonObject, ip_numberKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIpVersion();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIpVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ip_versionKey = "ip_version";
	json_object_set_member(pJsonObject, ip_versionKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getCountryName();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getCountryName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *country_nameKey = "country_name";
	json_object_set_member(pJsonObject, country_nameKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getCountryCode2();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getCountryCode2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *country_code2Key = "country_code2";
	json_object_set_member(pJsonObject, country_code2Key, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getIsp();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getIsp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ispKey = "isp";
	json_object_set_member(pJsonObject, ispKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getResponseCode();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getResponseCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *response_codeKey = "response_code";
	json_object_set_member(pJsonObject, response_codeKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getResponseMessage();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getResponseMessage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

AnyType
__get_200_response::getIp()
{
	return ip;
}

void
__get_200_response::setIp(AnyType  ip)
{
	this->ip = ip;
}

AnyType
__get_200_response::getIpNumber()
{
	return ip_number;
}

void
__get_200_response::setIpNumber(AnyType  ip_number)
{
	this->ip_number = ip_number;
}

AnyType
__get_200_response::getIpVersion()
{
	return ip_version;
}

void
__get_200_response::setIpVersion(AnyType  ip_version)
{
	this->ip_version = ip_version;
}

AnyType
__get_200_response::getCountryName()
{
	return country_name;
}

void
__get_200_response::setCountryName(AnyType  country_name)
{
	this->country_name = country_name;
}

AnyType
__get_200_response::getCountryCode2()
{
	return country_code2;
}

void
__get_200_response::setCountryCode2(AnyType  country_code2)
{
	this->country_code2 = country_code2;
}

AnyType
__get_200_response::getIsp()
{
	return isp;
}

void
__get_200_response::setIsp(AnyType  isp)
{
	this->isp = isp;
}

AnyType
__get_200_response::getResponseCode()
{
	return response_code;
}

void
__get_200_response::setResponseCode(AnyType  response_code)
{
	this->response_code = response_code;
}

AnyType
__get_200_response::getResponseMessage()
{
	return response_message;
}

void
__get_200_response::setResponseMessage(AnyType  response_message)
{
	this->response_message = response_message;
}


