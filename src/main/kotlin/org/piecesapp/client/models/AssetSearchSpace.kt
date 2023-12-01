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

import com.squareup.moshi.Json

/**
 * This is provided search spaces, This is a provided assets, TODO in the future we might want to add seeds.
 * @param identifers 
 * @param schema 
 */

data class AssetSearchSpace (
    @Json(name = "identifers")
    val identifers: FlattenedAssets,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)
