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
 * This is used in the TrackedAssetsEventSearchMetadata
 * @param size This is the size of your current catalog.(number of assets)
 * @param duration this is the number in ms it took to run search.
 */

data class Space (
    /* This is the size of your current catalog.(number of assets) */
    @Json(name = "size")
    val size: kotlin.Int? = null,
    /* this is the number in ms it took to run search. */
    @Json(name = "duration")
    val duration: kotlin.Int? = null
)

