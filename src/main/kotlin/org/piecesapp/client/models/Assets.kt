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

import org.openapitools.client.models.Asset
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.Score

import com.squareup.moshi.Json

/**
 * A base class for a collection of assets and some additional meta properties. Fully Populated with Formats internally (not just uuid's).
 * @param iterable 
 * @param schema 
 * @param indices This is a Map<String, int> where the the key is an asset id.
 * @param score 
 */

data class Assets (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<Asset>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is a Map<String, int> where the the key is an asset id. */
    @Json(name = "indices")
    val indices: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,
    @Json(name = "score")
    val score: Score? = null
)

