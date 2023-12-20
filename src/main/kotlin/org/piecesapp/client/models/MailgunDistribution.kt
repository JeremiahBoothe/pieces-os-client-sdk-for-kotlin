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
import org.piecesapp.client.models.Recipients

import com.squareup.moshi.Json

/**
 * This is a specific Distribution for mailgun specific information.
 * @param recipients 
 * @param schema 
 */

data class MailgunDistribution (
    @Json(name = "recipients")
    val recipients: Recipients,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

