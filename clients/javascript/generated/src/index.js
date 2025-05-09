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


import ApiClient from './ApiClient';
import Get200Response from './model/Get200Response';
import Get400Response from './model/Get400Response';
import DefaultApi from './api/DefaultApi';


/**
* OpenAPI v3 specification and a set of generated API clients for iplocation.net.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var OpenapiIplocation = require('index'); // See note below*.
* var xxxSvc = new OpenapiIplocation.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new OpenapiIplocation.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new OpenapiIplocation.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new OpenapiIplocation.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.1.1-pre.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Get200Response model constructor.
     * @property {module:model/Get200Response}
     */
    Get200Response,

    /**
     * The Get400Response model constructor.
     * @property {module:model/Get400Response}
     */
    Get400Response,

    /**
    * The DefaultApi service constructor.
    * @property {module:api/DefaultApi}
    */
    DefaultApi
};
