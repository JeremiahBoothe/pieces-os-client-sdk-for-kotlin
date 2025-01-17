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

import org.openapitools.client.models.Auth0Identity
import org.openapitools.client.models.Auth0UserMetadata

import com.squareup.moshi.Json

/**
 * 
 * @param name  User's full name.
 * @param picture mapped from picture.URL pointing to the user's profile picture. 
 * @param email 
 * @param createdAt 
 * @param emailVerified Indicates whether the user has verified their email address. Mapped from email_verified -> emailVerified.
 * @param familyName User's family name.
 * @param givenName User's given name. 
 * @param identities Contains info retrieved from the identity provider with which the user originally authenticates.
 * @param nickname User's nickname. 
 * @param updatedAt 
 * @param username  (unique) User's username.  
 * @param userMetadata 
 * @param locale 
 * @param userId 
 * @param lastIp 
 * @param lastLogin 
 * @param loginsCount 
 * @param blockedFor 
 * @param guardianAuthenticators 
 */

data class Auth0User (
    /*  User's full name. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* mapped from picture.URL pointing to the user's profile picture.  */
    @Json(name = "picture")
    val picture: java.net.URI? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime? = null,
    /* Indicates whether the user has verified their email address. Mapped from email_verified -> emailVerified. */
    @Json(name = "email_verified")
    val emailVerified: kotlin.Boolean? = null,
    /* User's family name. */
    @Json(name = "family_name")
    val familyName: kotlin.String? = null,
    /* User's given name.  */
    @Json(name = "given_name")
    val givenName: kotlin.String? = null,
    /* Contains info retrieved from the identity provider with which the user originally authenticates. */
    @Json(name = "identities")
    val identities: kotlin.collections.List<Auth0Identity>? = null,
    /* User's nickname.  */
    @Json(name = "nickname")
    val nickname: kotlin.String? = null,
    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime? = null,
    /*  (unique) User's username.   */
    @Json(name = "username")
    val username: kotlin.String? = null,
    @Json(name = "user_metadata")
    val userMetadata: Auth0UserMetadata? = null,
    @Json(name = "locale")
    val locale: kotlin.String? = null,
    @Json(name = "user_id")
    val userId: kotlin.String? = null,
    @Json(name = "last_ip")
    val lastIp: kotlin.String? = null,
    @Json(name = "last_login")
    val lastLogin: java.time.OffsetDateTime? = null,
    @Json(name = "logins_count")
    val loginsCount: kotlin.Int? = null,
    @Json(name = "blocked_for")
    val blockedFor: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "guardian_authenticators")
    val guardianAuthenticators: kotlin.collections.List<kotlin.String>? = null
)

