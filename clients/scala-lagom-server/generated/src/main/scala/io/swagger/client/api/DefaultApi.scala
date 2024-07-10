/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.Get200Response
import io.swagger.client.model.Get400Response

trait DefaultApi extends Service {


  final override def descriptor = {
    import Service._
    named("DefaultApi").withCalls(
      restCall(Method.GET, "/?ip&format&delimiter", rootGet _)
    ).withAutoAcl(true)
  }

      
  /**
    * Get geolocation of an IP address
    * Retrieve geolocation of an IP address. 
    *  
    * @param ip An IPv4 or IPv6 address that you would like to lookup.  
    * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional) 
    * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
    * @return Get200Response
    */
  def rootGet(ip:String          ,format:           Option[String] = None,delimiter:           Option[String] = None): ServiceCall[NotUsed ,Get200Response]
  

  }
