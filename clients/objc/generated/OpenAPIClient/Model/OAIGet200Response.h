#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 1.0.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAIGet200Response
@end

@interface OAIGet200Response : OAIObject

/* IPv4 or IPv6 address used to lookup geolocation. [optional]
 */
@property(nonatomic) NSString* ip;
/* IP number in long integer (represented as string). [optional]
 */
@property(nonatomic) NSString* ipNumber;
/* IP version either 4 or 6. [optional]
 */
@property(nonatomic) NSNumber* ipVersion;
/* Full name of the IP country. [optional]
 */
@property(nonatomic) NSString* countryName;
/* ISO ALPHA-2 Country Code. [optional]
 */
@property(nonatomic) NSString* countryCode2;
/* Internet Service Provider (ISP) who owns the IP address. [optional]
 */
@property(nonatomic) NSString* isp;
/* Response status code to indicate success or failed completion of the API call. [optional]
 */
@property(nonatomic) NSString* responseCode;
/* Response message to indicate success or failed completion of the API call. [optional]
 */
@property(nonatomic) NSString* responseMessage;

@end
