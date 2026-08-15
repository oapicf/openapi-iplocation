//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class DefaultApi {
  DefaultApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get geolocation of an IP address
  ///
  /// Retrieve geolocation of an IP address. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] ip (required):
  ///   An IPv4 or IPv6 address that you would like to lookup.
  ///
  /// * [String] format:
  ///   Output format, the following formats are supported: plain xml json jsonp php csv serialized
  ///
  /// * [String] delimiter:
  ///   Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
  Future<Response> rootGetWithHttpInfo(String ip, { String? format, String? delimiter, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'ip', ip));
    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }
    if (delimiter != null) {
      queryParams.addAll(_queryParams('', 'delimiter', delimiter));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get geolocation of an IP address
  ///
  /// Retrieve geolocation of an IP address. 
  ///
  /// Parameters:
  ///
  /// * [String] ip (required):
  ///   An IPv4 or IPv6 address that you would like to lookup.
  ///
  /// * [String] format:
  ///   Output format, the following formats are supported: plain xml json jsonp php csv serialized
  ///
  /// * [String] delimiter:
  ///   Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
  Future<Get200Response?> rootGet(String ip, { String? format, String? delimiter, Future<void>? abortTrigger, }) async {
    final response = await rootGetWithHttpInfo(ip, format: format, delimiter: delimiter, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Get200Response',) as Get200Response;
    
    }
    return null;
  }
}
