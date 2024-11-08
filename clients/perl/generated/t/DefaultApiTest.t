=begin comment

iplocation.net API

OpenAPI v3 specification and a set of generated API clients for iplocation.net

The version of the OpenAPI document: 1.0.1-pre.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::DefaultApi');

my $api = WWW::OpenAPIClient::DefaultApi->new();
isa_ok($api, 'WWW::OpenAPIClient::DefaultApi');

#
# root_get test
#
# uncomment below and update the test
#my $root_get_ip = undef; # replace NULL with a proper value
#my $root_get_format = undef; # replace NULL with a proper value
#my $root_get_delimiter = undef; # replace NULL with a proper value
#my $root_get_result = $api->root_get(ip => $root_get_ip, format => $root_get_format, delimiter => $root_get_delimiter);


done_testing();
