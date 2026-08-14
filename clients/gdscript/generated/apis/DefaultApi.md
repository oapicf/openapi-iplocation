<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**root_get**](#root_get) | **GET** `/` | Get geolocation of an IP address

# **root_get**   { #root_get }
<a name="root_get"></a>

> `root_get(some_ip: String,format = null,delimiter = null, on_success: Callable, on_failure: Callable)`

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.root_get(
	# some_ip: String   Eg: some_ip_example
	# An IPv4 or IPv6 address that you would like to lookup.
	some_ip,
	# format: String   Eg: format_example
	# Output format, the following formats are supported: plain xml json jsonp php csv serialized
	format,
	# delimiter: String   Eg: delimiter_example
	# Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
	delimiter,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "root_get", response)
		assert(response.data is __get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

