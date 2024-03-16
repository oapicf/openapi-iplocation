#import "OAIGet200Response.h"

@implementation OAIGet200Response

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"ip": @"ip", @"ipNumber": @"ip_number", @"ipVersion": @"ip_version", @"countryName": @"country_name", @"countryCode2": @"country_code2", @"isp": @"isp", @"responseCode": @"response_code", @"responseMessage": @"response_message" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"ip", @"ipNumber", @"ipVersion", @"countryName", @"countryCode2", @"isp", @"responseCode", @"responseMessage"];
  return [optionalProperties containsObject:propertyName];
}

@end
