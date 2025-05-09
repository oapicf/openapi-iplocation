# Get400Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseCode** | Pointer to **string** | Response status code to indicate success or failed completion of the API call. | [optional] 
**ResponseMessage** | Pointer to **string** | Response message to indicate success or failed completion of the API call. | [optional] 

## Methods

### NewGet400Response

`func NewGet400Response() *Get400Response`

NewGet400Response instantiates a new Get400Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGet400ResponseWithDefaults

`func NewGet400ResponseWithDefaults() *Get400Response`

NewGet400ResponseWithDefaults instantiates a new Get400Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseCode

`func (o *Get400Response) GetResponseCode() string`

GetResponseCode returns the ResponseCode field if non-nil, zero value otherwise.

### GetResponseCodeOk

`func (o *Get400Response) GetResponseCodeOk() (*string, bool)`

GetResponseCodeOk returns a tuple with the ResponseCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseCode

`func (o *Get400Response) SetResponseCode(v string)`

SetResponseCode sets ResponseCode field to given value.

### HasResponseCode

`func (o *Get400Response) HasResponseCode() bool`

HasResponseCode returns a boolean if a field has been set.

### GetResponseMessage

`func (o *Get400Response) GetResponseMessage() string`

GetResponseMessage returns the ResponseMessage field if non-nil, zero value otherwise.

### GetResponseMessageOk

`func (o *Get400Response) GetResponseMessageOk() (*string, bool)`

GetResponseMessageOk returns a tuple with the ResponseMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseMessage

`func (o *Get400Response) SetResponseMessage(v string)`

SetResponseMessage sets ResponseMessage field to given value.

### HasResponseMessage

`func (o *Get400Response) HasResponseMessage() bool`

HasResponseMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


