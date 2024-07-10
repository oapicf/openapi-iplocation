/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "__get_400_response.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

__get_400_response::__get_400_response()
{
    m_Response_code = "";
    m_Response_codeIsSet = false;
    m_Response_message = "";
    m_Response_messageIsSet = false;
    
}

void __get_400_response::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool __get_400_response::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool __get_400_response::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "__get_400_response" : pathPrefix;

            
    return success;
}

bool __get_400_response::operator==(const __get_400_response& rhs) const
{
    return
    
    
    
    ((!responseCodeIsSet() && !rhs.responseCodeIsSet()) || (responseCodeIsSet() && rhs.responseCodeIsSet() && getResponseCode() == rhs.getResponseCode())) &&
    
    
    ((!responseMessageIsSet() && !rhs.responseMessageIsSet()) || (responseMessageIsSet() && rhs.responseMessageIsSet() && getResponseMessage() == rhs.getResponseMessage()))
    
    ;
}

bool __get_400_response::operator!=(const __get_400_response& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const __get_400_response& o)
{
    j = nlohmann::json::object();
    if(o.responseCodeIsSet())
        j["response_code"] = o.m_Response_code;
    if(o.responseMessageIsSet())
        j["response_message"] = o.m_Response_message;
    
}

void from_json(const nlohmann::json& j, __get_400_response& o)
{
    if(j.find("response_code") != j.end())
    {
        j.at("response_code").get_to(o.m_Response_code);
        o.m_Response_codeIsSet = true;
    } 
    if(j.find("response_message") != j.end())
    {
        j.at("response_message").get_to(o.m_Response_message);
        o.m_Response_messageIsSet = true;
    } 
    
}

std::string __get_400_response::getResponseCode() const
{
    return m_Response_code;
}
void __get_400_response::setResponseCode(std::string const& value)
{
    m_Response_code = value;
    m_Response_codeIsSet = true;
}
bool __get_400_response::responseCodeIsSet() const
{
    return m_Response_codeIsSet;
}
void __get_400_response::unsetResponse_code()
{
    m_Response_codeIsSet = false;
}
std::string __get_400_response::getResponseMessage() const
{
    return m_Response_message;
}
void __get_400_response::setResponseMessage(std::string const& value)
{
    m_Response_message = value;
    m_Response_messageIsSet = true;
}
bool __get_400_response::responseMessageIsSet() const
{
    return m_Response_messageIsSet;
}
void __get_400_response::unsetResponse_message()
{
    m_Response_messageIsSet = false;
}


} // namespace org::openapitools::server::model

