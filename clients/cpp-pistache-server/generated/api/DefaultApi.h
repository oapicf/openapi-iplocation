/**
* iplocation.net API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "__get_200_response.h"
#include "__get_400_response.h"

namespace org::openapitools::server::api
{

class  DefaultApi {
public:
    explicit DefaultApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    virtual ~DefaultApi() = default;
    void init();

    static const std::string base;

private:
    void setupRoutes();

    void root_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void default_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    const std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Get geolocation of an IP address
    /// </summary>
    /// <remarks>
    /// Retrieve geolocation of an IP address. 
    /// </remarks>
    /// <param name="ip">An IPv4 or IPv6 address that you would like to lookup.</param>
    /// <param name="format">Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional, default to nullptr)</param>
    /// <param name="delimiter">Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional, default to nullptr)</param>
    virtual void root_get(const std::optional<org::openapitools::server::model::nlohmann::json> &ip, const std::optional<org::openapitools::server::model::nlohmann::json> &format, const std::optional<org::openapitools::server::model::nlohmann::json> &delimiter, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* DefaultApi_H_ */

