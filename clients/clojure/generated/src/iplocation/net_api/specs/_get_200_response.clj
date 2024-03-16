(ns iplocation/net-api.specs.-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            [iplocation/net-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def -get-200-response-data
  {
   (ds/opt :ip) any-type-spec
   (ds/opt :ip_number) any-type-spec
   (ds/opt :ip_version) any-type-spec
   (ds/opt :country_name) any-type-spec
   (ds/opt :country_code2) any-type-spec
   (ds/opt :isp) any-type-spec
   (ds/opt :response_code) any-type-spec
   (ds/opt :response_message) any-type-spec
   })

(def -get-200-response-spec
  (ds/spec
    {:name ::-get-200-response
     :spec -get-200-response-data}))
