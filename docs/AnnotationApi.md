# AnnotationApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annotationScoresIncrement**](AnnotationApi.md#annotationScoresIncrement) | **POST** /annotation/{annotation}/scores/increment | &#39;/annotation/{annotation}/scores/increment&#39; [POST]
[**annotationSpecificAnnotationSnapshot**](AnnotationApi.md#annotationSpecificAnnotationSnapshot) | **GET** /annotation/{annotation} | /annotation/{annotation} [GET]
[**annotationUpdate**](AnnotationApi.md#annotationUpdate) | **POST** /annotation/update | /annotation/update [POST]


<a name="annotationScoresIncrement"></a>
# **annotationScoresIncrement**
> annotationScoresIncrement(annotation, seededScoreIncrement)

&#39;/annotation/{annotation}/scores/increment&#39; [POST]

This will take in a SeededScoreIncrement and will increment the material relative to the incoming body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AnnotationApi()
val annotation : kotlin.String = annotation_example // kotlin.String | This is a specific annotation uuid.
val seededScoreIncrement : SeededScoreIncrement =  // SeededScoreIncrement | 
try {
    apiInstance.annotationScoresIncrement(annotation, seededScoreIncrement)
} catch (e: ClientException) {
    println("4xx response calling AnnotationApi#annotationScoresIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationApi#annotationScoresIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotation** | **kotlin.String**| This is a specific annotation uuid. |
 **seededScoreIncrement** | [**SeededScoreIncrement**](SeededScoreIncrement.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annotationSpecificAnnotationSnapshot"></a>
# **annotationSpecificAnnotationSnapshot**
> Annotation annotationSpecificAnnotationSnapshot(annotation)

/annotation/{annotation} [GET]

This will get a snapshot of a specific annotation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AnnotationApi()
val annotation : kotlin.String = annotation_example // kotlin.String | This is a specific annotation uuid.
try {
    val result : Annotation = apiInstance.annotationSpecificAnnotationSnapshot(annotation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnotationApi#annotationSpecificAnnotationSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationApi#annotationSpecificAnnotationSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotation** | **kotlin.String**| This is a specific annotation uuid. |

### Return type

[**Annotation**](Annotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="annotationUpdate"></a>
# **annotationUpdate**
> Annotation annotationUpdate(annotation)

/annotation/update [POST]

This will update a specific annotation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AnnotationApi()
val annotation : Annotation =  // Annotation | 
try {
    val result : Annotation = apiInstance.annotationUpdate(annotation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnotationApi#annotationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationApi#annotationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotation** | [**Annotation**](Annotation.md)|  | [optional]

### Return type

[**Annotation**](Annotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

