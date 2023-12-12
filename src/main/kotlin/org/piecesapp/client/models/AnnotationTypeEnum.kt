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


import com.squareup.moshi.Json

/**
* This is used to describe a specific type of annotation. NOTE** This is linked to the annotation_type_filter in the parameters folder(if you change an enum here, please adjust the enum there.)
* Values: dESCRIPTION,cOMMENT,dOCUMENTATION,sUMMARY,eXPLANATION,gITCOMMIT
*/

enum class AnnotationTypeEnum(val value: kotlin.String){


    @Json(name = "DESCRIPTION")
    dESCRIPTION("DESCRIPTION"),


    @Json(name = "COMMENT")
    cOMMENT("COMMENT"),


    @Json(name = "DOCUMENTATION")
    dOCUMENTATION("DOCUMENTATION"),


    @Json(name = "SUMMARY")
    sUMMARY("SUMMARY"),


    @Json(name = "EXPLANATION")
    eXPLANATION("EXPLANATION"),


    @Json(name = "GIT_COMMIT")
    gITCOMMIT("GIT_COMMIT");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

