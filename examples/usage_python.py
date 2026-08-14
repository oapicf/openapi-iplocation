import openapiiplocation
from openapiiplocation.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.iplocation.net
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiiplocation.Configuration(
    host = "https://api.iplocation.net"
)

# Enter a context with an instance of the API client
with openapiiplocation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiiplocation.DefaultApi(api_client)

    try:
        # Look up IP location in JSON format
        api_response = api_instance.root_get('8.8.8.8', format='json')
        print("The response of DefaultApi->root_get:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling DefaultApi->root_get: %s\n" % e)
        raise
