(ns iplocation/net-api.specs.-get-400-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def -get-400-response-data
  {
   (ds/opt :response_code) any-type-spec
   (ds/opt :response_message) any-type-spec
   })

(def -get-400-response-spec
  (ds/spec
    {:name ::-get-400-response
     :spec -get-400-response-data}))
