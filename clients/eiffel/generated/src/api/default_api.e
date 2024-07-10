note
 description:"[
		iplocation.net API
 		OpenAPI v3 specification and a set of generated API clients for iplocation.net
  		The version of the OpenAPI document: 0.9.0-pre.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	DEFAULT_API

inherit

    API_I


feature -- API Access


	root_get (ip: STRING_32; format: STRING_32; delimiter: STRING_32): detachable MODEL__GET_200_RESPONSE
			-- Get geolocation of an IP address
			-- Retrieve geolocation of an IP address. 
			-- 
			-- argument: ip An IPv4 or IPv6 address that you would like to lookup. (required)
			-- 
			-- argument: format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional, default to null)
			-- 
			-- argument: delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional, default to null)
			-- 
			-- 
			-- Result MODEL__GET_200_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "ip", ip));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "format", format));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "delimiter", delimiter));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { MODEL__GET_200_RESPONSE } l_response.data ({ MODEL__GET_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end
