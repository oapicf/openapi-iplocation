# Get200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ip** | Pointer to **interface{}** | IPv4 or IPv6 address used to lookup geolocation. | [optional] 
**IpNumber** | Pointer to **interface{}** | IP number in long integer. | [optional] 
**IpVersion** | Pointer to **interface{}** | IP version either 4 or 6. | [optional] 
**CountryName** | Pointer to **interface{}** | Full name of the IP country. | [optional] 
**CountryCode2** | Pointer to **interface{}** | ISO ALPHA-2 Country Code. | [optional] 
**Isp** | Pointer to **interface{}** | Internet Service Provider (ISP) who owns the IP address. | [optional] 
**ResponseCode** | Pointer to **interface{}** | Response status code to indicate success or failed completion of the API call. | [optional] 
**ResponseMessage** | Pointer to **interface{}** | Response message to indicate success or failed completion of the API call. | [optional] 

## Methods

### NewGet200Response

`func NewGet200Response() *Get200Response`

NewGet200Response instantiates a new Get200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGet200ResponseWithDefaults

`func NewGet200ResponseWithDefaults() *Get200Response`

NewGet200ResponseWithDefaults instantiates a new Get200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIp

`func (o *Get200Response) GetIp() interface{}`

GetIp returns the Ip field if non-nil, zero value otherwise.

### GetIpOk

`func (o *Get200Response) GetIpOk() (*interface{}, bool)`

GetIpOk returns a tuple with the Ip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIp

`func (o *Get200Response) SetIp(v interface{})`

SetIp sets Ip field to given value.

### HasIp

`func (o *Get200Response) HasIp() bool`

HasIp returns a boolean if a field has been set.

### SetIpNil

`func (o *Get200Response) SetIpNil(b bool)`

 SetIpNil sets the value for Ip to be an explicit nil

### UnsetIp
`func (o *Get200Response) UnsetIp()`

UnsetIp ensures that no value is present for Ip, not even an explicit nil
### GetIpNumber

`func (o *Get200Response) GetIpNumber() interface{}`

GetIpNumber returns the IpNumber field if non-nil, zero value otherwise.

### GetIpNumberOk

`func (o *Get200Response) GetIpNumberOk() (*interface{}, bool)`

GetIpNumberOk returns a tuple with the IpNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpNumber

`func (o *Get200Response) SetIpNumber(v interface{})`

SetIpNumber sets IpNumber field to given value.

### HasIpNumber

`func (o *Get200Response) HasIpNumber() bool`

HasIpNumber returns a boolean if a field has been set.

### SetIpNumberNil

`func (o *Get200Response) SetIpNumberNil(b bool)`

 SetIpNumberNil sets the value for IpNumber to be an explicit nil

### UnsetIpNumber
`func (o *Get200Response) UnsetIpNumber()`

UnsetIpNumber ensures that no value is present for IpNumber, not even an explicit nil
### GetIpVersion

`func (o *Get200Response) GetIpVersion() interface{}`

GetIpVersion returns the IpVersion field if non-nil, zero value otherwise.

### GetIpVersionOk

`func (o *Get200Response) GetIpVersionOk() (*interface{}, bool)`

GetIpVersionOk returns a tuple with the IpVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpVersion

`func (o *Get200Response) SetIpVersion(v interface{})`

SetIpVersion sets IpVersion field to given value.

### HasIpVersion

`func (o *Get200Response) HasIpVersion() bool`

HasIpVersion returns a boolean if a field has been set.

### SetIpVersionNil

`func (o *Get200Response) SetIpVersionNil(b bool)`

 SetIpVersionNil sets the value for IpVersion to be an explicit nil

### UnsetIpVersion
`func (o *Get200Response) UnsetIpVersion()`

UnsetIpVersion ensures that no value is present for IpVersion, not even an explicit nil
### GetCountryName

`func (o *Get200Response) GetCountryName() interface{}`

GetCountryName returns the CountryName field if non-nil, zero value otherwise.

### GetCountryNameOk

`func (o *Get200Response) GetCountryNameOk() (*interface{}, bool)`

GetCountryNameOk returns a tuple with the CountryName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryName

`func (o *Get200Response) SetCountryName(v interface{})`

SetCountryName sets CountryName field to given value.

### HasCountryName

`func (o *Get200Response) HasCountryName() bool`

HasCountryName returns a boolean if a field has been set.

### SetCountryNameNil

`func (o *Get200Response) SetCountryNameNil(b bool)`

 SetCountryNameNil sets the value for CountryName to be an explicit nil

### UnsetCountryName
`func (o *Get200Response) UnsetCountryName()`

UnsetCountryName ensures that no value is present for CountryName, not even an explicit nil
### GetCountryCode2

`func (o *Get200Response) GetCountryCode2() interface{}`

GetCountryCode2 returns the CountryCode2 field if non-nil, zero value otherwise.

### GetCountryCode2Ok

`func (o *Get200Response) GetCountryCode2Ok() (*interface{}, bool)`

GetCountryCode2Ok returns a tuple with the CountryCode2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryCode2

`func (o *Get200Response) SetCountryCode2(v interface{})`

SetCountryCode2 sets CountryCode2 field to given value.

### HasCountryCode2

`func (o *Get200Response) HasCountryCode2() bool`

HasCountryCode2 returns a boolean if a field has been set.

### SetCountryCode2Nil

`func (o *Get200Response) SetCountryCode2Nil(b bool)`

 SetCountryCode2Nil sets the value for CountryCode2 to be an explicit nil

### UnsetCountryCode2
`func (o *Get200Response) UnsetCountryCode2()`

UnsetCountryCode2 ensures that no value is present for CountryCode2, not even an explicit nil
### GetIsp

`func (o *Get200Response) GetIsp() interface{}`

GetIsp returns the Isp field if non-nil, zero value otherwise.

### GetIspOk

`func (o *Get200Response) GetIspOk() (*interface{}, bool)`

GetIspOk returns a tuple with the Isp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsp

`func (o *Get200Response) SetIsp(v interface{})`

SetIsp sets Isp field to given value.

### HasIsp

`func (o *Get200Response) HasIsp() bool`

HasIsp returns a boolean if a field has been set.

### SetIspNil

`func (o *Get200Response) SetIspNil(b bool)`

 SetIspNil sets the value for Isp to be an explicit nil

### UnsetIsp
`func (o *Get200Response) UnsetIsp()`

UnsetIsp ensures that no value is present for Isp, not even an explicit nil
### GetResponseCode

`func (o *Get200Response) GetResponseCode() interface{}`

GetResponseCode returns the ResponseCode field if non-nil, zero value otherwise.

### GetResponseCodeOk

`func (o *Get200Response) GetResponseCodeOk() (*interface{}, bool)`

GetResponseCodeOk returns a tuple with the ResponseCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseCode

`func (o *Get200Response) SetResponseCode(v interface{})`

SetResponseCode sets ResponseCode field to given value.

### HasResponseCode

`func (o *Get200Response) HasResponseCode() bool`

HasResponseCode returns a boolean if a field has been set.

### SetResponseCodeNil

`func (o *Get200Response) SetResponseCodeNil(b bool)`

 SetResponseCodeNil sets the value for ResponseCode to be an explicit nil

### UnsetResponseCode
`func (o *Get200Response) UnsetResponseCode()`

UnsetResponseCode ensures that no value is present for ResponseCode, not even an explicit nil
### GetResponseMessage

`func (o *Get200Response) GetResponseMessage() interface{}`

GetResponseMessage returns the ResponseMessage field if non-nil, zero value otherwise.

### GetResponseMessageOk

`func (o *Get200Response) GetResponseMessageOk() (*interface{}, bool)`

GetResponseMessageOk returns a tuple with the ResponseMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMessage

`func (o *Get200Response) SetResponseMessage(v interface{})`

SetResponseMessage sets ResponseMessage field to given value.

### HasResponseMessage

`func (o *Get200Response) HasResponseMessage() bool`

HasResponseMessage returns a boolean if a field has been set.

### SetResponseMessageNil

`func (o *Get200Response) SetResponseMessageNil(b bool)`

 SetResponseMessageNil sets the value for ResponseMessage to be an explicit nil

### UnsetResponseMessage
`func (o *Get200Response) UnsetResponseMessage()`

UnsetResponseMessage ensures that no value is present for ResponseMessage, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


