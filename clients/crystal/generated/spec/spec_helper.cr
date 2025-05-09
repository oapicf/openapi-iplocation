# #iplocation.net API
#
##OpenAPI v3 specification and a set of generated API clients for iplocation.net
#
#The version of the OpenAPI document: 1.1.1-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.12.0
#

# load modules
require "spec"
require "json"
require "../src/openapi_client"

def assert_compilation_error(path : String, message : String) : Nil
  buffer = IO::Memory.new
  result = Process.run("crystal", ["run", "--no-color", "--no-codegen", path], error: buffer)
  result.success?.should be_false
  buffer.to_s.should contain message
  buffer.close
end
