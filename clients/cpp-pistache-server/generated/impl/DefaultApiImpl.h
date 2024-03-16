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
* DefaultApiImpl.h
*
* 
*/

#ifndef DEFAULT_API_IMPL_H_
#define DEFAULT_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <DefaultApi.h>


#include "__get_200_response.h"
#include "__get_400_response.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class DefaultApiImpl : public org::openapitools::server::api::DefaultApi {
public:
    explicit DefaultApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~DefaultApiImpl() override = default;

    void root_get(const std::optional<org::openapitools::server::model::nlohmann::json> &ip, const std::optional<org::openapitools::server::model::nlohmann::json> &format, const std::optional<org::openapitools::server::model::nlohmann::json> &delimiter, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
