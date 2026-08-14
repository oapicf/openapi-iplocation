require "json"

module OpenAPIClient
  module Api
  class Root
    def initialize(@conn : Connection); end

    # Get geolocation of an IP address Retrieve geolocation of an IP address. 
    def list(*, ip : String? = nil, format : String? = nil, delimiter : String? = nil) : Response(OpenAPIClient::Get200Response)
      @conn.request(OpenAPIClient::Get200Response,
        method: :GET,
        path: "/",
        query: { "ip" => ip, "format" => format, "delimiter" => delimiter },
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
