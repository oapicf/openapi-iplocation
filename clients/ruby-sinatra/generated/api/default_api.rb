require 'json'


MyApp.add_route('GET', '/', {
  "resourcePath" => "/Default",
  "summary" => "Get geolocation of an IP address",
  "nickname" => "root_get",
  "responseClass" => "__get_200_response",
  "endpoint" => "/",
  "notes" => "Retrieve geolocation of an IP address. ",
  "parameters" => [
    {
      "name" => "ip",
      "description" => "An IPv4 or IPv6 address that you would like to lookup.",
      "dataType" => "Object",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "format",
      "description" => "Output format, the following formats are supported: plain xml json jsonp php csv serialized",
      "dataType" => "Object",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "delimiter",
      "description" => "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.",
      "dataType" => "Object",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

