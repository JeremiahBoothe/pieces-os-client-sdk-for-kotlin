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

import org.piecesapp.client.models.Auth0OpenAIUserMetadata
import org.piecesapp.client.models.Auth0UserAllocationMetadata
import org.piecesapp.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * User Metadata from Auth0
 * @param globalId 
 * @param schema 
 * @param cloudKey 
 * @param stripeCustomerId A customer ID that is added to the user in the case of payments
 * @param vanityname this is the vanityname of the user.(set from their custom CNAME dns record.) ie mark.pieces.cloud where \"mark\" is the vanityname.
 * @param allocation 
 * @param openAI 
 */

data class Auth0UserMetadata (
    @Json(name = "global_id")
    val globalId: java.util.UUID,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "cloud_key")
    val cloudKey: kotlin.String? = null,
    /* A customer ID that is added to the user in the case of payments */
    @Json(name = "stripe_customer_id")
    val stripeCustomerId: kotlin.String? = null,
    /* this is the vanityname of the user.(set from their custom CNAME dns record.) ie mark.pieces.cloud where \"mark\" is the vanityname. */
    @Json(name = "vanityname")
    val vanityname: kotlin.String? = null,
    @Json(name = "allocation")
    val allocation: Auth0UserAllocationMetadata? = null,
    @Json(name = "open_AI")
    val openAI: Auth0OpenAIUserMetadata? = null
)

