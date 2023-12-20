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

import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.TLPCodeDirectoryAnalytics
import org.piecesapp.client.models.TLPCodeFileAnalytics
import org.piecesapp.client.models.TLPCodeRepositoryAnalytics
import org.piecesapp.client.models.TLPCodeSnippetAnalytics

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param fragment 
 * @param file 
 * @param directory 
 * @param repository 
 */

data class TLPCodeProcessing (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "fragment")
    val fragment: TLPCodeSnippetAnalytics? = null,
    @Json(name = "file")
    val file: TLPCodeFileAnalytics? = null,
    @Json(name = "directory")
    val directory: TLPCodeDirectoryAnalytics? = null,
    @Json(name = "repository")
    val repository: TLPCodeRepositoryAnalytics? = null
)

