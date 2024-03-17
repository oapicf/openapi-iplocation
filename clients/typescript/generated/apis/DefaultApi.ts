// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Get200Response } from '../models/Get200Response';
import { Get400Response } from '../models/Get400Response';

/**
 * no description
 */
export class DefaultApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Retrieve geolocation of an IP address. 
     * Get geolocation of an IP address
     * @param ip An IPv4 or IPv6 address that you would like to lookup.
     * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     */
    public async rootGet(ip: string, format?: string, delimiter?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'ip' is not null or undefined
        if (ip === null || ip === undefined) {
            throw new RequiredError("DefaultApi", "rootGet", "ip");
        }




        // Path Params
        const localVarPath = '/';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (ip !== undefined) {
            requestContext.setQueryParam("ip", ObjectSerializer.serialize(ip, "string", ""));
        }

        // Query Params
        if (format !== undefined) {
            requestContext.setQueryParam("format", ObjectSerializer.serialize(format, "string", ""));
        }

        // Query Params
        if (delimiter !== undefined) {
            requestContext.setQueryParam("delimiter", ObjectSerializer.serialize(delimiter, "string", ""));
        }


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class DefaultApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to rootGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async rootGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Get200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Get200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Get200Response", ""
            ) as Get200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Get400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Get400Response", ""
            ) as Get400Response;
            throw new ApiException<Get400Response>(response.httpStatusCode, "Failed to complete the request.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Get400Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Get400Response", ""
            ) as Get400Response;
            throw new ApiException<Get400Response>(response.httpStatusCode, "Command not found.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Get200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Get200Response", ""
            ) as Get200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
