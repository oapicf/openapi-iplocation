-module(openapi___get_200_response).

-include("openapi.hrl").

-export([openapi___get_200_response/0]).

-export([openapi___get_200_response/1]).

-export_type([openapi___get_200_response/0]).

-type openapi___get_200_response() ::
  [ {'ip', binary() }
  | {'ip_number', binary() }
  | {'ip_version', integer() }
  | {'country_name', binary() }
  | {'country_code2', binary() }
  | {'isp', binary() }
  | {'response_code', binary() }
  | {'response_message', binary() }
  ].


openapi___get_200_response() ->
    openapi___get_200_response([]).

openapi___get_200_response(Fields) ->
  Default = [ {'ip', binary() }
            , {'ip_number', binary() }
            , {'ip_version', integer() }
            , {'country_name', binary() }
            , {'country_code2', binary() }
            , {'isp', binary() }
            , {'response_code', binary() }
            , {'response_message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

