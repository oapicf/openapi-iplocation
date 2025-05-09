/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * DefaultApi.h
 *
 * 
 */

#ifndef DefaultApi_H_
#define DefaultApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "__get_200_response.h"
#include "__get_400_response.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  DefaultApiException: public std::exception
{
public:
    DefaultApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace DefaultApiResources {
/// <summary>
/// Get geolocation of an IP address
/// </summary>
/// <remarks>
/// Retrieve geolocation of an IP address. 
/// </remarks>
class  Resource: public restbed::Resource
{
public:
    Resource(const std::string& context = "");
    virtual ~Resource() = default;

    Resource(
        const Resource& other) = default; // copy constructor
    Resource(Resource&& other) noexcept = default; // move constructor

    Resource& operator=(const Resource& other) = default; // copy assignment
    Resource& operator=(Resource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, __get_200_response>(
        std::string & ip, std::string & format, std::string & delimiter)> handler_GET_func =
            [](std::string &, std::string &, std::string &) -> std::pair<int, __get_200_response>
                { throw DefaultApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, __get_200_response> handler_GET(
        std::string & ip, std::string & format, std::string & delimiter);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace DefaultApiResources */

using DefaultApiResource [[deprecated]] = DefaultApiResources::Resource;

//
// The restbed service to actually implement the REST server
//
class  DefaultApi
{
public:
    explicit DefaultApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~DefaultApi();

    std::shared_ptr<DefaultApiResources::Resource> getResource();

    void setResource(std::shared_ptr<DefaultApiResources::Resource> resource);
    [[deprecated("use setResource()")]]
    virtual void setDefaultApiResource(std::shared_ptr<DefaultApiResources::Resource> spDefaultApiResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<DefaultApiResources::Resource> m_spResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* DefaultApi_H_ */

