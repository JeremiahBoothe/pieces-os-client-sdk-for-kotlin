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
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.QGPTConversationMessageRoleEnum

import com.squareup.moshi.Json

/**
 * This will take a single message, and a role.
 * @param text 
 * @param role 
 * @param timestamp 
 * @param schema 
 */

data class QGPTConversationMessage (
    @Json(name = "text")
    val text: kotlin.String,
    @Json(name = "role")
    val role: QGPTConversationMessageRoleEnum,
    @Json(name = "timestamp")
    val timestamp: GroupedTimestamp,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

