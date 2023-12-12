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
import org.piecesapp.client.models.FlattenedConversationMessages

import com.squareup.moshi.Json

/**
 * Optionally you may pass in a list of conversation message that you would like to use for the summary.
 * @param schema 
 * @param messages 
 */

data class ConversationSummarizeInput (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "messages")
    val messages: FlattenedConversationMessages? = null
)

