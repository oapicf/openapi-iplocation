//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get200_response.g.dart';

/// Get200Response
///
/// Properties:
/// * [ip] - IPv4 or IPv6 address used to lookup geolocation.
/// * [ipNumber] - IP number in long integer (represented as string).
/// * [ipVersion] - IP version either 4 or 6.
/// * [countryName] - Full name of the IP country.
/// * [countryCode2] - ISO ALPHA-2 Country Code.
/// * [isp] - Internet Service Provider (ISP) who owns the IP address.
/// * [responseCode] - Response status code to indicate success or failed completion of the API call.
/// * [responseMessage] - Response message to indicate success or failed completion of the API call.
@BuiltValue()
abstract class Get200Response implements Built<Get200Response, Get200ResponseBuilder> {
  /// IPv4 or IPv6 address used to lookup geolocation.
  @BuiltValueField(wireName: r'ip')
  String? get ip;

  /// IP number in long integer (represented as string).
  @BuiltValueField(wireName: r'ip_number')
  String? get ipNumber;

  /// IP version either 4 or 6.
  @BuiltValueField(wireName: r'ip_version')
  int? get ipVersion;

  /// Full name of the IP country.
  @BuiltValueField(wireName: r'country_name')
  String? get countryName;

  /// ISO ALPHA-2 Country Code.
  @BuiltValueField(wireName: r'country_code2')
  String? get countryCode2;

  /// Internet Service Provider (ISP) who owns the IP address.
  @BuiltValueField(wireName: r'isp')
  String? get isp;

  /// Response status code to indicate success or failed completion of the API call.
  @BuiltValueField(wireName: r'response_code')
  String? get responseCode;

  /// Response message to indicate success or failed completion of the API call.
  @BuiltValueField(wireName: r'response_message')
  String? get responseMessage;

  Get200Response._();

  factory Get200Response([void updates(Get200ResponseBuilder b)]) = _$Get200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(Get200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Get200Response> get serializer => _$Get200ResponseSerializer();
}

class _$Get200ResponseSerializer implements PrimitiveSerializer<Get200Response> {
  @override
  final Iterable<Type> types = const [Get200Response, _$Get200Response];

  @override
  final String wireName = r'Get200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Get200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ip != null) {
      yield r'ip';
      yield serializers.serialize(
        object.ip,
        specifiedType: const FullType(String),
      );
    }
    if (object.ipNumber != null) {
      yield r'ip_number';
      yield serializers.serialize(
        object.ipNumber,
        specifiedType: const FullType(String),
      );
    }
    if (object.ipVersion != null) {
      yield r'ip_version';
      yield serializers.serialize(
        object.ipVersion,
        specifiedType: const FullType(int),
      );
    }
    if (object.countryName != null) {
      yield r'country_name';
      yield serializers.serialize(
        object.countryName,
        specifiedType: const FullType(String),
      );
    }
    if (object.countryCode2 != null) {
      yield r'country_code2';
      yield serializers.serialize(
        object.countryCode2,
        specifiedType: const FullType(String),
      );
    }
    if (object.isp != null) {
      yield r'isp';
      yield serializers.serialize(
        object.isp,
        specifiedType: const FullType(String),
      );
    }
    if (object.responseCode != null) {
      yield r'response_code';
      yield serializers.serialize(
        object.responseCode,
        specifiedType: const FullType(String),
      );
    }
    if (object.responseMessage != null) {
      yield r'response_message';
      yield serializers.serialize(
        object.responseMessage,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Get200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required Get200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ip':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.ip = valueDes;
          break;
        case r'ip_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.ipNumber = valueDes;
          break;
        case r'ip_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ipVersion = valueDes;
          break;
        case r'country_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.countryName = valueDes;
          break;
        case r'country_code2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.countryCode2 = valueDes;
          break;
        case r'isp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.isp = valueDes;
          break;
        case r'response_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.responseCode = valueDes;
          break;
        case r'response_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.responseMessage = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Get200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = Get200ResponseBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

