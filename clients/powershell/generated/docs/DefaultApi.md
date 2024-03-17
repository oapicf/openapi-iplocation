# PSOpenAPITools.PSOpenAPITools\Api.DefaultApi

All URIs are relative to *https://api.iplocation.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-RootGet**](DefaultApi.md#Invoke-RootGet) | **GET** / | Get geolocation of an IP address


<a id="Invoke-RootGet"></a>
# **Invoke-RootGet**
> Get200Response Invoke-RootGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Ip] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Delimiter] <String><br>

Get geolocation of an IP address

Retrieve geolocation of an IP address. 

### Example
```powershell
$Ip = "MyIp" # String | An IPv4 or IPv6 address that you would like to lookup.
$Format = "MyFormat" # String | Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
$Delimiter = "MyDelimiter" # String | Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for ""\n"", 2 for ""<br>"". (optional)

# Get geolocation of an IP address
try {
    $Result = Invoke-RootGet -Ip $Ip -Format $Format -Delimiter $Delimiter
} catch {
    Write-Host ("Exception occurred when calling Invoke-RootGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Ip** | **String**| An IPv4 or IPv6 address that you would like to lookup. | 
 **Format** | **String**| Output format, the following formats are supported: plain xml json jsonp php csv serialized | [optional] 
 **Delimiter** | **String**| Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for &quot;&quot;\n&quot;&quot;, 2 for &quot;&quot;&lt;br&gt;&quot;&quot;. | [optional] 

### Return type

[**Get200Response**](Get200Response.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

