#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "__get_400_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

__get_400_response::__get_400_response()
{
	//__init();
}

__get_400_response::~__get_400_response()
{
	//__cleanup();
}

void
__get_400_response::__init()
{
	//response_code = null;
	//response_message = null;
}

void
__get_400_response::__cleanup()
{
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
__get_400_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

__get_400_response::__get_400_response(char* json)
{
	this->fromJson(json);
}

char*
__get_400_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
__get_400_response::getResponseCode()
{
	return response_code;
}

void
__get_400_response::setResponseCode(AnyType  response_code)
{
	this->response_code = response_code;
}

AnyType
__get_400_response::getResponseMessage()
{
	return response_message;
}

void
__get_400_response::setResponseMessage(AnyType  response_message)
{
	this->response_message = response_message;
}


