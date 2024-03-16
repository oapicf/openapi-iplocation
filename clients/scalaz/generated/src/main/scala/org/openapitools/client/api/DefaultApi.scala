package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.Get200Response
import org.openapitools.client.api.Get400Response

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def rootGet(host: String, ip: AnyType, format: AnyType, delimiter: AnyType)(implicit ipQuery: QueryParam[AnyType], formatQuery: QueryParam[AnyType], delimiterQuery: QueryParam[AnyType]): Task[Get200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[Get200Response] = jsonOf[Get200Response]

    val path = "/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ip", Some(ipQuery.toParamString(ip))), ("format", Some(formatQuery.toParamString(format))), ("delimiter", Some(delimiterQuery.toParamString(delimiter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Get200Response](req)

    } yield resp
  }

}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def rootGet(ip: AnyType, format: AnyType, delimiter: AnyType)(implicit ipQuery: QueryParam[AnyType], formatQuery: QueryParam[AnyType], delimiterQuery: QueryParam[AnyType]): Task[Get200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[Get200Response] = jsonOf[Get200Response]

    val path = "/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ip", Some(ipQuery.toParamString(ip))), ("format", Some(formatQuery.toParamString(format))), ("delimiter", Some(delimiterQuery.toParamString(delimiter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Get200Response](req)

    } yield resp
  }

}
