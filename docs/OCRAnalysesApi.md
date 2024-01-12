# OCRAnalysesApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ocrAnalysesSnapshot**](OCRAnalysesApi.md#ocrAnalysesSnapshot) | **GET** /ocr_analyses | Your GET endpoint


<a name="ocrAnalysesSnapshot"></a>
# **ocrAnalysesSnapshot**
> OCRAnalyses ocrAnalysesSnapshot(transferables)

Your GET endpoint

This will get a snapshot of all of your ocr analyses, an ocr analysis is attached to an image analysis.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = OCRAnalysesApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : OCRAnalyses = apiInstance.ocrAnalysesSnapshot(transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OCRAnalysesApi#ocrAnalysesSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OCRAnalysesApi#ocrAnalysesSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**OCRAnalyses**](OCRAnalyses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

