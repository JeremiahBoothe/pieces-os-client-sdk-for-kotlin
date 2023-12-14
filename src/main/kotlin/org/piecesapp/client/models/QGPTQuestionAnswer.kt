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
 * This will be a simple model with a score and a text value that will represent the value returned for this answer.
 * @param score This is the score from 0-1 on how good this answer is.
 * @param text 
 * @param schema 
 */

data class QGPTQuestionAnswer (
    /* This is the score from 0-1 on how good this answer is. */
    @Json(name = "score")
    val score: java.math.BigDecimal,
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

