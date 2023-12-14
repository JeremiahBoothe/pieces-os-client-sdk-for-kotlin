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

import org.piecesapp.client.models.Application
import org.piecesapp.client.models.ConversationTypeEnum
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.FlattenedAssets
import org.piecesapp.client.models.ReferencedModel
import org.piecesapp.client.models.SeededAnchor
import org.piecesapp.client.models.SeededAnnotation
import org.piecesapp.client.models.SeededConversationMessage

import com.squareup.moshi.Json

/**
 * This is a pre-Conversation object.  This will hold together a conversation. Ie allthe message within a conversation.  All the additional properties on here used on here like(anchors/assets) are used for context that will seed the conversation.  model is a calculated property, and will be the model of the last message sent if applicable.
 * @param type 
 * @param schema 
 * @param name This is a name that is customized.
 * @param favorited 
 * @param application 
 * @param annotations 
 * @param messages 
 * @param model 
 * @param assets 
 * @param anchors 
 */

data class SeededConversation (
    @Json(name = "type")
    val type: ConversationTypeEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is a name that is customized. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "favorited")
    val favorited: kotlin.Boolean? = null,
    @Json(name = "application")
    val application: Application? = null,
    @Json(name = "annotations")
    val annotations: kotlin.collections.List<SeededAnnotation>? = null,
    @Json(name = "messages")
    val messages: kotlin.collections.List<SeededConversationMessage>? = null,
    @Json(name = "model")
    val model: ReferencedModel? = null,
    @Json(name = "assets")
    val assets: FlattenedAssets? = null,
    @Json(name = "anchors")
    val anchors: kotlin.collections.List<SeededAnchor>? = null
)

