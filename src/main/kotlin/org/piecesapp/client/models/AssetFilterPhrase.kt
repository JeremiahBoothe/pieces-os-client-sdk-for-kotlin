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

import org.openapitools.client.models.AssetFilterPhraseOptions
import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param value 
 * @param annotation 
 * @param title 
 * @param content 
 * @param options 
 */

data class AssetFilterPhrase (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "value")
    val value: kotlin.String? = null,
    @Json(name = "annotation")
    val annotation: kotlin.Boolean? = null,
    @Json(name = "title")
    val title: kotlin.Boolean? = null,
    @Json(name = "content")
    val content: kotlin.Boolean? = null,
    @Json(name = "options")
    val options: AssetFilterPhraseOptions? = null
)

