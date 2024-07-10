import unittest
import openapiiplocation
from openapiiplocation.rest import ApiException
from pprint import pprint

class TestIpLocation(unittest.TestCase):

    def test_json_format(self):

      configuration = openapiiplocation.Configuration(
          host = "https://api.iplocation.net"
      )

      with openapiiplocation.ApiClient(configuration) as api_client:

          api_instance = openapiiplocation.DefaultApi(api_client)

          try:
              api_response = api_instance.root_get('8.8.8.8', format='json')
              print("The response of DefaultApi->root_get:\n")
              pprint(api_response)
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->root_get: %s\n' % e)