var OpenapiIplocation = require('openapi_iplocation');

var api = new OpenapiIplocation.DefaultApi();
var ip = '8.8.8.8';
var opts = {
  'format': 'json'
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.rootGet(ip, opts, callback);
