const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ip`,
                label: `IPv4 or IPv6 address used to lookup geolocation. - [${labelPrefix}ip]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ip_number`,
                label: `IP number in long integer (represented as string). - [${labelPrefix}ip_number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ip_version`,
                label: `IP version either 4 or 6. - [${labelPrefix}ip_version]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}country_name`,
                label: `Full name of the IP country. - [${labelPrefix}country_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}country_code2`,
                label: `ISO ALPHA-2 Country Code. - [${labelPrefix}country_code2]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}isp`,
                label: `Internet Service Provider (ISP) who owns the IP address. - [${labelPrefix}isp]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}response_code`,
                label: `Response status code to indicate success or failed completion of the API call. - [${labelPrefix}response_code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}response_message`,
                label: `Response message to indicate success or failed completion of the API call. - [${labelPrefix}response_message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ip': bundle.inputData?.[`${keyPrefix}ip`],
            'ip_number': bundle.inputData?.[`${keyPrefix}ip_number`],
            'ip_version': bundle.inputData?.[`${keyPrefix}ip_version`],
            'country_name': bundle.inputData?.[`${keyPrefix}country_name`],
            'country_code2': bundle.inputData?.[`${keyPrefix}country_code2`],
            'isp': bundle.inputData?.[`${keyPrefix}isp`],
            'response_code': bundle.inputData?.[`${keyPrefix}response_code`],
            'response_message': bundle.inputData?.[`${keyPrefix}response_message`],
        }
    },
}
