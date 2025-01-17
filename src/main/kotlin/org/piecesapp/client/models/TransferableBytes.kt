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
 * Bytes is a Model for A FileFormat. Raw and file are the only 2 that are currently supported. Raw and file are an array of integers that represent the file.Typical conversion UTF8 -> array[int] or UTF8 -> array[bytes(in hexidecimal)] -> array[int]. Either way you convert is up to you but the type we need here is an array of integers.  [NOT IMPLEMENTED] base64, base64_url, data_url [IMPLEMENTED] raw
 * @param schema 
 * @param raw IMPLEMENTED
 * @param base64 NOT IMPLEMENTED
 * @param base64Url NOT IMPLEMENTED
 * @param dataUrl NOT IMPLEMENTED
 */

data class TransferableBytes (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* IMPLEMENTED */
    @Json(name = "raw")
    val raw: kotlin.collections.List<kotlin.Int>? = null,
    /* NOT IMPLEMENTED */
    @Json(name = "base64")
    val base64: kotlin.collections.List<kotlin.Int>? = null,
    /* NOT IMPLEMENTED */
    @Json(name = "base64_url")
    val base64Url: kotlin.collections.List<kotlin.Int>? = null,
    /* NOT IMPLEMENTED */
    @Json(name = "data_url")
    val dataUrl: kotlin.collections.List<kotlin.Int>? = null
)

