note
 description:"[
		iplocation.net API
 		OpenAPI v3 specification and a set of generated API clients for iplocation.net
  		The version of the OpenAPI document: 1.0.1-pre.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	CONFIGURATION

feature -- API client

	default_api_client: API_CLIENT
		do
			create Result.make
		end
end
