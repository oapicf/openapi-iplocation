/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  __get_400_response 
{
public:
    __get_400_response() = default;
    explicit __get_400_response(boost::property_tree::ptree const& pt);
    virtual ~__get_400_response() = default;

    __get_400_response(const __get_400_response& other) = default; // copy constructor
    __get_400_response(__get_400_response&& other) noexcept = default; // move constructor

    __get_400_response& operator=(const __get_400_response& other) = default; // copy assignment
    __get_400_response& operator=(__get_400_response&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// __get_400_response members

    /// <summary>
    /// Response status code to indicate success or failed completion of the API call.
    /// </summary>
    std::string getResponseCode() const;
    void setResponseCode(std::string value);

    /// <summary>
    /// Response message to indicate success or failed completion of the API call.
    /// </summary>
    std::string getResponseMessage() const;
    void setResponseMessage(std::string value);

protected:
    std::string m_Response_code = "";
    std::string m_Response_message = "";
};

std::vector<__get_400_response> create__get_400_responseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<__get_400_response>(const __get_400_response& val) {
    return val.toPropertyTree();
}

template<>
inline __get_400_response fromPt<__get_400_response>(const boost::property_tree::ptree& pt) {
    __get_400_response ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* __get_400_response_H_ */
