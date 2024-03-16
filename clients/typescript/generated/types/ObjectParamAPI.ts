import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { Get200Response } from '../models/Get200Response';
import { Get400Response } from '../models/Get400Response';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiRootGetRequest {
    /**
     * An IPv4 or IPv6 address that you would like to lookup.
     * @type any
     * @memberof DefaultApirootGet
     */
    ip: any
    /**
     * Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @type any
     * @memberof DefaultApirootGet
     */
    format?: any
    /**
     * Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     * @type any
     * @memberof DefaultApirootGet
     */
    delimiter?: any
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve geolocation of an IP address. 
     * Get geolocation of an IP address
     * @param param the request object
     */
    public rootGet(param: DefaultApiRootGetRequest, options?: Configuration): Promise<Get200Response> {
        return this.api.rootGet(param.ip, param.format, param.delimiter,  options).toPromise();
    }

}
