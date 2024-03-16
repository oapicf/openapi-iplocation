/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get geolocation of an IP address
* Retrieve geolocation of an IP address. 
*
* ip oas_any_type_not_mapped An IPv4 or IPv6 address that you would like to lookup.
* format oas_any_type_not_mapped Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
* delimiter oas_any_type_not_mapped Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\". (optional)
* returns __get_200_response
* */
const rootGET = ({ ip, format, delimiter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ip,
        format,
        delimiter,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  rootGET,
};
