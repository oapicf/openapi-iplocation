/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Get400Response model module.
 * @module model/Get400Response
 * @version 1.1.1-pre.0
 */
class Get400Response {
    /**
     * Constructs a new <code>Get400Response</code>.
     * @alias module:model/Get400Response
     */
    constructor() { 
        
        Get400Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Get400Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Get400Response} obj Optional instance to populate.
     * @return {module:model/Get400Response} The populated <code>Get400Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Get400Response();

            if (data.hasOwnProperty('response_code')) {
                obj['response_code'] = ApiClient.convertToType(data['response_code'], 'String');
            }
            if (data.hasOwnProperty('response_message')) {
                obj['response_message'] = ApiClient.convertToType(data['response_message'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Get400Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Get400Response</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['response_code'] && !(typeof data['response_code'] === 'string' || data['response_code'] instanceof String)) {
            throw new Error("Expected the field `response_code` to be a primitive type in the JSON string but got " + data['response_code']);
        }
        // ensure the json data is a string
        if (data['response_message'] && !(typeof data['response_message'] === 'string' || data['response_message'] instanceof String)) {
            throw new Error("Expected the field `response_message` to be a primitive type in the JSON string but got " + data['response_message']);
        }

        return true;
    }


}



/**
 * Response status code to indicate success or failed completion of the API call.
 * @member {String} response_code
 */
Get400Response.prototype['response_code'] = undefined;

/**
 * Response message to indicate success or failed completion of the API call.
 * @member {String} response_message
 */
Get400Response.prototype['response_message'] = undefined;






export default Get400Response;

