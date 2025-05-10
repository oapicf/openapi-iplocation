import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions, PromiseConfigurationOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

import { Get200Response } from '../models/Get200Response';
import { Get400Response } from '../models/Get400Response';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve geolocation of an IP address. 
     * Get geolocation of an IP address
     * @param ip An IPv4 or IPv6 address that you would like to lookup.
     * @param [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @param [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     */
    public rootGetWithHttpInfo(ip: string, format?: string, delimiter?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<Get200Response>> {
        let observableOptions: undefined | ConfigurationOptions
        if (_options){
	    observableOptions = {
                baseServer: _options.baseServer,
                httpApi: _options.httpApi,
                middleware: _options.middleware?.map(
                    m => new PromiseMiddlewareWrapper(m)
		),
		middlewareMergeStrategy: _options.middlewareMergeStrategy,
                authMethods: _options.authMethods
	    }
	}
        const result = this.api.rootGetWithHttpInfo(ip, format, delimiter, observableOptions);
        return result.toPromise();
    }

    /**
     * Retrieve geolocation of an IP address. 
     * Get geolocation of an IP address
     * @param ip An IPv4 or IPv6 address that you would like to lookup.
     * @param [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @param [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     */
    public rootGet(ip: string, format?: string, delimiter?: string, _options?: PromiseConfigurationOptions): Promise<Get200Response> {
        let observableOptions: undefined | ConfigurationOptions
        if (_options){
	    observableOptions = {
                baseServer: _options.baseServer,
                httpApi: _options.httpApi,
                middleware: _options.middleware?.map(
                    m => new PromiseMiddlewareWrapper(m)
		),
		middlewareMergeStrategy: _options.middlewareMergeStrategy,
                authMethods: _options.authMethods
	    }
	}
        const result = this.api.rootGet(ip, format, delimiter, observableOptions);
        return result.toPromise();
    }


}



