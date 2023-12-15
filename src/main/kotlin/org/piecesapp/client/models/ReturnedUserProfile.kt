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
import org.openapitools.client.models.UserProfile

import com.squareup.moshi.Json

/**
 * This is a modle strictly for the purpose that when calling '/user' and other user related endpoints the UserProfile could potentially be null, so we needed a model to do that.
 * @param schema 
 * @param user 
 */

data class ReturnedUserProfile (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "user")
    val user: UserProfile? = null
)

