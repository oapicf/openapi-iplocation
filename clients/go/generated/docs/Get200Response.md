# Get200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ip** | Pointer to **string** | IPv4 or IPv6 address used to lookup geolocation. | [optional] 
**IpNumber** | Pointer to **int64** | IP number in long integer. | [optional] 
**IpVersion** | Pointer to **int32** | IP version either 4 or 6. | [optional] 
**CountryName** | Pointer to **string** | Full name of the IP country. | [optional] 
**CountryCode2** | Pointer to **string** | ISO ALPHA-2 Country Code. | [optional] 
**Isp** | Pointer to **string** | Internet Service Provider (ISP) who owns the IP address. | [optional] 
**ResponseCode** | Pointer to **string** | Response status code to indicate success or failed completion of the API call. | [optional] 
**ResponseMessage** | Pointer to **string** | Response message to indicate success or failed completion of the API call. | [optional] 

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

`func (o *Get200Response) GetIp() string`

GetIp returns the Ip field if non-nil, zero value otherwise.

### GetIpOk

`func (o *Get200Response) GetIpOk() (*string, bool)`

GetIpOk returns a tuple with the Ip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIp

`func (o *Get200Response) SetIp(v string)`

SetIp sets Ip field to given value.

### HasIp

`func (o *Get200Response) HasIp() bool`

HasIp returns a boolean if a field has been set.

### GetIpNumber

`func (o *Get200Response) GetIpNumber() int64`

GetIpNumber returns the IpNumber field if non-nil, zero value otherwise.

### GetIpNumberOk

`func (o *Get200Response) GetIpNumberOk() (*int64, bool)`

GetIpNumberOk returns a tuple with the IpNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpNumber

`func (o *Get200Response) SetIpNumber(v int64)`

SetIpNumber sets IpNumber field to given value.

### HasIpNumber

`func (o *Get200Response) HasIpNumber() bool`

HasIpNumber returns a boolean if a field has been set.

### GetIpVersion

`func (o *Get200Response) GetIpVersion() int32`

GetIpVersion returns the IpVersion field if non-nil, zero value otherwise.

### GetIpVersionOk

`func (o *Get200Response) GetIpVersionOk() (*int32, bool)`

GetIpVersionOk returns a tuple with the IpVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpVersion

`func (o *Get200Response) SetIpVersion(v int32)`

SetIpVersion sets IpVersion field to given value.

### HasIpVersion

`func (o *Get200Response) HasIpVersion() bool`

HasIpVersion returns a boolean if a field has been set.

### GetCountryName

`func (o *Get200Response) GetCountryName() string`

GetCountryName returns the CountryName field if non-nil, zero value otherwise.

### GetCountryNameOk

`func (o *Get200Response) GetCountryNameOk() (*string, bool)`

GetCountryNameOk returns a tuple with the CountryName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryName

`func (o *Get200Response) SetCountryName(v string)`

SetCountryName sets CountryName field to given value.

### HasCountryName

`func (o *Get200Response) HasCountryName() bool`

HasCountryName returns a boolean if a field has been set.

### GetCountryCode2

`func (o *Get200Response) GetCountryCode2() string`

GetCountryCode2 returns the CountryCode2 field if non-nil, zero value otherwise.

### GetCountryCode2Ok

`func (o *Get200Response) GetCountryCode2Ok() (*string, bool)`

GetCountryCode2Ok returns a tuple with the CountryCode2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryCode2

`func (o *Get200Response) SetCountryCode2(v string)`

SetCountryCode2 sets CountryCode2 field to given value.

### HasCountryCode2

`func (o *Get200Response) HasCountryCode2() bool`

HasCountryCode2 returns a boolean if a field has been set.

### GetIsp

`func (o *Get200Response) GetIsp() string`

GetIsp returns the Isp field if non-nil, zero value otherwise.

### GetIspOk

`func (o *Get200Response) GetIspOk() (*string, bool)`

GetIspOk returns a tuple with the Isp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsp

`func (o *Get200Response) SetIsp(v string)`

SetIsp sets Isp field to given value.

### HasIsp

`func (o *Get200Response) HasIsp() bool`

HasIsp returns a boolean if a field has been set.

### GetResponseCode

`func (o *Get200Response) GetResponseCode() string`

GetResponseCode returns the ResponseCode field if non-nil, zero value otherwise.

### GetResponseCodeOk

`func (o *Get200Response) GetResponseCodeOk() (*string, bool)`

GetResponseCodeOk returns a tuple with the ResponseCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseCode

`func (o *Get200Response) SetResponseCode(v string)`

SetResponseCode sets ResponseCode field to given value.

### HasResponseCode

`func (o *Get200Response) HasResponseCode() bool`

HasResponseCode returns a boolean if a field has been set.

### GetResponseMessage

`func (o *Get200Response) GetResponseMessage() string`

GetResponseMessage returns the ResponseMessage field if non-nil, zero value otherwise.

### GetResponseMessageOk

`func (o *Get200Response) GetResponseMessageOk() (*string, bool)`

GetResponseMessageOk returns a tuple with the ResponseMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMessage

`func (o *Get200Response) SetResponseMessage(v string)`

SetResponseMessage sets ResponseMessage field to given value.

### HasResponseMessage

`func (o *Get200Response) HasResponseMessage() bool`

HasResponseMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


