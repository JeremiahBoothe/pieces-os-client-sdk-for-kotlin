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
* This is used to describe the foundational models used within POS.
* Values: gPT3Period5,gPT4,t5,lLAMA27B,lLAMA213B,lLAMA270B,cODELLAMA27B,cODELLAMA213B,cODELLAMA270B,bARD,aLPACA7B,aLPACA13B,aLPACA33B,aLPACA65B,vICUNA7B,vICUNA13B,vICUNA33B,vICUNA65B,gUANACO7B,gUANACO13B,gUANACO33B,gUANACO65B,oPENLLAMA7B,oPENLLAMA13B,gORILLA7B,gORILLA13B,gORILLA33B,gORILLA65B,wIZARDLM7B,wIZARDLM13B,wIZARDLM30B,yULANCHAT13B,yULANCHAT65B,rEDPAJAMA3B,rEDPAJAMA7B,rEDPAJAMA13B,rEDPAJAMA33B,rEDPAJAMA65B,dOLLY70M,dOLLY160M,dOLLY410M,dOLLY1B,dOLLY1Period4B,dOLLY2Period8B,dOLLY6Period9B,dOLLY12B,pYTHIA70M,pYTHIA160M,pYTHIA410M,pYTHIA1B,pYTHIA1Period4B,pYTHIA2Period8B,pYTHIA6Period9B,pYTHIA12B,mOSS7B,mOSS13B,rMKVLM100M,rMKVLM400M,rMKVLM1Period5B,rMKVLM3B,rMKVLM7B,rMKVLM14B,sTARCODER15Period5B,wIZARDCODER15B,sANTACODER1Period1B,tEXTBISON,tEXTEMBEDDINGGECKO,cHATBISON,cODEBISON,cODECHATBISON,cODEGECKO,dISTILROBERTA,mISTRAL7B,gEMINI,fASTTEXT,uNIXCODER
*/

enum class ModelFoundationEnum(val value: kotlin.String){


    @Json(name = "GPT_3.5")
    gPT3Period5("GPT_3.5"),


    @Json(name = "GPT_4")
    gPT4("GPT_4"),


    @Json(name = "T5")
    t5("T5"),


    @Json(name = "LLAMA_2_7B")
    lLAMA27B("LLAMA_2_7B"),


    @Json(name = "LLAMA_2_13B")
    lLAMA213B("LLAMA_2_13B"),


    @Json(name = "LLAMA_2_70B")
    lLAMA270B("LLAMA_2_70B"),


    @Json(name = "CODE_LLAMA_2_7B")
    cODELLAMA27B("CODE_LLAMA_2_7B"),


    @Json(name = "CODE_LLAMA_2_13B")
    cODELLAMA213B("CODE_LLAMA_2_13B"),


    @Json(name = "CODE_LLAMA_2_70B")
    cODELLAMA270B("CODE_LLAMA_2_70B"),


    @Json(name = "BARD")
    bARD("BARD"),


    @Json(name = "ALPACA_7B")
    aLPACA7B("ALPACA_7B"),


    @Json(name = "ALPACA_13B")
    aLPACA13B("ALPACA_13B"),


    @Json(name = "ALPACA_33B")
    aLPACA33B("ALPACA_33B"),


    @Json(name = "ALPACA_65B")
    aLPACA65B("ALPACA_65B"),


    @Json(name = "VICUNA_7B")
    vICUNA7B("VICUNA_7B"),


    @Json(name = "VICUNA_13B")
    vICUNA13B("VICUNA_13B"),


    @Json(name = "VICUNA_33B")
    vICUNA33B("VICUNA_33B"),


    @Json(name = "VICUNA_65B")
    vICUNA65B("VICUNA_65B"),


    @Json(name = "GUANACO_7B")
    gUANACO7B("GUANACO_7B"),


    @Json(name = "GUANACO_13B")
    gUANACO13B("GUANACO_13B"),


    @Json(name = "GUANACO_33B")
    gUANACO33B("GUANACO_33B"),


    @Json(name = "GUANACO_65B")
    gUANACO65B("GUANACO_65B"),


    @Json(name = "OPENLLAMA_7B")
    oPENLLAMA7B("OPENLLAMA_7B"),


    @Json(name = "OPENLLAMA_13B")
    oPENLLAMA13B("OPENLLAMA_13B"),


    @Json(name = "GORILLA_7B")
    gORILLA7B("GORILLA_7B"),


    @Json(name = "GORILLA_13B")
    gORILLA13B("GORILLA_13B"),


    @Json(name = "GORILLA_33B")
    gORILLA33B("GORILLA_33B"),


    @Json(name = "GORILLA_65B")
    gORILLA65B("GORILLA_65B"),


    @Json(name = "WIZARDLM_7B")
    wIZARDLM7B("WIZARDLM_7B"),


    @Json(name = "WIZARDLM_13B")
    wIZARDLM13B("WIZARDLM_13B"),


    @Json(name = "WIZARDLM_30B")
    wIZARDLM30B("WIZARDLM_30B"),


    @Json(name = "YULANCHAT_13B")
    yULANCHAT13B("YULANCHAT_13B"),


    @Json(name = "YULANCHAT_65B")
    yULANCHAT65B("YULANCHAT_65B"),


    @Json(name = "REDPAJAMA_3B")
    rEDPAJAMA3B("REDPAJAMA_3B"),


    @Json(name = "REDPAJAMA_7B")
    rEDPAJAMA7B("REDPAJAMA_7B"),


    @Json(name = "REDPAJAMA_13B")
    rEDPAJAMA13B("REDPAJAMA_13B"),


    @Json(name = "REDPAJAMA_33B")
    rEDPAJAMA33B("REDPAJAMA_33B"),


    @Json(name = "REDPAJAMA_65B")
    rEDPAJAMA65B("REDPAJAMA_65B"),


    @Json(name = "DOLLY_70M")
    dOLLY70M("DOLLY_70M"),


    @Json(name = "DOLLY_160M")
    dOLLY160M("DOLLY_160M"),


    @Json(name = "DOLLY_410M")
    dOLLY410M("DOLLY_410M"),


    @Json(name = "DOLLY_1B")
    dOLLY1B("DOLLY_1B"),


    @Json(name = "DOLLY_1.4B")
    dOLLY1Period4B("DOLLY_1.4B"),


    @Json(name = "DOLLY_2.8B")
    dOLLY2Period8B("DOLLY_2.8B"),


    @Json(name = "DOLLY_6.9B")
    dOLLY6Period9B("DOLLY_6.9B"),


    @Json(name = "DOLLY_12B")
    dOLLY12B("DOLLY_12B"),


    @Json(name = "PYTHIA_70M")
    pYTHIA70M("PYTHIA_70M"),


    @Json(name = "PYTHIA_160M")
    pYTHIA160M("PYTHIA_160M"),


    @Json(name = "PYTHIA_410M")
    pYTHIA410M("PYTHIA_410M"),


    @Json(name = "PYTHIA_1B")
    pYTHIA1B("PYTHIA_1B"),


    @Json(name = "PYTHIA_1.4B")
    pYTHIA1Period4B("PYTHIA_1.4B"),


    @Json(name = "PYTHIA_2.8B")
    pYTHIA2Period8B("PYTHIA_2.8B"),


    @Json(name = "PYTHIA_6.9B")
    pYTHIA6Period9B("PYTHIA_6.9B"),


    @Json(name = "PYTHIA_12B")
    pYTHIA12B("PYTHIA_12B"),


    @Json(name = "MOSS_7B")
    mOSS7B("MOSS_7B"),


    @Json(name = "MOSS_13B")
    mOSS13B("MOSS_13B"),


    @Json(name = "RMKV_LM_100M")
    rMKVLM100M("RMKV_LM_100M"),


    @Json(name = "RMKV_LM_400M")
    rMKVLM400M("RMKV_LM_400M"),


    @Json(name = "RMKV_LM_1.5B")
    rMKVLM1Period5B("RMKV_LM_1.5B"),


    @Json(name = "RMKV_LM_3B")
    rMKVLM3B("RMKV_LM_3B"),


    @Json(name = "RMKV_LM_7B")
    rMKVLM7B("RMKV_LM_7B"),


    @Json(name = "RMKV_LM_14B")
    rMKVLM14B("RMKV_LM_14B"),


    @Json(name = "STARCODER_15.5B")
    sTARCODER15Period5B("STARCODER_15.5B"),


    @Json(name = "WIZARDCODER_15B")
    wIZARDCODER15B("WIZARDCODER_15B"),


    @Json(name = "SANTACODER_1.1B")
    sANTACODER1Period1B("SANTACODER_1.1B"),


    @Json(name = "TEXT_BISON")
    tEXTBISON("TEXT_BISON"),


    @Json(name = "TEXTEMBEDDING_GECKO")
    tEXTEMBEDDINGGECKO("TEXTEMBEDDING_GECKO"),


    @Json(name = "CHAT_BISON")
    cHATBISON("CHAT_BISON"),


    @Json(name = "CODE_BISON")
    cODEBISON("CODE_BISON"),


    @Json(name = "CODECHAT_BISON")
    cODECHATBISON("CODECHAT_BISON"),


    @Json(name = "CODE_GECKO")
    cODEGECKO("CODE_GECKO"),


    @Json(name = "DISTILROBERTA")
    dISTILROBERTA("DISTILROBERTA"),


    @Json(name = "MISTRAL_7B")
    mISTRAL7B("MISTRAL_7B"),


    @Json(name = "GEMINI")
    gEMINI("GEMINI"),


    @Json(name = "FAST_TEXT")
    fASTTEXT("FAST_TEXT"),


    @Json(name = "UNIXCODER")
    uNIXCODER("UNIXCODER");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

