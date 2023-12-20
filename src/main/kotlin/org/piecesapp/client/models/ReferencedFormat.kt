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
import org.piecesapp.client.models.FlattenedFormat

import com.squareup.moshi.Json

/**
 * A reference to a format which at minimum must have the format's id. But in the case of a hydrated client API it may have a populated reference of type Format.
 * @param id The id of the Format
 * @param schema 
 * @param reference 
 */

data class ReferencedFormat (
    /* The id of the Format */
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "reference")
    val reference: FlattenedFormat? = null
)

