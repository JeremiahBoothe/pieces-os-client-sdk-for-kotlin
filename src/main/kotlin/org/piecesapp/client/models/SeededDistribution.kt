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
import org.openapitools.client.models.MailgunDistribution
import org.openapitools.client.models.SeededGitHubDistribution

import com.squareup.moshi.Json

/**
 * TODO if we add another distribution add to this, Distribution, and flattenedDistribution.  can only use this Model with our Linkify Model.
 * @param schema 
 * @param mailgun 
 * @param github 
 */

data class SeededDistribution (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "mailgun")
    val mailgun: MailgunDistribution? = null,
    @Json(name = "github")
    val github: SeededGitHubDistribution? = null
)

