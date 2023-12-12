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

import org.piecesapp.client.models.Application
import org.piecesapp.client.models.ByteDescriptor
import org.piecesapp.client.models.Classification
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.FileFormat
import org.piecesapp.client.models.FlattenedActivities
import org.piecesapp.client.models.FlattenedAnalysis
import org.piecesapp.client.models.FragmentFormat
import org.piecesapp.client.models.GroupedTimestamp
import org.piecesapp.client.models.Relationship
import org.piecesapp.client.models.Role

import com.squareup.moshi.Json

/**
 * A representation of Data for a particular Form Factor of an Asset.[DAG Compatible - Directed Acyclic Graph Data Structure]  FlattenedFormats prevent Cycles in Reference because all outbound references are strings as opposed to crosspollinated objects.  i.e. FlattenedFormat.asset is Type String  fragment or file will always be defined. Even thought they are both optional.
 * @param id 
 * @param creator 
 * @param classification 
 * @param role 
 * @param application 
 * @param asset A uuid model. 36 Characters (4 Dashes, 32 Numbers/Letters) 
 * @param bytes 
 * @param created 
 * @param updated 
 * @param schema 
 * @param icon 
 * @param deleted 
 * @param synced 
 * @param cloud This is a path used to determine what path this format lives at within the cloud.
 * @param fragment 
 * @param file 
 * @param analysis 
 * @param relationship 
 * @param activities 
 */

data class FlattenedFormat (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "creator")
    val creator: kotlin.String,
    @Json(name = "classification")
    val classification: Classification,
    @Json(name = "role")
    val role: Role,
    @Json(name = "application")
    val application: Application,
    /* A uuid model. 36 Characters (4 Dashes, 32 Numbers/Letters)  */
    @Json(name = "asset")
    val asset: java.util.UUID,
    @Json(name = "bytes")
    val bytes: ByteDescriptor,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "icon")
    val icon: kotlin.String? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "synced")
    val synced: GroupedTimestamp? = null,
    /* This is a path used to determine what path this format lives at within the cloud. */
    @Json(name = "cloud")
    val cloud: kotlin.String? = null,
    @Json(name = "fragment")
    val fragment: FragmentFormat? = null,
    @Json(name = "file")
    val file: FileFormat? = null,
    @Json(name = "analysis")
    val analysis: FlattenedAnalysis? = null,
    @Json(name = "relationship")
    val relationship: Relationship? = null,
    @Json(name = "activities")
    val activities: FlattenedActivities? = null
)

