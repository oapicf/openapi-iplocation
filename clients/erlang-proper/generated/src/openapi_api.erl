-module(openapi_api).

-export([ root_get/1
        ]).

-define(BASE_URL, "").

%% @doc Get geolocation of an IP address
%% Retrieve geolocation of an IP address. 
-spec root_get(binary()) ->
  openapi_utils:response().
root_get(Ip) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/"],
  QueryString = [<<"ip=">>, Ip, <<"&">>, <<"format=">>, Format, <<"&">>, <<"delimiter=">>, Delimiter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

