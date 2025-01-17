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
import org.openapitools.client.models.FlattenedAssets
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.LocationTypeEnum
import org.openapitools.client.models.PlatformEnum

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param type 
 * @param text This is the text of the path.
 * @param created 
 * @param updated 
 * @param schema 
 * @param watch 
 * @param deleted 
 * @param assets 
 * @param platform 
 */

data class Location (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "type")
    val type: LocationTypeEnum,
    /* This is the text of the path. */
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "watch")
    val watch: kotlin.Boolean? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "assets")
    val assets: FlattenedAssets? = null,
    @Json(name = "platform")
    val platform: PlatformEnum? = null
)

