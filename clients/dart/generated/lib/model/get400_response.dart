//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Get400Response {
  /// Returns a new [Get400Response] instance.
  Get400Response({
    this.responseCode,
    this.responseMessage,
  });

  /// Response status code to indicate success or failed completion of the API call.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? responseCode;

  /// Response message to indicate success or failed completion of the API call.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? responseMessage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Get400Response &&
    other.responseCode == responseCode &&
    other.responseMessage == responseMessage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (responseCode == null ? 0 : responseCode!.hashCode) +
    (responseMessage == null ? 0 : responseMessage!.hashCode);

  @override
  String toString() => 'Get400Response[responseCode=$responseCode, responseMessage=$responseMessage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.responseCode != null) {
      json[r'response_code'] = this.responseCode;
    } else {
      json[r'response_code'] = null;
    }
    if (this.responseMessage != null) {
      json[r'response_message'] = this.responseMessage;
    } else {
      json[r'response_message'] = null;
    }
    return json;
  }

  /// Returns a new [Get400Response] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Get400Response? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return Get400Response(
        responseCode: mapValueOfType<String>(json, r'response_code'),
        responseMessage: mapValueOfType<String>(json, r'response_message'),
      );
    }
    return null;
  }

  static List<Get400Response> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Get400Response>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Get400Response.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Get400Response> mapFromJson(dynamic json) {
    final map = <String, Get400Response>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Get400Response.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Get400Response-objects as value to a dart map
  static Map<String, List<Get400Response>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Get400Response>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Get400Response.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

