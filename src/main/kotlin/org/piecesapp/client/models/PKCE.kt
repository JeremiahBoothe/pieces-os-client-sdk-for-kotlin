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

import org.openapitools.client.models.Auth0
import org.openapitools.client.models.ChallengedPKCE
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.ResultedPKCE
import org.openapitools.client.models.RevokedPKCE
import org.openapitools.client.models.SeededPKCE
import org.openapitools.client.models.TokenizedPKCE

import com.squareup.moshi.Json

/**
 * An object representing all of the properties involved in a PKCE Authentication Flow
 * @param schema 
 * @param result 
 * @param challenge 
 * @param revocation 
 * @param seed 
 * @param token 
 * @param auth0 
 */

data class PKCE (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "result")
    val result: ResultedPKCE? = null,
    @Json(name = "challenge")
    val challenge: ChallengedPKCE? = null,
    @Json(name = "revocation")
    val revocation: RevokedPKCE? = null,
    @Json(name = "seed")
    val seed: SeededPKCE? = null,
    @Json(name = "token")
    val token: TokenizedPKCE? = null,
    @Json(name = "auth0")
    val auth0: Auth0? = null
)
