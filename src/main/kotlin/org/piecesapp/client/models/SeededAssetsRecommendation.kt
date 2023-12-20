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

import org.piecesapp.client.models.Assets
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.InteractedAssets

import com.squareup.moshi.Json

/**
 * This is the input data model for the /assets/recommend [GET] endpoint. It includes both a list of assets but also 
 * @param assets 
 * @param interactions 
 * @param schema 
 */

data class SeededAssetsRecommendation (
    @Json(name = "assets")
    val assets: Assets,
    @Json(name = "interactions")
    val interactions: InteractedAssets,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

