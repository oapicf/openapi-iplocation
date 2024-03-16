{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getIplocationNetAPIHomeR" $
        it "returns 501 Not Implemented" $ do
            get IplocationNetAPIHomeR
            statusIs 501
