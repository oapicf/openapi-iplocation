const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
            'response_code': bundle.inputData?.[`${keyPrefix}response_code`],
            'response_message': bundle.inputData?.[`${keyPrefix}response_message`],
        }
    },
}
