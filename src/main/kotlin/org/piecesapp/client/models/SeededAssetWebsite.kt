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
import org.openapitools.client.models.MechanismEnum

import com.squareup.moshi.Json

/**
 * This is similar to an SeededWebsite, where this is the minimum information of a website, but this can get added to a seededAsset,  where you may not yet have an asset id.
 * @param url 
 * @param name 
 * @param schema 
 * @param mechanism 
 */

data class SeededAssetWebsite (
    @Json(name = "url")
    val url: kotlin.String,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null
)

