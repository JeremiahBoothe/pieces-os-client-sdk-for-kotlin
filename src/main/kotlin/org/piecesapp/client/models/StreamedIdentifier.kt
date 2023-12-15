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

import org.openapitools.client.models.ReferencedAsset
import org.openapitools.client.models.ReferencedConversation

import com.squareup.moshi.Json

/**
 * This is currently only used within /assets/steam/identifiers && /conversations/steam/identifiers but can be used with other as well, if we want to expand this class.
 * @param asset 
 * @param conversation 
 * @param deleted This is a specific bool that will let us know if we deleted an Identifierfrom the db.
 */

data class StreamedIdentifier (
    @Json(name = "asset")
    val asset: ReferencedAsset? = null,
    @Json(name = "conversation")
    val conversation: ReferencedConversation? = null,
    /* This is a specific bool that will let us know if we deleted an Identifierfrom the db. */
    @Json(name = "deleted")
    val deleted: kotlin.Boolean? = null
)

