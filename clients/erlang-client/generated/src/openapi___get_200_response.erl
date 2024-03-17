-module(openapi___get_200_response).

-export([encode/1]).

-export_type([openapi___get_200_response/0]).

-type openapi___get_200_response() ::
    #{ 'ip' => binary(),
       'ip_number' => openapi_int64:openapi_int64(),
       'ip_version' => integer(),
       'country_name' => binary(),
       'country_code2' => binary(),
       'isp' => binary(),
       'response_code' => binary(),
       'response_message' => binary()
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
