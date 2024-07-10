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
          console.log('Data: ');
          console.log(data.ip);
          assert.equal(data.ip, ip);
          console.log(data.ip_number);
          console.log(data.ip_version);
          assert.equal(data.ip_version, 4);
          console.log(data.country_name);
          console.log(data.country_code2);
          console.log(data.isp);
          console.log(data.response_code);
          assert.equal(data.response_code, 200);
          console.log(data.response_message);
          assert.equal(data.response_message, 'OK');
        }
        done(error);
      };
      api.rootGet(ip, opts, callback);
    });
  });
});