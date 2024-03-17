#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DefaultManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DefaultManager::DefaultManager()
{

}

DefaultManager::~DefaultManager()
{

}

static gboolean __DefaultManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DefaultManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DefaultManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool rootGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(__get_200_response, Error, void* )
	= reinterpret_cast<void(*)(__get_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	__get_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("__get_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "__get_200_response", "__get_200_response");
			json_node_free(pJson);

			if ("__get_200_response" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool rootGetHelper(char * accessToken,
	std::string ip, std::string format, std::string delimiter, 
	void(* handler)(__get_200_response, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&ip, "std::string");
	queryParams.insert(pair<string, string>("ip", itemAtq));


	itemAtq = stringify(&format, "std::string");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}


	itemAtq = stringify(&delimiter, "std::string");
	queryParams.insert(pair<string, string>("delimiter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("delimiter");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = rootGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), rootGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::rootGetAsync(char * accessToken,
	std::string ip, std::string format, std::string delimiter, 
	void(* handler)(__get_200_response, Error, void* )
	, void* userData)
{
	return rootGetHelper(accessToken,
	ip, format, delimiter, 
	handler, userData, true);
}

bool DefaultManager::rootGetSync(char * accessToken,
	std::string ip, std::string format, std::string delimiter, 
	void(* handler)(__get_200_response, Error, void* )
	, void* userData)
{
	return rootGetHelper(accessToken,
	ip, format, delimiter, 
	handler, userData, false);
}

