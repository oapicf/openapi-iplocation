package org.openapitools.server.model


/**
 * @param ip IPv4 or IPv6 address used to lookup geolocation. for example: ''null''
 * @param ipNumber IP number in long integer. for example: ''null''
 * @param ipVersion IP version either 4 or 6. for example: ''null''
 * @param countryName Full name of the IP country. for example: ''null''
 * @param countryCode2 ISO ALPHA-2 Country Code. for example: ''null''
 * @param isp Internet Service Provider (ISP) who owns the IP address. for example: ''null''
 * @param responseCode Response status code to indicate success or failed completion of the API call. for example: ''null''
 * @param responseMessage Response message to indicate success or failed completion of the API call. for example: ''null''
*/
final case class Get200Response (
  ip: Option[AnyType] = None,
  ipNumber: Option[AnyType] = None,
  ipVersion: Option[AnyType] = None,
  countryName: Option[AnyType] = None,
  countryCode2: Option[AnyType] = None,
  isp: Option[AnyType] = None,
  responseCode: Option[AnyType] = None,
  responseMessage: Option[AnyType] = None
)

