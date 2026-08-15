//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get400_response.g.dart';

/// Get400Response
///
/// Properties:
/// * [responseCode] - Response status code to indicate success or failed completion of the API call.
/// * [responseMessage] - Response message to indicate success or failed completion of the API call.
@BuiltValue()
abstract class Get400Response implements Built<Get400Response, Get400ResponseBuilder> {
  /// Response status code to indicate success or failed completion of the API call.
  @BuiltValueField(wireName: r'response_code')
  String? get responseCode;

  /// Response message to indicate success or failed completion of the API call.
  @BuiltValueField(wireName: r'response_message')
  String? get responseMessage;

  Get400Response._();

  factory Get400Response([void updates(Get400ResponseBuilder b)]) = _$Get400Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(Get400ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Get400Response> get serializer => _$Get400ResponseSerializer();
}

class _$Get400ResponseSerializer implements PrimitiveSerializer<Get400Response> {
  @override
  final Iterable<Type> types = const [Get400Response, _$Get400Response];

  @override
  final String wireName = r'Get400Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Get400Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    Get400Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required Get400ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  Get400Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = Get400ResponseBuilder();
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

