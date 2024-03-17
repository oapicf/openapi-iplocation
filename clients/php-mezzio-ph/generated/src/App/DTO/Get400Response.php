<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Get400Response
{
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
