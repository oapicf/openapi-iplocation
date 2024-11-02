const samples = require('../samples/DefaultApi');
const __get_200_response = require('../models/__get_200_response');
const __get_400_response = require('../models/__get_400_response');
const utils = require('../utils/utils');

module.exports = {
    rootGet: {
        key: 'rootGet',
        noun: 'default',
        display: {
            label: 'Get geolocation of an IP address',
            description: 'Retrieve geolocation of an IP address. ',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ip',
                    label: 'An IPv4 or IPv6 address that you would like to lookup.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'format',
                    label: 'Output format, the following formats are supported: plain xml json jsonp php csv serialized',
                    type: 'string',
                },
                {
                    key: 'delimiter',
                    label: 'Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...__get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.iplocation.net/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'ip': bundle.inputData?.['ip'],
                        'format': bundle.inputData?.['format'],
                        'delimiter': bundle.inputData?.['delimiter'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'rootGet', response.json);
                    return results;
                })
            },
            sample: samples['__get_200_responseSample']
        }
    },
}
