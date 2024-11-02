#
# iplocation.net API
# 
# OpenAPI v3 specification and a set of generated API clients for iplocation.net
# The version of the OpenAPI document: 1.0.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type Get200Response* = object
  ## 
  ip*: string ## IPv4 or IPv6 address used to lookup geolocation.
  ipNumber*: string ## IP number in long integer (represented as string).
  ipVersion*: int ## IP version either 4 or 6.
  countryName*: string ## Full name of the IP country.
  countryCode2*: string ## ISO ALPHA-2 Country Code.
  isp*: string ## Internet Service Provider (ISP) who owns the IP address.
  responseCode*: string ## Response status code to indicate success or failed completion of the API call.
  responseMessage*: string ## Response message to indicate success or failed completion of the API call.
