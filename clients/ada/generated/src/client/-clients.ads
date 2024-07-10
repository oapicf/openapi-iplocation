--  iplocation.net API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.4.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-bmrIu");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Get geolocation of an IP address
   --  Retrieve geolocation of an IP address.
   procedure Root_Get
      (Client : in out Client_Type;
       Ip : in Swagger.UString;
       Format : in Swagger.Nullable_UString;
       Delimiter : in Swagger.Nullable_UString;
       Result : out .Models.Get200Response_Type);

end .Clients;