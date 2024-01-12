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

import com.squareup.moshi.Json

/**
 * This is a returnable for the metrics/formats/ordered
 * @param ordered 
 * @param schema 
 */

data class OrderedMetrics (
    @Json(name = "ordered")
    val ordered: kotlin.collections.List<kotlin.String>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

