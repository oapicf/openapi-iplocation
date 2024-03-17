-module(openapi___get_400_response).

-export([encode/1]).

-export_type([openapi___get_400_response/0]).

-type openapi___get_400_response() ::
    #{ 'response_code' => binary(),
       'response_message' => binary()
     }.

encode(#{ 'response_code' := ResponseCode,
          'response_message' := ResponseMessage
        }) ->
    #{ 'response_code' => ResponseCode,
       'response_message' => ResponseMessage
     }.
