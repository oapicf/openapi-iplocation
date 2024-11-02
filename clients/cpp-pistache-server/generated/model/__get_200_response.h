/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 1.0.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * __get_200_response.h
 *
 * 
 */

#ifndef __get_200_response_H_
#define __get_200_response_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  __get_200_response
{
public:
    __get_200_response();
    virtual ~__get_200_response() = default;


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

    bool operator==(const __get_200_response& rhs) const;
    bool operator!=(const __get_200_response& rhs) const;

    /////////////////////////////////////////////
    /// __get_200_response members

    /// <summary>
    /// IPv4 or IPv6 address used to lookup geolocation.
    /// </summary>
    std::string getIp() const;
    void setIp(std::string const& value);
    bool ipIsSet() const;
    void unsetIp();
    /// <summary>
    /// IP number in long integer (represented as string).
    /// </summary>
    std::string getIpNumber() const;
    void setIpNumber(std::string const& value);
    bool ipNumberIsSet() const;
    void unsetIp_number();
    /// <summary>
    /// IP version either 4 or 6.
    /// </summary>
    int32_t getIpVersion() const;
    void setIpVersion(int32_t const value);
    bool ipVersionIsSet() const;
    void unsetIp_version();
    /// <summary>
    /// Full name of the IP country.
    /// </summary>
    std::string getCountryName() const;
    void setCountryName(std::string const& value);
    bool countryNameIsSet() const;
    void unsetCountry_name();
    /// <summary>
    /// ISO ALPHA-2 Country Code.
    /// </summary>
    std::string getCountryCode2() const;
    void setCountryCode2(std::string const& value);
    bool countryCode2IsSet() const;
    void unsetCountry_code2();
    /// <summary>
    /// Internet Service Provider (ISP) who owns the IP address.
    /// </summary>
    std::string getIsp() const;
    void setIsp(std::string const& value);
    bool ispIsSet() const;
    void unsetIsp();
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

    friend  void to_json(nlohmann::json& j, const __get_200_response& o);
    friend  void from_json(const nlohmann::json& j, __get_200_response& o);
protected:
    std::string m_Ip;
    bool m_IpIsSet;
    std::string m_Ip_number;
    bool m_Ip_numberIsSet;
    int32_t m_Ip_version;
    bool m_Ip_versionIsSet;
    std::string m_Country_name;
    bool m_Country_nameIsSet;
    std::string m_Country_code2;
    bool m_Country_code2IsSet;
    std::string m_Isp;
    bool m_IspIsSet;
    std::string m_Response_code;
    bool m_Response_codeIsSet;
    std::string m_Response_message;
    bool m_Response_messageIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* __get_200_response_H_ */
