#
# iplocation.net API
# 
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
# The version of the OpenAPI document: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model___get_200_response
import ../models/model___get_400_response

const basepath = "https://api.iplocation.net"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc rootGet*(httpClient: HttpClient, ip: string, format: string, delimiter: string): (Option[__get_200_response], Response) =
  ## Get geolocation of an IP address
  let query_for_api_call = encodeQuery([
    ("ip", $ip), # An IPv4 or IPv6 address that you would like to lookup.
    ("format", $format), # Output format, the following formats are supported: plain xml json jsonp php csv serialized
    ("delimiter", $delimiter), # Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
  ])

  let response = httpClient.get(basepath & "/" & "?" & query_for_api_call)
  constructResult[__get_200_response](response)

