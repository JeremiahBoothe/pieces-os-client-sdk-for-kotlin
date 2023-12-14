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

import org.piecesapp.client.models.AssetFilters
import org.piecesapp.client.models.AssetSearchSpace
import org.piecesapp.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param query 
 * @param space 
 * @param filters 
 * @param casing This is an optional bool that will let us know, if we want to ignore case or not.(default is to allow casing)ie casing:true.
 */

data class AssetsSearchWithFiltersInput (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "query")
    val query: kotlin.String? = null,
    @Json(name = "space")
    val space: AssetSearchSpace? = null,
    @Json(name = "filters")
    val filters: AssetFilters? = null,
    /* This is an optional bool that will let us know, if we want to ignore case or not.(default is to allow casing)ie casing:true. */
    @Json(name = "casing")
    val casing: kotlin.Boolean? = null
)

