/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * OpenAPI spec version: 1.1.1-pre.0
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
 * OpenAPIGet200Response
 *
 * 
 */
class OPENAPI_API OpenAPIGet200Response : public Model
{
public:
    virtual ~OpenAPIGet200Response() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* IPv4 or IPv6 address used to lookup geolocation. */
	TOptional<FString> Ip;
	/* IP number in long integer (represented as string). */
	TOptional<FString> IpNumber;
	/* IP version either 4 or 6. */
	TOptional<int32> IpVersion;
	/* Full name of the IP country. */
	TOptional<FString> CountryName;
	/* ISO ALPHA-2 Country Code. */
	TOptional<FString> CountryCode2;
	/* Internet Service Provider (ISP) who owns the IP address. */
	TOptional<FString> Isp;
	/* Response status code to indicate success or failed completion of the API call. */
	TOptional<FString> ResponseCode;
	/* Response message to indicate success or failed completion of the API call. */
	TOptional<FString> ResponseMessage;
};

}
