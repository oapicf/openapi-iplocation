--  iplocation.net API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.4.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
pragma Warnings (Off, "*no entities of*are referenced");
with Swagger.Servers;
with .Models;
with Security.Permissions;
package .Skeletons is
   pragma Style_Checks ("-bmrIu");
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited interface;



   --  Get geolocation of an IP address
   --  Retrieve geolocation of an IP address.
   procedure Root_Get
      (Server : in out Server_Type;
       Ip : in Swagger.UString;
       Format : in Swagger.Nullable_UString;
       Delimiter : in Swagger.Nullable_UString;
       Result  : out .Models.Get200Response_Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Skeleton is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  Get geolocation of an IP address
      procedure Root_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);

   end Skeleton;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Shared_Instance is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  Get geolocation of an IP address
      procedure Root_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


   private
      protected Server is

         --  Get geolocation of an IP address
         procedure Root_Get
            (Ip : in Swagger.UString;
             Format : in Swagger.Nullable_UString;
             Delimiter : in Swagger.Nullable_UString;
       Result  : out .Models.Get200Response_Type;
             Context : in out Swagger.Servers.Context_Type);

      private
         Impl : Implementation_Type;
      end Server;
   end Shared_Instance;

end .Skeletons;
