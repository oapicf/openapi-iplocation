<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Get200Response
{
    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @DTA\Data(field="ip", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ip = null;

    /**
     * IP number in long integer (represented as string).
     * @DTA\Data(field="ip_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ip_number = null;

    /**
     * IP version either 4 or 6.
     * @DTA\Data(field="ip_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $ip_version = null;

    /**
     * Full name of the IP country.
     * @DTA\Data(field="country_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $country_name = null;

    /**
     * ISO ALPHA-2 Country Code.
     * @DTA\Data(field="country_code2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $country_code2 = null;

    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @DTA\Data(field="isp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $isp = null;

    /**
     * Response status code to indicate success or failed completion of the API call.
     * @DTA\Data(field="response_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_code = null;

    /**
     * Response message to indicate success or failed completion of the API call.
     * @DTA\Data(field="response_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_message = null;

}
