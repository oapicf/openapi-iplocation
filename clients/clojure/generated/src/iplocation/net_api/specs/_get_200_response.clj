(ns iplocation/net-api.specs.-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [iplocation/net-api.specs.int64 :refer :all]
            )
  (:import (java.io File)))


(def -get-200-response-data
  {
   (ds/opt :ip) string?
   (ds/opt :ip_number) int64-spec
   (ds/opt :ip_version) int?
   (ds/opt :country_name) string?
   (ds/opt :country_code2) string?
   (ds/opt :isp) string?
   (ds/opt :response_code) string?
   (ds/opt :response_message) string?
   })

(def -get-200-response-spec
  (ds/spec
    {:name ::-get-200-response
     :spec -get-200-response-data}))
