/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPIGet400Response
 *
 * 
 */
class OPENAPI_API OpenAPIGet400Response : public Model
{
public:
    virtual ~OpenAPIGet400Response() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Response status code to indicate success or failed completion of the API call. */
	TOptional<FString> ResponseCode;
	/* Response message to indicate success or failed completion of the API call. */
	TOptional<FString> ResponseMessage;
};

}
