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
import org.openapitools.client.models.ExportedDatabaseFormats

import com.squareup.moshi.Json

/**
 * 
 * @param analyses 
 * @param applications 
 * @param assets 
 * @param codeAnalyses 
 * @param files 
 * @param formatMetrics 
 * @param formats 
 * @param fragments 
 * @param imageAnalyses 
 * @param models 
 * @param ocrAnalyses 
 * @param persons 
 * @param sensitives 
 * @param tags 
 * @param websites 
 * @param values 
 * @param version This is the version of your os_server or cloud_server that we we exporting from.
 * @param schema 
 * @param relationships 
 * @param activities 
 * @param annotations 
 * @param hints 
 * @param anchors 
 * @param anchorPoints 
 * @param conversations 
 * @param conversationMessages 
 * @param messageValues 
 */

data class ExportedDatabase (
    @Json(name = "analyses")
    val analyses: kotlin.collections.List<kotlin.Int>,
    @Json(name = "applications")
    val applications: kotlin.collections.List<kotlin.Int>,
    @Json(name = "assets")
    val assets: kotlin.collections.List<kotlin.Int>,
    @Json(name = "codeAnalyses")
    val codeAnalyses: kotlin.collections.List<kotlin.Int>,
    @Json(name = "files")
    val files: kotlin.collections.List<kotlin.Int>,
    @Json(name = "formatMetrics")
    val formatMetrics: kotlin.collections.List<kotlin.Int>,
    @Json(name = "formats")
    val formats: kotlin.collections.List<kotlin.Int>,
    @Json(name = "fragments")
    val fragments: kotlin.collections.List<kotlin.Int>,
    @Json(name = "imageAnalyses")
    val imageAnalyses: kotlin.collections.List<kotlin.Int>,
    @Json(name = "models")
    val models: kotlin.collections.List<kotlin.Int>,
    @Json(name = "ocrAnalyses")
    val ocrAnalyses: kotlin.collections.List<kotlin.Int>,
    @Json(name = "persons")
    val persons: kotlin.collections.List<kotlin.Int>,
    @Json(name = "sensitives")
    val sensitives: kotlin.collections.List<kotlin.Int>,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.Int>,
    @Json(name = "websites")
    val websites: kotlin.collections.List<kotlin.Int>,
    @Json(name = "values")
    val values: ExportedDatabaseFormats,
    /* This is the version of your os_server or cloud_server that we we exporting from. */
    @Json(name = "version")
    val version: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "relationships")
    val relationships: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "activities")
    val activities: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "annotations")
    val annotations: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "hints")
    val hints: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "anchors")
    val anchors: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "anchorPoints")
    val anchorPoints: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "conversations")
    val conversations: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "conversationMessages")
    val conversationMessages: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "messageValues")
    val messageValues: ExportedDatabaseFormats? = null
)
