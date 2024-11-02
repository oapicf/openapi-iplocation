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

