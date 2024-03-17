namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Get400Response =

  //#region Get400Response

  [<CLIMutable>]
  type Get400Response = {
    [<JsonProperty(PropertyName = "response_code")>]
    ResponseCode : string;
    [<JsonProperty(PropertyName = "response_message")>]
    ResponseMessage : string;
  }

  //#endregion
