#import <Foundation/Foundation.h>
#import "OAIGet200Response.h"
#import "OAIGet400Response.h"
#import "OAIApi.h"

/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 1.1.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIDefaultApi: NSObject <OAIApi>

extern NSString* kOAIDefaultApiErrorDomain;
extern NSInteger kOAIDefaultApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get geolocation of an IP address
/// Retrieve geolocation of an IP address. 
///
/// @param ip An IPv4 or IPv6 address that you would like to lookup.
/// @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
/// @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
/// 
///  code:200 message:"Successfully processed the request.",
///  code:400 message:"Failed to complete the request.",
///  code:404 message:"Command not found."
///
/// @return OAIGet200Response*
-(NSURLSessionTask*) rootGetWithIp: (NSString*) ip
    format: (NSString*) format
    delimiter: (NSString*) delimiter
    completionHandler: (void (^)(OAIGet200Response* output, NSError* error)) handler;



@end
