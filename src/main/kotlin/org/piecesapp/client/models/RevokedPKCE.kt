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

import com.squareup.moshi.Json

/**
 * A model to support revoking a Token Generated Through PKCE  The behaviour of this endpoint depends on the state of the Refresh Token Revocation Deletes Grant toggle.  If this toggle is enabled, then each revocation request invalidates not only the specific token, but all other tokens based on the same authorization grant.  This means that all Refresh Tokens that have been issued for the same user, application, and audience will be revoked. If this toggle is disabled, then only the refresh token is revoked, while the grant is left intact
 * @param clientId Your application's Client ID. The application should match the one the Refresh Token was issued for.
 * @param token The Refresh Token you want to revoke.
 * @param schema 
 */

data class RevokedPKCE (
    /* Your application's Client ID. The application should match the one the Refresh Token was issued for. */
    @Json(name = "client_id")
    val clientId: kotlin.String,
    /* The Refresh Token you want to revoke. */
    @Json(name = "token")
    val token: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

