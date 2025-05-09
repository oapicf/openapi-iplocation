--  iplocation.net API
--  OpenAPI v3 specification and a set of generated API clients for iplocation.net
--
--  The version of the OpenAPI document: 1.1.1_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.12.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
package body .Clients is
   pragma Style_Checks ("-bmrIu");

   Media_List_1 : constant Swagger.Mime_List := (
     1 => Swagger.Mime_Json   );


   --  Get geolocation of an IP address
   --  Retrieve geolocation of an IP address.
   procedure Root_Get
      (Client : in out Client_Type;
       Ip : in Swagger.UString;
       Format : in Swagger.Nullable_UString;
       Delimiter : in Swagger.Nullable_UString;
       Result : out .Models.Get200Response_Type) is
      URI   : Swagger.Clients.URI_Type;
      Reply : Swagger.Value_Type;
   begin
      Client.Set_Accept (Media_List_1);


      URI.Add_Param ("ip", Ip);
      URI.Add_Param ("format", Format);
      URI.Add_Param ("delimiter", Delimiter);
      URI.Set_Path ("/");
      Client.Call (Swagger.Clients.GET, URI, Reply);
      .Models.Deserialize (Reply, "", Result);
   end Root_Get;
end .Clients;
