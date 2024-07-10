--[[
  iplocation.net API

  OpenAPI v3 specification and a set of generated API clients for iplocation.net

  The version of the OpenAPI document: 0.9.0-pre.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- __get_200_response class
local __get_200_response = {}
local __get_200_response_mt = {
	__name = "__get_200_response";
	__index = __get_200_response;
}

local function cast___get_200_response(t)
	return setmetatable(t, __get_200_response_mt)
end

local function new___get_200_response(ip, ip_number, ip_version, country_name, country_code2, isp, response_code, response_message)
	return cast___get_200_response({
		["ip"] = ip;
		["ip_number"] = ip_number;
		["ip_version"] = ip_version;
		["country_name"] = country_name;
		["country_code2"] = country_code2;
		["isp"] = isp;
		["response_code"] = response_code;
		["response_message"] = response_message;
	})
end

return {
	cast = cast___get_200_response;
	new = new___get_200_response;
}