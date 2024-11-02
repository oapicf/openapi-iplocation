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

#include "DefaultApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string DefaultApi::base = "";

DefaultApi::DefaultApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void DefaultApi::init() {
    setupRoutes();
}

void DefaultApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/", Routes::bind(&DefaultApi::root_get_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&DefaultApi::default_api_default_handler, this));
}

void DefaultApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> DefaultApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what());
    }
}

void DefaultApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> DefaultApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void DefaultApi::root_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto ipQuery = request.query().get("ip");
    std::optional<std::string> ip;
    if(ipQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(ipQuery.value(), valueQuery_instance)){
            ip = valueQuery_instance;
        }
    }
    auto formatQuery = request.query().get("format");
    std::optional<std::string> format;
    if(formatQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(formatQuery.value(), valueQuery_instance)){
            format = valueQuery_instance;
        }
    }
    auto delimiterQuery = request.query().get("delimiter");
    std::optional<std::string> delimiter;
    if(delimiterQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(delimiterQuery.value(), valueQuery_instance)){
            delimiter = valueQuery_instance;
        }
    }
    
    try {
        this->root_get(ip, format, delimiter, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void DefaultApi::default_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

