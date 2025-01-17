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
import org.openapitools.client.models.FlattenedActivities
import org.openapitools.client.models.FlattenedAnchors
import org.openapitools.client.models.FlattenedAnnotations
import org.openapitools.client.models.FlattenedConversations
import org.openapitools.client.models.FlattenedFormats
import org.openapitools.client.models.FlattenedHints
import org.openapitools.client.models.FlattenedPersons
import org.openapitools.client.models.FlattenedPreview
import org.openapitools.client.models.FlattenedSensitives
import org.openapitools.client.models.FlattenedShares
import org.openapitools.client.models.FlattenedTags
import org.openapitools.client.models.FlattenedWebsites
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.MechanismEnum
import org.openapitools.client.models.Score

import com.squareup.moshi.Json

/**
 * An Asset Model representing data extracted from an Application connecting a group of data containing one or more Formats. [DAG Compatible - Directed Acyclic Graph Data Structure]  FlattenedAsset prevent Cycles in Reference because all outbound references are strings as opposed to crosspollinated objects.  i.e. FlattenedFormat.formats is Type String[] or List\\<String\\>, FlattenedFormat.preview is Type String, and FlattenedFormat.original is Type String
 * @param id The globally available UID representing the asset in the Database, both locally and in the cloud.
 * @param creator 
 * @param created 
 * @param updated 
 * @param formats 
 * @param preview 
 * @param original An identifier of the format that is a reference to the original.
 * @param mechanism 
 * @param schema 
 * @param name 
 * @param synced 
 * @param deleted 
 * @param shares 
 * @param websites 
 * @param interacted 
 * @param tags 
 * @param sensitives 
 * @param persons 
 * @param curated This is an optional boolean that will flag that this asset came from a currated collection.
 * @param discovered 
 * @param activities 
 * @param score 
 * @param favorited 
 * @param pseudo 
 * @param annotations 
 * @param hints 
 * @param anchors 
 * @param conversations 
 */

data class FlattenedAsset (
    /* The globally available UID representing the asset in the Database, both locally and in the cloud. */
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "creator")
    val creator: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "formats")
    val formats: FlattenedFormats,
    @Json(name = "preview")
    val preview: FlattenedPreview,
    /* An identifier of the format that is a reference to the original. */
    @Json(name = "original")
    val original: kotlin.String,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "synced")
    val synced: GroupedTimestamp? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "shares")
    val shares: FlattenedShares? = null,
    @Json(name = "websites")
    val websites: FlattenedWebsites? = null,
    @Json(name = "interacted")
    val interacted: GroupedTimestamp? = null,
    @Json(name = "tags")
    val tags: FlattenedTags? = null,
    @Json(name = "sensitives")
    val sensitives: FlattenedSensitives? = null,
    @Json(name = "persons")
    val persons: FlattenedPersons? = null,
    /* This is an optional boolean that will flag that this asset came from a currated collection. */
    @Json(name = "curated")
    val curated: kotlin.Boolean? = null,
    @Json(name = "discovered")
    val discovered: kotlin.Boolean? = null,
    @Json(name = "activities")
    val activities: FlattenedActivities? = null,
    @Json(name = "score")
    val score: Score? = null,
    @Json(name = "favorited")
    val favorited: kotlin.Boolean? = null,
    @Json(name = "pseudo")
    val pseudo: kotlin.Boolean? = null,
    @Json(name = "annotations")
    val annotations: FlattenedAnnotations? = null,
    @Json(name = "hints")
    val hints: FlattenedHints? = null,
    @Json(name = "anchors")
    val anchors: FlattenedAnchors? = null,
    @Json(name = "conversations")
    val conversations: FlattenedConversations? = null
)

