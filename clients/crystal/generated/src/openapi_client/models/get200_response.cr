# #iplocation.net API
#
##OpenAPI v3 specification and a set of generated API clients for iplocation.net
#
#The version of the OpenAPI document: 0.9.0-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.6.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class Get200Response
    include JSON::Serializable

    # Optional properties
    # IPv4 or IPv6 address used to lookup geolocation.
    @[JSON::Field(key: "ip", type: String?, nillable: true, emit_null: false)]
    property ip : String?

    # IP number in long integer (represented as string).
    @[JSON::Field(key: "ip_number", type: String?, nillable: true, emit_null: false)]
    property ip_number : String?

    # IP version either 4 or 6.
    @[JSON::Field(key: "ip_version", type: Int32?, nillable: true, emit_null: false)]
    property ip_version : Int32?

    # Full name of the IP country.
    @[JSON::Field(key: "country_name", type: String?, nillable: true, emit_null: false)]
    property country_name : String?

    # ISO ALPHA-2 Country Code.
    @[JSON::Field(key: "country_code2", type: String?, nillable: true, emit_null: false)]
    property country_code2 : String?

    # Internet Service Provider (ISP) who owns the IP address.
    @[JSON::Field(key: "isp", type: String?, nillable: true, emit_null: false)]
    property isp : String?

    # Response status code to indicate success or failed completion of the API call.
    @[JSON::Field(key: "response_code", type: String?, nillable: true, emit_null: false)]
    property response_code : String?

    # Response message to indicate success or failed completion of the API call.
    @[JSON::Field(key: "response_message", type: String?, nillable: true, emit_null: false)]
    property response_message : String?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@ip : String?, @ip_number : String?, @ip_version : Int32?, @country_name : String?, @country_code2 : String?, @isp : String?, @response_code : String?, @response_message : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          ip == o.ip &&
          ip_number == o.ip_number &&
          ip_version == o.ip_version &&
          country_name == o.country_name &&
          country_code2 == o.country_code2 &&
          isp == o.isp &&
          response_code == o.response_code &&
          response_message == o.response_message
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [ip, ip_number, ip_version, country_name, country_code2, isp, response_code, response_message].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenAPIClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
