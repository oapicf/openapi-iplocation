/**
* iplocation.net API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "DefaultApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

DefaultApiImpl::DefaultApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : DefaultApi(rtr)
{
}

void DefaultApiImpl::root_get(const std::optional<std::string> &ip, const std::optional<std::string> &format, const std::optional<std::string> &delimiter, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}
