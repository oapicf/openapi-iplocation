{-
   iplocation.net API
   OpenAPI v3 specification and a set of generated API clients for iplocation.net

   The version of the OpenAPI document: 1.0.1-pre.0
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Data exposing
    ( Get200Response
    , Get400Response
    , encodeGet200Response
    , encodeGet400Response
    , get200ResponseDecoder
    , get400ResponseDecoder
    )

import Api
import Dict
import Json.Decode
import Json.Encode


-- MODEL


type alias Get200Response =
    { ip : Maybe String
    , ipNumber : Maybe String
    , ipVersion : Maybe Int
    , countryName : Maybe String
    , countryCode2 : Maybe String
    , isp : Maybe String
    , responseCode : Maybe String
    , responseMessage : Maybe String
    }


type alias Get400Response =
    { responseCode : Maybe String
    , responseMessage : Maybe String
    }


-- ENCODER


encodeGet200Response : Get200Response -> Json.Encode.Value
encodeGet200Response =
    encodeObject << encodeGet200ResponsePairs


encodeGet200ResponseWithTag : ( String, String ) -> Get200Response -> Json.Encode.Value
encodeGet200ResponseWithTag (tagField, tag) model =
    encodeObject (encodeGet200ResponsePairs model ++ [ encode tagField Json.Encode.string tag ])


encodeGet200ResponsePairs : Get200Response -> List EncodedField
encodeGet200ResponsePairs model =
    let
        pairs =
            [ maybeEncode "ip" Json.Encode.string model.ip
            , maybeEncode "ip_number" Json.Encode.string model.ipNumber
            , maybeEncode "ip_version" Json.Encode.int model.ipVersion
            , maybeEncode "country_name" Json.Encode.string model.countryName
            , maybeEncode "country_code2" Json.Encode.string model.countryCode2
            , maybeEncode "isp" Json.Encode.string model.isp
            , maybeEncode "response_code" Json.Encode.string model.responseCode
            , maybeEncode "response_message" Json.Encode.string model.responseMessage
            ]
    in
    pairs


encodeGet400Response : Get400Response -> Json.Encode.Value
encodeGet400Response =
    encodeObject << encodeGet400ResponsePairs


encodeGet400ResponseWithTag : ( String, String ) -> Get400Response -> Json.Encode.Value
encodeGet400ResponseWithTag (tagField, tag) model =
    encodeObject (encodeGet400ResponsePairs model ++ [ encode tagField Json.Encode.string tag ])


encodeGet400ResponsePairs : Get400Response -> List EncodedField
encodeGet400ResponsePairs model =
    let
        pairs =
            [ maybeEncode "response_code" Json.Encode.string model.responseCode
            , maybeEncode "response_message" Json.Encode.string model.responseMessage
            ]
    in
    pairs


-- DECODER


get200ResponseDecoder : Json.Decode.Decoder Get200Response
get200ResponseDecoder =
    Json.Decode.succeed Get200Response
        |> maybeDecode "ip" Json.Decode.string Nothing
        |> maybeDecode "ip_number" Json.Decode.string Nothing
        |> maybeDecode "ip_version" Json.Decode.int Nothing
        |> maybeDecode "country_name" Json.Decode.string Nothing
        |> maybeDecode "country_code2" Json.Decode.string Nothing
        |> maybeDecode "isp" Json.Decode.string Nothing
        |> maybeDecode "response_code" Json.Decode.string Nothing
        |> maybeDecode "response_message" Json.Decode.string Nothing


get400ResponseDecoder : Json.Decode.Decoder Get400Response
get400ResponseDecoder =
    Json.Decode.succeed Get400Response
        |> maybeDecode "response_code" Json.Decode.string Nothing
        |> maybeDecode "response_message" Json.Decode.string Nothing




-- HELPER


type alias EncodedField =
    Maybe ( String, Json.Encode.Value )


encodeObject : List EncodedField -> Json.Encode.Value
encodeObject =
    Json.Encode.object << List.filterMap identity


encode : String -> (a -> Json.Encode.Value) -> a -> EncodedField
encode key encoder value =
    Just ( key, encoder value )


encodeNullable : String -> (a -> Json.Encode.Value) -> Maybe a -> EncodedField
encodeNullable key encoder value =
    Just ( key, Maybe.withDefault Json.Encode.null (Maybe.map encoder value) )


maybeEncode : String -> (a -> Json.Encode.Value) -> Maybe a -> EncodedField
maybeEncode key encoder =
    Maybe.map (Tuple.pair key << encoder)


maybeEncodeNullable : String -> (a -> Json.Encode.Value) -> Maybe a -> EncodedField
maybeEncodeNullable =
    encodeNullable


decode : String -> Json.Decode.Decoder a -> Json.Decode.Decoder (a -> b) -> Json.Decode.Decoder b
decode key decoder =
    decodeChain (Json.Decode.field key decoder)


decodeLazy : (a -> c) -> String -> Json.Decode.Decoder a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
decodeLazy f key decoder =
    decodeChainLazy f (Json.Decode.field key decoder)


decodeNullable : String -> Json.Decode.Decoder a -> Json.Decode.Decoder (Maybe a -> b) -> Json.Decode.Decoder b
decodeNullable key decoder =
    decodeChain (maybeField key decoder Nothing)


decodeNullableLazy : (Maybe a -> c) -> String -> Json.Decode.Decoder a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
decodeNullableLazy f key decoder =
    decodeChainLazy f (maybeField key decoder Nothing)


maybeDecode : String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (Maybe a -> b) -> Json.Decode.Decoder b
maybeDecode key decoder fallback =
    -- let's be kind to null-values as well
    decodeChain (maybeField key decoder fallback)


maybeDecodeLazy : (Maybe a -> c) -> String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
maybeDecodeLazy f key decoder fallback =
    -- let's be kind to null-values as well
    decodeChainLazy f (maybeField key decoder fallback)


maybeDecodeNullable : String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (Maybe a -> b) -> Json.Decode.Decoder b
maybeDecodeNullable key decoder fallback =
    decodeChain (maybeField key decoder fallback)


maybeDecodeNullableLazy : (Maybe a -> c) -> String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
maybeDecodeNullableLazy f key decoder fallback =
    decodeChainLazy f (maybeField key decoder fallback)


maybeField : String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (Maybe a)
maybeField key decoder fallback =
    let
        fieldDecoder =
            Json.Decode.field key Json.Decode.value

        valueDecoder =
            Json.Decode.oneOf [ Json.Decode.map Just decoder, Json.Decode.null fallback ]

        decodeObject rawObject =
            case Json.Decode.decodeValue fieldDecoder rawObject of
                Ok rawValue ->
                    case Json.Decode.decodeValue valueDecoder rawValue of
                        Ok value ->
                            Json.Decode.succeed value

                        Err error ->
                            Json.Decode.fail (Json.Decode.errorToString error)

                Err _ ->
                    Json.Decode.succeed fallback
    in
    Json.Decode.value
        |> Json.Decode.andThen decodeObject


decodeChain : Json.Decode.Decoder a -> Json.Decode.Decoder (a -> b) -> Json.Decode.Decoder b
decodeChain =
    Json.Decode.map2 (|>)


decodeChainLazy : (a -> c) -> Json.Decode.Decoder a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
decodeChainLazy f =
    decodeChain << Json.Decode.map f