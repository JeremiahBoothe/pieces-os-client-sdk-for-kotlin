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

import org.piecesapp.client.models.AnchorTypeEnum
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.PlatformEnum

import com.squareup.moshi.Json

/**
 * 
 * @param type 
 * @param fullpath 
 * @param anchor Cannot create an AnchorPoint w/o a Anchor.
 * @param schema 
 * @param watch 
 * @param platform 
 */

data class SeededAnchorPoint (
    @Json(name = "type")
    val type: AnchorTypeEnum,
    @Json(name = "fullpath")
    val fullpath: kotlin.String,
    /* Cannot create an AnchorPoint w/o a Anchor. */
    @Json(name = "anchor")
    val anchor: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "watch")
    val watch: kotlin.Boolean? = null,
    @Json(name = "platform")
    val platform: PlatformEnum? = null
)

