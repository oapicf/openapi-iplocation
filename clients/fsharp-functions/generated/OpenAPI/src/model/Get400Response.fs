namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module Get400Response =

  //#region Get400Response

  [<CLIMutable>]
  type Get400Response = {
    [<JsonProperty(PropertyName = "response_code")>]
    ResponseCode : AnyType;
    [<JsonProperty(PropertyName = "response_message")>]
    ResponseMessage : AnyType;
  }

  //#endregion
