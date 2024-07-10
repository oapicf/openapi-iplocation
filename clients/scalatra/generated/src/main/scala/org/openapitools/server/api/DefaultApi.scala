/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.Get200Response
import org.openapitools.server.model.Get400Response

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class DefaultApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "DefaultApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val rootGetOperation = (apiOperation[Get200Response]("rootGet")
    summary "Get geolocation of an IP address"
    parameters(queryParam[String]("ip").description(""), queryParam[String]("format").description("").optional, queryParam[String]("delimiter").description("").optional)
  )

  get("/", operation(rootGetOperation)) {
            val ip = params.getAs[String]("ip")

    //println("ip: " + ip)
            val format = params.getAs[String]("format")

    //println("format: " + format)
            val delimiter = params.getAs[String]("delimiter")

    //println("delimiter: " + delimiter)
  }

}