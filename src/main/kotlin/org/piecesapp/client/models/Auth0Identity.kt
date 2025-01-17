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


import com.squareup.moshi.Json

/**
 * Contains info retrieved from the identity provider with which the user originally authenticates. Users may also link their profile to multiple identity providers; those identities will then also appear in this array. The contents of an individual identity provider object varies by provider, but it will typically include the following. Link: [https://auth0.com/docs/rules/user-object-in-rules]  Currently left out: - profile_data: (Object) User information associated with the connection. When profiles are linked, it is populated with the associated user info for secondary accounts.
 * @param connection Name of the Auth0 connection used to authenticate the user. 
 * @param isSocial Indicates whether the connection is a social one. 
 * @param provider mapped from user_id  -> id
 * @param userId User's unique identifier for this connection/provider.
 * @param accessToken 
 * @param expiresIn 
 */

data class Auth0Identity (
    /* Name of the Auth0 connection used to authenticate the user.  */
    @Json(name = "connection")
    val connection: kotlin.String? = null,
    /* Indicates whether the connection is a social one.  */
    @Json(name = "isSocial")
    val isSocial: kotlin.Boolean? = null,
    /* mapped from user_id  -> id */
    @Json(name = "provider")
    val provider: kotlin.String? = null,
    /* User's unique identifier for this connection/provider. */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,
    @Json(name = "access_token")
    val accessToken: kotlin.String? = null,
    @Json(name = "expires_in")
    val expiresIn: kotlin.Int? = null
)

