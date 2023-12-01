# AnalysesApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analysesSnapshot**](AnalysesApi.md#analysesSnapshot) | **GET** /analyses | Your GET endpoint


<a name="analysesSnapshot"></a>
# **analysesSnapshot**
> Analyses analysesSnapshot(transferables)

Your GET endpoint

This will get a snapshot of all of your analyses, that are all attached to formats. An analysis can optionally have an codeAnalysis or an optional imageAnalysis.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AnalysesApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Analyses = apiInstance.analysesSnapshot(transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalysesApi#analysesSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalysesApi#analysesSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Analyses**](Analyses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

