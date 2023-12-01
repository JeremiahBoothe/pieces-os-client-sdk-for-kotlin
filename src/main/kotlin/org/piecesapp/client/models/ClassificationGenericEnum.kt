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
* EXTERNAL_RESOURCE_REFERENCE can be thought of as anything such as URL, URI, UNIX PATH, etc
* Values: cODE,tEXT,iMAGE,vIDEO,eXTERNALRESOURCEREFERENCE,uNKNOWN,fILE
*/

enum class ClassificationGenericEnum(val value: kotlin.String){


    @Json(name = "CODE")
    cODE("CODE"),


    @Json(name = "TEXT")
    tEXT("TEXT"),


    @Json(name = "IMAGE")
    iMAGE("IMAGE"),


    @Json(name = "VIDEO")
    vIDEO("VIDEO"),


    @Json(name = "EXTERNAL_RESOURCE_REFERENCE")
    eXTERNALRESOURCEREFERENCE("EXTERNAL_RESOURCE_REFERENCE"),


    @Json(name = "UNKNOWN")
    uNKNOWN("UNKNOWN"),


    @Json(name = "FILE")
    fILE("FILE");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}
