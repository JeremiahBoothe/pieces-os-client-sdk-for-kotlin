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
 * A Model to support account creation to Auth0's Database.
 * @param clientId The client_id of your client.
 * @param email The user's email address.
 * @param connection The name of the database configured to your client.
 * @param username The user's username. Only valid if the connection requires a username.
 * @param givenName The user's given name(s).
 * @param familyName The user's family name(s).
 * @param name The user's full name.
 * @param picture A URI pointing to the user's picture.
 * @param nickname The user's nickname.
 */

data class OAuthAccount (
    /* The client_id of your client. */
    @Json(name = "client_id")
    val clientId: kotlin.String,
    /* The user's email address. */
    @Json(name = "email")
    val email: kotlin.String,
    /* The name of the database configured to your client. */
    @Json(name = "connection")
    val connection: kotlin.String,
    /* The user's username. Only valid if the connection requires a username. */
    @Json(name = "username")
    val username: kotlin.String,
    /* The user's given name(s). */
    @Json(name = "given_name")
    val givenName: kotlin.String,
    /* The user's family name(s). */
    @Json(name = "family_name")
    val familyName: kotlin.String,
    /* The user's full name. */
    @Json(name = "name")
    val name: kotlin.String,
    /* A URI pointing to the user's picture. */
    @Json(name = "picture")
    val picture: kotlin.String,
    /* The user's nickname. */
    @Json(name = "nickname")
    val nickname: kotlin.String
)

