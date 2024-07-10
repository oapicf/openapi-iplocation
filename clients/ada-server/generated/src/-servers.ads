--  iplocation.net API
--  OpenAPI v3 specification and a set of generated API clients for iplocation.net
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;

package .Servers is
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  Get geolocation of an IP address
   --  Retrieve geolocation of an IP address.
   overriding
   procedure Root_Get
      (Server : in out Server_Type;
       Ip : in Swagger.UString;
       Format : in Swagger.Nullable_UString;
       Delimiter : in Swagger.Nullable_UString;
       Result  : out .Models.Get200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
