namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module Get200Response =

  //#region Get200Response

  [<CLIMutable>]
  type Get200Response = {
    [<JsonProperty(PropertyName = "ip")>]
    Ip : AnyType;
    [<JsonProperty(PropertyName = "ip_number")>]
    IpNumber : AnyType;
    [<JsonProperty(PropertyName = "ip_version")>]
    IpVersion : AnyType;
    [<JsonProperty(PropertyName = "country_name")>]
    CountryName : AnyType;
    [<JsonProperty(PropertyName = "country_code2")>]
    CountryCode2 : AnyType;
    [<JsonProperty(PropertyName = "isp")>]
    Isp : AnyType;
    [<JsonProperty(PropertyName = "response_code")>]
    ResponseCode : AnyType;
    [<JsonProperty(PropertyName = "response_message")>]
    ResponseMessage : AnyType;
  }

  //#endregion
