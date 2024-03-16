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
package org.openapitools.server

import io.ktor.locations.*
import org.openapitools.server.models.*

@KtorExperimentalLocationsAPI
object Paths {
    /**
     * Get geolocation of an IP address
     * Retrieve geolocation of an IP address.

     * @param ip An IPv4 or IPv6 address that you would like to lookup. 
     * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
     * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
     */
    @Location("/") class rootGet(val ip: kotlin.Any, val format: kotlin.Any? = null, val delimiter: kotlin.Any? = null)

}
