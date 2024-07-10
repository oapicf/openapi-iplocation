#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAIGet400Response
@end

@interface OAIGet400Response : OAIObject

/* Response status code to indicate success or failed completion of the API call. [optional]
 */
@property(nonatomic) NSString* responseCode;
/* Response message to indicate success or failed completion of the API call. [optional]
 */
@property(nonatomic) NSString* responseMessage;

@end
