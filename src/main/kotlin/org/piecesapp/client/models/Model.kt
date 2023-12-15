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

import org.openapitools.client.models.ByteDescriptor
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.ExternalMLProviderEnum
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.ModelFoundationEnum
import org.openapitools.client.models.ModelMaxTokens
import org.openapitools.client.models.ModelTypeEnum
import org.openapitools.client.models.ModelUsageEnum

import com.squareup.moshi.Json

/**
 * This is a Machine Learning Model, that will give readable information about the Machine Learning Model Used.
 * @param id uuid 
 * @param version this is a version of the model.
 * @param created 
 * @param name This is an Optional Name of the Model.
 * @param cloud This will inform the user if this was a model that is hosted in the cloud
 * @param type 
 * @param usage 
 * @param schema 
 * @param description An Optional Description of the model itself.
 * @param bytes 
 * @param ram 
 * @param quantization quantization is a string like: q8f16_0,  q4f16_1, etc...
 * @param foundation 
 * @param downloaded This is an optional bool to let us know if this model has been downloaded locally.
 * @param loaded This is a boolean that represents if the model is loaded into memory.(this is not persisted, and is calculated on the fly.)
 * @param unique This is the unique model name used to load the model.
 * @param parameters This is the number of parameters in terms of billions.
 * @param provider 
 * @param cpu This is an optional bool that is optimized for CPU usage.
 * @param downloading This is a calculated property, that will say if this is currently downloading.
 * @param maxTokens 
 */

data class Model (
    /* uuid  */
    @Json(name = "id")
    val id: kotlin.String,
    /* this is a version of the model. */
    @Json(name = "version")
    val version: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    /* This is an Optional Name of the Model. */
    @Json(name = "name")
    val name: kotlin.String,
    /* This will inform the user if this was a model that is hosted in the cloud */
    @Json(name = "cloud")
    val cloud: kotlin.Boolean,
    @Json(name = "type")
    val type: ModelTypeEnum,
    @Json(name = "usage")
    val usage: ModelUsageEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* An Optional Description of the model itself. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    @Json(name = "bytes")
    val bytes: ByteDescriptor? = null,
    @Json(name = "ram")
    val ram: ByteDescriptor? = null,
    /* quantization is a string like: q8f16_0,  q4f16_1, etc... */
    @Json(name = "quantization")
    val quantization: kotlin.String? = null,
    @Json(name = "foundation")
    val foundation: ModelFoundationEnum? = null,
    /* This is an optional bool to let us know if this model has been downloaded locally. */
    @Json(name = "downloaded")
    val downloaded: kotlin.Boolean? = null,
    /* This is a boolean that represents if the model is loaded into memory.(this is not persisted, and is calculated on the fly.) */
    @Json(name = "loaded")
    val loaded: kotlin.Boolean? = null,
    /* This is the unique model name used to load the model. */
    @Json(name = "unique")
    val unique: kotlin.String? = null,
    /* This is the number of parameters in terms of billions. */
    @Json(name = "parameters")
    val parameters: java.math.BigDecimal? = null,
    @Json(name = "provider")
    val provider: ExternalMLProviderEnum? = null,
    /* This is an optional bool that is optimized for CPU usage. */
    @Json(name = "cpu")
    val cpu: kotlin.Boolean? = null,
    /* This is a calculated property, that will say if this is currently downloading. */
    @Json(name = "downloading")
    val downloading: kotlin.Boolean? = null,
    @Json(name = "maxTokens")
    val maxTokens: ModelMaxTokens? = null
)

