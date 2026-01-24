require 'openapi_iplocation'

describe 'IpLocationClient' do
  before do
  end

  after do
  end

  describe 'test json format' do
    it 'should return a JSON payload' do
      api_instance = OpenApiIplocationClient::DefaultApi.new
      begin
        opts = {
          format: 'json'
        }
        api_response = api_instance.root_get('8.8.8.8', opts)
        expect(api_response).not_to be_nil
      rescue OpenApiIplocationClient::ApiError => e
        puts "Error when calling DefaultApi->root_get: #{e}"
        fail
      end
    end
  end

end
