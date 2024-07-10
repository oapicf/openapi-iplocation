goog.provide('API.Client.__get_200_response');

/**
 * @record
 */
API.Client.Get200Response = function() {}

/**
 * IPv4 or IPv6 address used to lookup geolocation.
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.ip;

/**
 * IP number in long integer (represented as string).
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.ipNumber;

/**
 * IP version either 4 or 6.
 * @type {!number}
 * @export
 */
API.Client.Get200Response.prototype.ipVersion;

/**
 * Full name of the IP country.
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.countryName;

/**
 * ISO ALPHA-2 Country Code.
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.countryCode2;

/**
 * Internet Service Provider (ISP) who owns the IP address.
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.isp;

/**
 * Response status code to indicate success or failed completion of the API call.
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.responseCode;

/**
 * Response message to indicate success or failed completion of the API call.
 * @type {!string}
 * @export
 */
API.Client.Get200Response.prototype.responseMessage;

