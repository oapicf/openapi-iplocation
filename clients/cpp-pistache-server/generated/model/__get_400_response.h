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
/*
 * __get_400_response.h
 *
 * 
 */

#ifndef __get_400_response_H_
#define __get_400_response_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  __get_400_response
{
public:
    __get_400_response();
    virtual ~__get_400_response() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const __get_400_response& rhs) const;
    bool operator!=(const __get_400_response& rhs) const;

    /////////////////////////////////////////////
    /// __get_400_response members

    /// <summary>
    /// Response status code to indicate success or failed completion of the API call.
    /// </summary>
    std::string getResponseCode() const;
    void setResponseCode(std::string const& value);
    bool responseCodeIsSet() const;
    void unsetResponse_code();
    /// <summary>
    /// Response message to indicate success or failed completion of the API call.
    /// </summary>
    std::string getResponseMessage() const;
    void setResponseMessage(std::string const& value);
    bool responseMessageIsSet() const;
    void unsetResponse_message();

    friend  void to_json(nlohmann::json& j, const __get_400_response& o);
    friend  void from_json(const nlohmann::json& j, __get_400_response& o);
protected:
    std::string m_Response_code;
    bool m_Response_codeIsSet;
    std::string m_Response_message;
    bool m_Response_messageIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* __get_400_response_H_ */