-module(openapi___get_200_response).

-export([encode/1]).

-export_type([openapi___get_200_response/0]).

-type openapi___get_200_response() ::
    #{ 'ip' => openapi_any_type:openapi_any_type(),
       'ip_number' => openapi_any_type:openapi_any_type(),
       'ip_version' => openapi_any_type:openapi_any_type(),
       'country_name' => openapi_any_type:openapi_any_type(),
       'country_code2' => openapi_any_type:openapi_any_type(),
       'isp' => openapi_any_type:openapi_any_type(),
       'response_code' => openapi_any_type:openapi_any_type(),
       'response_message' => openapi_any_type:openapi_any_type()
     }.

encode(#{ 'ip' := Ip,
          'ip_number' := IpNumber,
          'ip_version' := IpVersion,
          'country_name' := CountryName,
          'country_code2' := CountryCode2,
          'isp' := Isp,
          'response_code' := ResponseCode,
          'response_message' := ResponseMessage
        }) ->
    #{ 'ip' => Ip,
       'ip_number' => IpNumber,
       'ip_version' => IpVersion,
       'country_name' => CountryName,
       'country_code2' => CountryCode2,
       'isp' => Isp,
       'response_code' => ResponseCode,
       'response_message' => ResponseMessage
     }.
