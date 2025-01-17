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
import org.openapitools.client.models.SeededScore

import com.squareup.moshi.Json

/**
 * This is the body for a respective scores increment,  This will enable us to know what material we want to increment, all of which are optional, if it is defined we will attempt to increment the material.
 * @param schema 
 * @param asset 
 * @param assets 
 * @param website 
 * @param websites 
 * @param anchor 
 * @param anchors 
 * @param anchorPoint 
 * @param anchorPoints 
 * @param annotation 
 * @param annotations 
 * @param conversation 
 * @param conversations 
 * @param conversationMessage 
 * @param conversationMessages 
 * @param share 
 * @param shares 
 * @param sensitive 
 * @param sensitives 
 * @param hint 
 * @param hints 
 * @param person 
 * @param persons 
 * @param tag 
 * @param tags 
 */

data class SeededScoreIncrement (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "asset")
    val asset: SeededScore? = null,
    @Json(name = "assets")
    val assets: SeededScore? = null,
    @Json(name = "website")
    val website: SeededScore? = null,
    @Json(name = "websites")
    val websites: SeededScore? = null,
    @Json(name = "anchor")
    val anchor: SeededScore? = null,
    @Json(name = "anchors")
    val anchors: SeededScore? = null,
    @Json(name = "anchorPoint")
    val anchorPoint: SeededScore? = null,
    @Json(name = "anchorPoints")
    val anchorPoints: SeededScore? = null,
    @Json(name = "annotation")
    val annotation: SeededScore? = null,
    @Json(name = "annotations")
    val annotations: SeededScore? = null,
    @Json(name = "conversation")
    val conversation: SeededScore? = null,
    @Json(name = "conversations")
    val conversations: SeededScore? = null,
    @Json(name = "conversationMessage")
    val conversationMessage: SeededScore? = null,
    @Json(name = "conversationMessages")
    val conversationMessages: SeededScore? = null,
    @Json(name = "share")
    val share: SeededScore? = null,
    @Json(name = "shares")
    val shares: SeededScore? = null,
    @Json(name = "sensitive")
    val sensitive: SeededScore? = null,
    @Json(name = "sensitives")
    val sensitives: SeededScore? = null,
    @Json(name = "hint")
    val hint: SeededScore? = null,
    @Json(name = "hints")
    val hints: SeededScore? = null,
    @Json(name = "person")
    val person: SeededScore? = null,
    @Json(name = "persons")
    val persons: SeededScore? = null,
    @Json(name = "tag")
    val tag: SeededScore? = null,
    @Json(name = "tags")
    val tags: SeededScore? = null
)

