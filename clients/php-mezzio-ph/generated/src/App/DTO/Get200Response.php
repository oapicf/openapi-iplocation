<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Get200Response
{
    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @DTA\Data(field="ip", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ip;

    /**
     * IP number in long integer.
     * @DTA\Data(field="ip_number", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":Int64::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":Int64::class})
     * @var Int64|null
     */
    public $ip_number;

    /**
     * IP version either 4 or 6.
     * @DTA\Data(field="ip_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ip_version;

    /**
     * Full name of the IP country.
     * @DTA\Data(field="country_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $country_name;

    /**
     * ISO ALPHA-2 Country Code.
     * @DTA\Data(field="country_code2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $country_code2;

    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @DTA\Data(field="isp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $isp;

    /**
     * Response status code to indicate success or failed completion of the API call.
     * @DTA\Data(field="response_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_code;

    /**
     * Response message to indicate success or failed completion of the API call.
     * @DTA\Data(field="response_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_message;

}
