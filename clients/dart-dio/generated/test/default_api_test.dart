import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Get geolocation of an IP address
    //
    // Retrieve geolocation of an IP address. 
    //
    //Future<Get200Response> rootGet(String ip, { String format, String delimiter }) async
    test('test rootGet', () async {
      // TODO
    });

  });
}
