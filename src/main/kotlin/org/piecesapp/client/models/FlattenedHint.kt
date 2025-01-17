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
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.HintTypeEnum
import org.openapitools.client.models.MechanismEnum
import org.openapitools.client.models.ReferencedAsset
import org.openapitools.client.models.ReferencedModel
import org.openapitools.client.models.Score

import com.squareup.moshi.Json

/**
 * This is the flattened version of a hint. Ensure that you DO NOT reference the Asset here as you can create an infinite loop within the packaging.
 * @param id 
 * @param created 
 * @param updated 
 * @param type 
 * @param text This is the text of the hint.
 * @param schema 
 * @param deleted 
 * @param mechanism 
 * @param asset 
 * @param model 
 * @param score 
 */

data class FlattenedHint (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "type")
    val type: HintTypeEnum,
    /* This is the text of the hint. */
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    @Json(name = "asset")
    val asset: ReferencedAsset? = null,
    @Json(name = "model")
    val model: ReferencedModel? = null,
    @Json(name = "score")
    val score: Score? = null
)

