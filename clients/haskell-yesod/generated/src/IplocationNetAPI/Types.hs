{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module IplocationNetAPI.Types (
  Get200Response (..),
  Get400Response (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data Get200Response = Get200Response
  { get200ResponseIp :: Maybe Value -- ^ IPv4 or IPv6 address used to lookup geolocation.
  , get200ResponseIpUnderscorenumber :: Maybe Value -- ^ IP number in long integer.
  , get200ResponseIpUnderscoreversion :: Maybe Value -- ^ IP version either 4 or 6.
  , get200ResponseCountryUnderscorename :: Maybe Value -- ^ Full name of the IP country.
  , get200ResponseCountryUnderscorecode2 :: Maybe Value -- ^ ISO ALPHA-2 Country Code.
  , get200ResponseIsp :: Maybe Value -- ^ Internet Service Provider (ISP) who owns the IP address.
  , get200ResponseResponseUnderscorecode :: Maybe Value -- ^ Response status code to indicate success or failed completion of the API call.
  , get200ResponseResponseUnderscoremessage :: Maybe Value -- ^ Response message to indicate success or failed completion of the API call.
  } deriving (Show, Eq, Generic)

instance FromJSON Get200Response where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "get200Response")
instance ToJSON Get200Response where
  toJSON = genericToJSON (removeFieldLabelPrefix False "get200Response")


-- | 
data Get400Response = Get400Response
  { get400ResponseResponseUnderscorecode :: Maybe Value -- ^ Response status code to indicate success or failed completion of the API call.
  , get400ResponseResponseUnderscoremessage :: Maybe Value -- ^ Response message to indicate success or failed completion of the API call.
  } deriving (Show, Eq, Generic)

instance FromJSON Get400Response where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "get400Response")
instance ToJSON Get400Response where
  toJSON = genericToJSON (removeFieldLabelPrefix False "get400Response")


uncapitalize :: String -> String
uncapitalize (c : cs) = Char.toLower c : cs
uncapitalize [] = []

-- | Remove a field label prefix during JSON parsing.
--   Also perform any replacements for special characters.
--   The @forParsing@ parameter is to distinguish between the cases in which we're using this
--   to power a @FromJSON@ or a @ToJSON@ instance. In the first case we're parsing, and we want
--   to replace special characters with their quoted equivalents (because we cannot have special
--   chars in identifier names), while we want to do vice versa when sending data instead.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("$", "'Dollar")
      , ("^", "'Caret")
      , ("|", "'Pipe")
      , ("=", "'Equal")
      , ("*", "'Star")
      , ("-", "'Dash")
      , ("&", "'Ampersand")
      , ("%", "'Percent")
      , ("#", "'Hash")
      , ("@", "'At")
      , ("!", "'Exclamation")
      , ("+", "'Plus")
      , (":", "'Colon")
      , (";", "'Semicolon")
      , (">", "'GreaterThan")
      , ("<", "'LessThan")
      , (".", "'Period")
      , ("_", "'Underscore")
      , ("?", "'Question_Mark")
      , (",", "'Comma")
      , ("'", "'Quote")
      , ("/", "'Slash")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("{", "'Left_Curly_Bracket")
      , ("}", "'Right_Curly_Bracket")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("~", "'Tilde")
      , ("`", "'Backtick")
      , ("<=", "'Less_Than_Or_Equal_To")
      , (">=", "'Greater_Than_Or_Equal_To")
      , ("!=", "'Not_Equal")
      , ("<>", "'Not_Equal")
      , ("~=", "'Tilde_Equal")
      , ("\\", "'Back_Slash")
      , ("\"", "'Double_Quote")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
