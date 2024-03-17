goog.provide('API.Client.__get_400_response');

/**
 * @record
 */
API.Client.Get400Response = function() {}

/**
 * Response status code to indicate success or failed completion of the API call.
 * @type {!string}
 * @export
 */
API.Client.Get400Response.prototype.responseCode;

/**
 * Response message to indicate success or failed completion of the API call.
 * @type {!string}
 * @export
 */
API.Client.Get400Response.prototype.responseMessage;

