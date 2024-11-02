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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL___get_400_response_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL___get_400_response_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  __get_400_response
    : public ModelBase
{
public:
    __get_400_response();
    virtual ~__get_400_response();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// __get_400_response members

    /// <summary>
    /// Response status code to indicate success or failed completion of the API call.
    /// </summary>
    utility::string_t getResponseCode() const;
    bool responseCodeIsSet() const;
    void unsetResponse_code();

    void setResponseCode(const utility::string_t& value);

    /// <summary>
    /// Response message to indicate success or failed completion of the API call.
    /// </summary>
    utility::string_t getResponseMessage() const;
    bool responseMessageIsSet() const;
    void unsetResponse_message();

    void setResponseMessage(const utility::string_t& value);


protected:
    utility::string_t m_Response_code;
    bool m_Response_codeIsSet;
    utility::string_t m_Response_message;
    bool m_Response_messageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL___get_400_response_H_ */
