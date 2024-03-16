namespace OpenAPI
open OpenAPI.Model.Get200Response
open OpenAPI.Model.Get400Response
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.RootGet ctx args =
          if true then
            let content = "Successfully processed the request." :> obj :?> Get200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RootGetStatusCode200 { content = content }
          else if true then
            let content = "Failed to complete the request." :> obj :?> Get400Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RootGetStatusCode400 { content = content }
          else
            let content = "Command not found." :> obj :?> Get400Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RootGetStatusCode404 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService