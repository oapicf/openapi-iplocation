<?php

/**
 * iplocation.net API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\Get400Response;

/**
 * Get400ResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Get400Response
 */
class Get400ResponseTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
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
     * Test "Get400Response"
     */
    public function testGet400Response()
    {
        $testGet400Response = new Get400Response();
        $namespacedClassname = Get400Response::getModelsNamespace() . '\\Get400Response';
        $this->assertSame('\\' . Get400Response::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Get400Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "responseCode"
     */
    public function testPropertyResponseCode()
    {
        self::markTestIncomplete(
            'Test of "responseCode" property in "Get400Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "responseMessage"
     */
    public function testPropertyResponseMessage()
    {
        self::markTestIncomplete(
            'Test of "responseMessage" property in "Get400Response" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Get400Response::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

