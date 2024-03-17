-module(openapi___get_400_response).

-include("openapi.hrl").

-export([openapi___get_400_response/0]).

-export([openapi___get_400_response/1]).

-export_type([openapi___get_400_response/0]).

-type openapi___get_400_response() ::
  [ {'response_code', binary() }
  | {'response_message', binary() }
  ].


openapi___get_400_response() ->
    openapi___get_400_response([]).

openapi___get_400_response(Fields) ->
  Default = [ {'response_code', binary() }
            , {'response_message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

