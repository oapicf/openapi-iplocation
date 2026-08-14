package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Get200Response
import org.openapitools.models.Get400Response


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: DefaultApiDelegate[F]) extends Http4sDsl[F] {
  object rootGet {
    import DefaultApiDelegate.rootGetResponses

    object ipQueryParam extends QueryParamDecoderMatcher[String]("ip")
    object formatQueryParam extends OptionalQueryParamDecoderMatcher[String]("format")
    object delimiterQueryParam extends OptionalQueryParamDecoderMatcher[String]("delimiter")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "" :? ipQueryParam(ip) +& formatQueryParam(format) +& delimiterQueryParam(delimiter) =>
        delegate.rootGet.handle(req, ip, format, delimiter, responses)

    }


    val responses: rootGetResponses[F] = new rootGetResponses[F] {
      def resp200(value: Get200Response): F[Response[F]] = Ok(value)
      def resp400(value: Get400Response): F[Response[F]] = BadRequest(value)
      def resp404(value: Get400Response): F[Response[F]] = NotFound(value)
    }
  }

  val routes =
    rootGet.route
}

object DefaultApiDelegate {
  trait rootGetResponses[F[_]] {
    def resp200(value: Get200Response): F[Response[F]]
    def resp400(value: Get400Response): F[Response[F]]
    def resp404(value: Get400Response): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait rootGet {
    import DefaultApiDelegate.rootGetResponses

    def handle(
      req: Request[F],
      ip: String,
      format: Option[String],
      delimiter: Option[String],
      responses: rootGetResponses[F]
    ): F[Response[F]]

  }
  def rootGet: rootGet

}