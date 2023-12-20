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

import org.piecesapp.client.models.Auth0Identity
import org.piecesapp.client.models.Auth0Redirects
import org.piecesapp.client.models.Auth0User
import org.piecesapp.client.models.Auth0UserMetadata
import org.piecesapp.client.models.OAuthGroup

import com.squareup.moshi.Json

/**
 * An object representing all of the properties that are available within a Auth0 PKCE Flow
 * @param domain The domain of your Auth 0 Service
 * @param client The Client ID for your Auth0 Service
 * @param audience The Server Audience of your Auth0 Service
 * @param redirects 
 * @param oAuth 
 * @param identity 
 * @param user 
 * @param metadata 
 * @param namespace An optional namespace parameter to add an additional namespace
 */

data class Auth0 (
    /* The domain of your Auth 0 Service */
    @Json(name = "domain")
    val domain: kotlin.String,
    /* The Client ID for your Auth0 Service */
    @Json(name = "client")
    val client: kotlin.String,
    /* The Server Audience of your Auth0 Service */
    @Json(name = "audience")
    val audience: kotlin.String,
    @Json(name = "redirects")
    val redirects: Auth0Redirects,
    @Json(name = "oAuth")
    val oAuth: OAuthGroup,
    @Json(name = "identity")
    val identity: Auth0Identity? = null,
    @Json(name = "user")
    val user: Auth0User? = null,
    @Json(name = "metadata")
    val metadata: Auth0UserMetadata? = null,
    /* An optional namespace parameter to add an additional namespace */
    @Json(name = "namespace")
    val namespace: kotlin.String? = null
)

