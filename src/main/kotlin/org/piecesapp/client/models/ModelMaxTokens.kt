/**
* Pieces Isomorphic OpenAPI
* Endpoints for Assets, Formats, Users, Asset, Format, User.
*
* The version of the OpenAPI document: 1.0
* Contact: tsavo@pieces.app
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * This will describe the MaxTokens for an MLModel  total is required.  iff there is a differentiator with inputs/outputs, then we can also provide those as well.
 * @param total 
 * @param schema 
 * @param input 
 * @param output 
 */

data class ModelMaxTokens (
    @Json(name = "total")
    val total: java.math.BigDecimal?,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "input")
    val input: java.math.BigDecimal? = null,
    @Json(name = "output")
    val output: java.math.BigDecimal? = null
)

