//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Get200Response {
  /// Returns a new [Get200Response] instance.
  Get200Response({
    this.ip,
    this.ipNumber,
    this.ipVersion,
    this.countryName,
    this.countryCode2,
    this.isp,
    this.responseCode,
    this.responseMessage,
  });

  /// IPv4 or IPv6 address used to lookup geolocation.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ip;

  /// IP number in long integer (represented as string).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ipNumber;

  /// IP version either 4 or 6.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ipVersion;

  /// Full name of the IP country.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? countryName;

  /// ISO ALPHA-2 Country Code.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? countryCode2;

  /// Internet Service Provider (ISP) who owns the IP address.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? isp;

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
  bool operator ==(Object other) => identical(this, other) || other is Get200Response &&
    other.ip == ip &&
    other.ipNumber == ipNumber &&
    other.ipVersion == ipVersion &&
    other.countryName == countryName &&
    other.countryCode2 == countryCode2 &&
    other.isp == isp &&
    other.responseCode == responseCode &&
    other.responseMessage == responseMessage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ip == null ? 0 : ip!.hashCode) +
    (ipNumber == null ? 0 : ipNumber!.hashCode) +
    (ipVersion == null ? 0 : ipVersion!.hashCode) +
    (countryName == null ? 0 : countryName!.hashCode) +
    (countryCode2 == null ? 0 : countryCode2!.hashCode) +
    (isp == null ? 0 : isp!.hashCode) +
    (responseCode == null ? 0 : responseCode!.hashCode) +
    (responseMessage == null ? 0 : responseMessage!.hashCode);

  @override
  String toString() => 'Get200Response[ip=$ip, ipNumber=$ipNumber, ipVersion=$ipVersion, countryName=$countryName, countryCode2=$countryCode2, isp=$isp, responseCode=$responseCode, responseMessage=$responseMessage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ip != null) {
      json[r'ip'] = this.ip;
    } else {
      json[r'ip'] = null;
    }
    if (this.ipNumber != null) {
      json[r'ip_number'] = this.ipNumber;
    } else {
      json[r'ip_number'] = null;
    }
    if (this.ipVersion != null) {
      json[r'ip_version'] = this.ipVersion;
    } else {
      json[r'ip_version'] = null;
    }
    if (this.countryName != null) {
      json[r'country_name'] = this.countryName;
    } else {
      json[r'country_name'] = null;
    }
    if (this.countryCode2 != null) {
      json[r'country_code2'] = this.countryCode2;
    } else {
      json[r'country_code2'] = null;
    }
    if (this.isp != null) {
      json[r'isp'] = this.isp;
    } else {
      json[r'isp'] = null;
    }
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

  /// Returns a new [Get200Response] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Get200Response? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Get200Response[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Get200Response[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Get200Response(
        ip: mapValueOfType<String>(json, r'ip'),
        ipNumber: mapValueOfType<String>(json, r'ip_number'),
        ipVersion: mapValueOfType<int>(json, r'ip_version'),
        countryName: mapValueOfType<String>(json, r'country_name'),
        countryCode2: mapValueOfType<String>(json, r'country_code2'),
        isp: mapValueOfType<String>(json, r'isp'),
        responseCode: mapValueOfType<String>(json, r'response_code'),
        responseMessage: mapValueOfType<String>(json, r'response_message'),
      );
    }
    return null;
  }

  static List<Get200Response> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Get200Response>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Get200Response.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Get200Response> mapFromJson(dynamic json) {
    final map = <String, Get200Response>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Get200Response.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Get200Response-objects as value to a dart map
  static Map<String, List<Get200Response>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Get200Response>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Get200Response.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

