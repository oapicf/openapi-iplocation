# Load the gem
require 'openapi_iplocation'

api_instance = OpenApiIplocationClient::DefaultApi.new

begin
  # Look up IP location in JSON format
  opts = {
    format: 'json'
  }
  api_response = api_instance.root_get('8.8.8.8', opts)
  p api_response
rescue OpenApiIplocationClient::ApiError => e
  puts "Exception when calling DefaultApi->root_get: #{e}"
  raise
end
