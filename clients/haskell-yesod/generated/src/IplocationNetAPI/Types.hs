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
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data Get200Response = Get200Response
  { get200ResponseIp :: Maybe Text -- ^ IPv4 or IPv6 address used to lookup geolocation.
  , get200ResponseIpUnderscorenumber :: Maybe Int64 -- ^ IP number in long integer.
  , get200ResponseIpUnderscoreversion :: Maybe Int -- ^ IP version either 4 or 6.
  , get200ResponseCountryUnderscorename :: Maybe Text -- ^ Full name of the IP country.
  , get200ResponseCountryUnderscorecode2 :: Maybe Text -- ^ ISO ALPHA-2 Country Code.
  , get200ResponseIsp :: Maybe Text -- ^ Internet Service Provider (ISP) who owns the IP address.
  , get200ResponseResponseUnderscorecode :: Maybe Text -- ^ Response status code to indicate success or failed completion of the API call.
  , get200ResponseResponseUnderscoremessage :: Maybe Text -- ^ Response message to indicate success or failed completion of the API call.
  } deriving (Show, Eq, Generic)

instance FromJSON Get200Response where
  parseJSON = genericParseJSON optionsGet200Response
instance ToJSON Get200Response where
  toJSON = genericToJSON optionsGet200Response

optionsGet200Response :: Options
optionsGet200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("get200ResponseIp", "ip")
      , ("get200ResponseIpUnderscorenumber", "ip_number")
      , ("get200ResponseIpUnderscoreversion", "ip_version")
      , ("get200ResponseCountryUnderscorename", "country_name")
      , ("get200ResponseCountryUnderscorecode2", "country_code2")
      , ("get200ResponseIsp", "isp")
      , ("get200ResponseResponseUnderscorecode", "response_code")
      , ("get200ResponseResponseUnderscoremessage", "response_message")
      ]


-- | 
data Get400Response = Get400Response
  { get400ResponseResponseUnderscorecode :: Maybe Text -- ^ Response status code to indicate success or failed completion of the API call.
  , get400ResponseResponseUnderscoremessage :: Maybe Text -- ^ Response message to indicate success or failed completion of the API call.
  } deriving (Show, Eq, Generic)

instance FromJSON Get400Response where
  parseJSON = genericParseJSON optionsGet400Response
instance ToJSON Get400Response where
  toJSON = genericToJSON optionsGet400Response

optionsGet400Response :: Options
optionsGet400Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("get400ResponseResponseUnderscorecode", "response_code")
      , ("get400ResponseResponseUnderscoremessage", "response_message")
      ]

