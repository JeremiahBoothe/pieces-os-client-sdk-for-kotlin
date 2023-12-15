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

import org.openapitools.client.models.Application
import org.openapitools.client.models.ConversationGrounding
import org.openapitools.client.models.ConversationTypeEnum
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.FlattenedAnchors
import org.openapitools.client.models.FlattenedAnnotations
import org.openapitools.client.models.FlattenedAssets
import org.openapitools.client.models.FlattenedConversationMessages
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.ReferencedModel
import org.openapitools.client.models.Score

import com.squareup.moshi.Json

/**
 * This is a flattend version of the Convsersation for DAG-Safety.  This will hold together a conversation. Ie allthe message within a conversation.  All the additional properties on here used on here like(anchors/assets) are used for context that will seed the conversation.  model is a calculated property, and will be the model of the last message sent if applicable.
 * @param id 
 * @param created 
 * @param updated 
 * @param messages 
 * @param type 
 * @param schema 
 * @param name This is a name that is customized.
 * @param deleted 
 * @param favorited 
 * @param application 
 * @param annotations 
 * @param model 
 * @param assets 
 * @param anchors 
 * @param grounding 
 * @param score 
 */

data class FlattenedConversation (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "messages")
    val messages: FlattenedConversationMessages,
    @Json(name = "type")
    val type: ConversationTypeEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is a name that is customized. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "favorited")
    val favorited: kotlin.Boolean? = null,
    @Json(name = "application")
    val application: Application? = null,
    @Json(name = "annotations")
    val annotations: FlattenedAnnotations? = null,
    @Json(name = "model")
    val model: ReferencedModel? = null,
    @Json(name = "assets")
    val assets: FlattenedAssets? = null,
    @Json(name = "anchors")
    val anchors: FlattenedAnchors? = null,
    @Json(name = "grounding")
    val grounding: ConversationGrounding? = null,
    @Json(name = "score")
    val score: Score? = null
)

