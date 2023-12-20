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
import org.piecesapp.client.models.FlattenedAnchor

import com.squareup.moshi.Json

/**
 * This is the referenced version of a Anchor, main used for the uuid.
 * @param id 
 * @param schema 
 * @param reference 
 */

data class ReferencedAnchor (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "reference")
    val reference: FlattenedAnchor? = null
)

