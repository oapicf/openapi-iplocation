-module(openapi_default_api).

-export([root_get/2, root_get/3]).

-define(BASE_URL, <<"">>).

%% @doc Get geolocation of an IP address
%% Retrieve geolocation of an IP address. 
-spec root_get(ctx:ctx(), binary()) -> {ok, openapi___get_200_response:openapi___get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
root_get(Ctx, Ip) ->
    root_get(Ctx, Ip, #{}).

-spec root_get(ctx:ctx(), binary(), maps:map()) -> {ok, openapi___get_200_response:openapi___get_200_response(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
root_get(Ctx, Ip, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/"],
    QS = lists:flatten([{<<"ip">>, Ip}])++openapi_utils:optional_params(['format', 'delimiter'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


