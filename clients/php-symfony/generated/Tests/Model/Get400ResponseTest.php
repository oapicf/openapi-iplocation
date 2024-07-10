<?php
/**
 * Get400ResponseTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * iplocation.net API
 *
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\Get400Response;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * Get400ResponseTest Class Doc Comment
 *
 * @category    Class
 * @description Get400Response
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\Get400Response
 */
class Get400ResponseTest extends TestCase
{
    protected Get400Response|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(Get400Response::class)->getMockForAbstractClass();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(Get400Response::class));
        $this->assertInstanceOf(Get400Response::class, $this->object);
    }

    /**
     * Test attribute "responseCode"
     *
     * @group unit
     * @small
     */
    public function testPropertyResponseCode(): void
    {
        $this->markTestSkipped('Test for property responseCode not implemented');
    }

    /**
     * Test attribute "responseMessage"
     *
     * @group unit
     * @small
     */
    public function testPropertyResponseMessage(): void
    {
        $this->markTestSkipped('Test for property responseMessage not implemented');
    }
}
