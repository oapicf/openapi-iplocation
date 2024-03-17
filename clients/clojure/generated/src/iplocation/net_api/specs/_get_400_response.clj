(ns iplocation/net-api.specs.-get-400-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -get-400-response-data
  {
   (ds/opt :response_code) string?
   (ds/opt :response_message) string?
   })

(def -get-400-response-spec
  (ds/spec
    {:name ::-get-400-response
     :spec -get-400-response-data}))
