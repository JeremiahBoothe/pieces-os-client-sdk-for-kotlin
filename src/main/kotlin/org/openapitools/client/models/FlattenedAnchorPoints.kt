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
package org.piecesapp.client.models

import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.ReferencedAnchorPoint
import org.piecesapp.client.models.Score

import com.squareup.moshi.Json

/**
 * 
 * @param iterable 
 * @param schema 
 * @param indices This is a Map<String, int> where the the key is an AnchorPoint id.
 * @param score 
 */

data class FlattenedAnchorPoints (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<ReferencedAnchorPoint>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is a Map<String, int> where the the key is an AnchorPoint id. */
    @Json(name = "indices")
    val indices: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,
    @Json(name = "score")
    val score: Score? = null
)

