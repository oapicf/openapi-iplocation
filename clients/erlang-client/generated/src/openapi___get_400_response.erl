-module(openapi___get_400_response).

-export([encode/1]).

-export_type([openapi___get_400_response/0]).

-type openapi___get_400_response() ::
    #{ 'response_code' => openapi_any_type:openapi_any_type(),
       'response_message' => openapi_any_type:openapi_any_type()
     }.

encode(#{ 'response_code' := ResponseCode,
          'response_message' := ResponseMessage
        }) ->
    #{ 'response_code' => ResponseCode,
       'response_message' => ResponseMessage
     }.
