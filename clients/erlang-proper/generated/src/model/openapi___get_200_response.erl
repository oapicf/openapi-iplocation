-module(openapi___get_200_response).

-include("openapi.hrl").

-export([openapi___get_200_response/0]).

-export([openapi___get_200_response/1]).

-export_type([openapi___get_200_response/0]).

-type openapi___get_200_response() ::
  [ {'ip', openapi_any_type:openapi_any_type() }
  | {'ip_number', openapi_any_type:openapi_any_type() }
  | {'ip_version', openapi_any_type:openapi_any_type() }
  | {'country_name', openapi_any_type:openapi_any_type() }
  | {'country_code2', openapi_any_type:openapi_any_type() }
  | {'isp', openapi_any_type:openapi_any_type() }
  | {'response_code', openapi_any_type:openapi_any_type() }
  | {'response_message', openapi_any_type:openapi_any_type() }
  ].


openapi___get_200_response() ->
    openapi___get_200_response([]).

openapi___get_200_response(Fields) ->
  Default = [ {'ip', openapi_any_type:openapi_any_type() }
            , {'ip_number', openapi_any_type:openapi_any_type() }
            , {'ip_version', openapi_any_type:openapi_any_type() }
            , {'country_name', openapi_any_type:openapi_any_type() }
            , {'country_code2', openapi_any_type:openapi_any_type() }
            , {'isp', openapi_any_type:openapi_any_type() }
            , {'response_code', openapi_any_type:openapi_any_type() }
            , {'response_message', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

