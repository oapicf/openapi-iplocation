namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.Get200Response
open OpenAPI.Model.Get400Response

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region RootGet
    /// <summary>
    /// Get geolocation of an IP address
    /// </summary>

    let RootGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RootGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : RootGetArgs
          let result = DefaultApiService.RootGet ctx serviceArgs
          return! (match result with
                      | RootGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | RootGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | RootGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
          ) next ctx
        }
    //#endregion

