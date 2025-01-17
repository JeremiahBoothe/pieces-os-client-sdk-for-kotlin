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

import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.ReferencedAnnotation
import org.openapitools.client.models.ReferencedAsset
import org.openapitools.client.models.ReferencedModel

import com.squareup.moshi.Json

/**
 * This is a PersonSpecific Model. and will let us know for all the assets that get attached to the person if, this person was attached via a model or just attached automatically.  explanation here are the reason why a Person was attached to an asset.
 * @param asset 
 * @param model 
 * @param deleted 
 * @param explanation 
 */

data class PersonModel (
    @Json(name = "asset")
    val asset: ReferencedAsset? = null,
    @Json(name = "model")
    val model: ReferencedModel? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "explanation")
    val explanation: ReferencedAnnotation? = null
)

