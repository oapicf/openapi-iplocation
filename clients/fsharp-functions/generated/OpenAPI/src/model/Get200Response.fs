namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Get200Response =

  //#region Get200Response

  [<CLIMutable>]
  type Get200Response = {
    [<JsonProperty(PropertyName = "ip")>]
    Ip : string;
    [<JsonProperty(PropertyName = "ip_number")>]
    IpNumber : string;
    [<JsonProperty(PropertyName = "ip_version")>]
    IpVersion : int;
    [<JsonProperty(PropertyName = "country_name")>]
    CountryName : string;
    [<JsonProperty(PropertyName = "country_code2")>]
    CountryCode2 : string;
    [<JsonProperty(PropertyName = "isp")>]
    Isp : string;
    [<JsonProperty(PropertyName = "response_code")>]
    ResponseCode : string;
    [<JsonProperty(PropertyName = "response_message")>]
    ResponseMessage : string;
  }

  //#endregion
