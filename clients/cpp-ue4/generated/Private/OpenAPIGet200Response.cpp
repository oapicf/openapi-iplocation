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

#include "OpenAPIGet200Response.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGet200Response::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Ip.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ip")); WriteJsonValue(Writer, Ip.GetValue());
	}
	if (IpNumber.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ip_number")); WriteJsonValue(Writer, IpNumber.GetValue());
	}
	if (IpVersion.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ip_version")); WriteJsonValue(Writer, IpVersion.GetValue());
	}
	if (CountryName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("country_name")); WriteJsonValue(Writer, CountryName.GetValue());
	}
	if (CountryCode2.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("country_code2")); WriteJsonValue(Writer, CountryCode2.GetValue());
	}
	if (Isp.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("isp")); WriteJsonValue(Writer, Isp.GetValue());
	}
	if (ResponseCode.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("response_code")); WriteJsonValue(Writer, ResponseCode.GetValue());
	}
	if (ResponseMessage.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("response_message")); WriteJsonValue(Writer, ResponseMessage.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIGet200Response::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ip"), Ip);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ip_number"), IpNumber);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ip_version"), IpVersion);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("country_name"), CountryName);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("country_code2"), CountryCode2);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("isp"), Isp);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("response_code"), ResponseCode);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("response_message"), ResponseMessage);

	return ParseSuccess;
}

}
