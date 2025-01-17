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
import org.openapitools.client.models.SeededDistribution

import com.squareup.moshi.Json

/**
 * This is the plural version of a SeededDistribution that is not referenced just yet.
 * @param iterable 
 * @param schema 
 */

data class SeededDistributions (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<SeededDistribution>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

