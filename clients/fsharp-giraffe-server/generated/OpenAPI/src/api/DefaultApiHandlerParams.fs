namespace OpenAPI

open OpenAPI.Model.Get200Response
open OpenAPI.Model.Get400Response
open System.Collections.Generic
open System

module DefaultApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type RootGetQueryParams = {
      ip : AnyType ;


      format : AnyType option;


      delimiter : AnyType option;

    }
    //#endregion


    type RootGetStatusCode200Response = {
      content:Get200Response;
      
    }

    type RootGetStatusCode400Response = {
      content:Get400Response;
      
    }

    type RootGetStatusCode404Response = {
      content:Get400Response;
      
    }
    type RootGetResult = RootGetStatusCode200 of RootGetStatusCode200Response|RootGetStatusCode400 of RootGetStatusCode400Response|RootGetStatusCode404 of RootGetStatusCode404Response

    type RootGetArgs = {
      queryParams:Result<RootGetQueryParams,string>;
    }
