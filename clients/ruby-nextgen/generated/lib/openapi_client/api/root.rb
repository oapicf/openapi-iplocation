# frozen_string_literal: true

module OpenapiClient
  module Api
    class Root
      def initialize(connection)
        @connection = connection
      end

      def list(ip:, format: nil, delimiter: nil)
        raise ArgumentError, 'ip is required' if ip.nil?

        @connection.call(
          :GET,
          '/',
          type: OpenapiClient::Models::Get200Response,
          auth: [],
          query: { 'ip' => ip, 'format' => format, 'delimiter' => delimiter }
        )
      end
    end
  end
end
