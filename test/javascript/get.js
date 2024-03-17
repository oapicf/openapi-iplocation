const assert = require('assert');
const OpenapiIplocation = require('openapi_iplocation');
const api = new OpenapiIplocation.DefaultApi();

describe('iplocation get', function() {
  describe('json format', function() {
    it('should return a JSON payload', function(done) {
      const ip = '8.8.8.8';
      const opts = {
        'format': 'json'
      };
      var callback = function(error, data, response) {
        if (error) {
          console.error(error);
          assert.fail();
        } else {
          console.log('Data: ' + data);
        }
      };
      api.rootGet(ip, opts, callback);
    });
  });
});