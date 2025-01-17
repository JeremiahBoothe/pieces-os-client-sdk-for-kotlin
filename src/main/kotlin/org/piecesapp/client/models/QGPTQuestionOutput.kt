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
import org.openapitools.client.models.QGPTQuestionAnswers

import com.squareup.moshi.Json

/**
 * This is the output/returned value from the /qgpt/question endpoint. && /qgpt/followup  This will just have a single required property. the possible answers to the question, with a score.
 * @param answers 
 * @param schema 
 */

data class QGPTQuestionOutput (
    @Json(name = "answers")
    val answers: QGPTQuestionAnswers,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

