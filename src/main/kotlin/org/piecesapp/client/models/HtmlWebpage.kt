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
 * This model acts as a request body for /html/webpage endpoints. This essentially has two parameters: url (the route for the page), page (html for the page as a string).
 * @param url The route of the page 
 * @param page page's html as a string
 * @param schema 
 */

data class HtmlWebpage (
    /* The route of the page  */
    @Json(name = "url")
    val url: kotlin.String,
    /* page's html as a string */
    @Json(name = "page")
    val page: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)

