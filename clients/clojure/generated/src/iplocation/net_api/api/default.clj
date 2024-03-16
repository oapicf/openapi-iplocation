(ns iplocation/net-api.api.default
  (:require [iplocation/net-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [iplocation/net-api.specs.-get-400-response :refer :all]
            [iplocation/net-api.specs.-get-200-response :refer :all]
            )
  (:import (java.io File)))


(defn-spec root-get-with-http-info any?
  "Get geolocation of an IP address
  Retrieve geolocation of an IP address."
  ([ip any-type-spec, ] (root-get-with-http-info ip nil))
  ([ip any-type-spec, {:keys [format delimiter]} (s/map-of keyword? any?)]
   (check-required-params ip)
   (call-api "/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"ip" ip "format" format "delimiter" delimiter }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec root-get -get-200-response-spec
  "Get geolocation of an IP address
  Retrieve geolocation of an IP address."
  ([ip any-type-spec, ] (root-get ip nil))
  ([ip any-type-spec, optional-params any?]
   (let [res (:data (root-get-with-http-info ip optional-params))]
     (if (:decode-models *api-context*)
        (st/decode -get-200-response-spec res st/string-transformer)
        res))))


