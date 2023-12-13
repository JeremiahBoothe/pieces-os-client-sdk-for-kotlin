# SensitivesApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sensitivesCreateNewSensitive**](SensitivesApi.md#sensitivesCreateNewSensitive) | **POST** /sensitives/create | /sensitives/create [POST]
[**sensitivesDeleteSensitive**](SensitivesApi.md#sensitivesDeleteSensitive) | **POST** /sensitives/{sensitive}/delete | /sensitives/{sensitive}/delete [POST]
[**sensitivesSnapshot**](SensitivesApi.md#sensitivesSnapshot) | **GET** /sensitives | /sensitives [GET]


<a name="sensitivesCreateNewSensitive"></a>
# **sensitivesCreateNewSensitive**
> Sensitive sensitivesCreateNewSensitive(seededSensitive)

/sensitives/create [POST]

This will create a new sensitive model.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensitivesApi()
val seededSensitive : SeededSensitive =  // SeededSensitive | 
try {
    val result : Sensitive = apiInstance.sensitivesCreateNewSensitive(seededSensitive)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensitivesApi#sensitivesCreateNewSensitive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensitivesApi#sensitivesCreateNewSensitive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seededSensitive** | [**SeededSensitive**](SeededSensitive.md)|  | [optional]

### Return type

[**Sensitive**](Sensitive.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sensitivesDeleteSensitive"></a>
# **sensitivesDeleteSensitive**
> sensitivesDeleteSensitive(sensitive)

/sensitives/{sensitive}/delete [POST]

This will delete a sensitive based on the sensitive uuid.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensitivesApi()
val sensitive : kotlin.String = sensitive_example // kotlin.String | This is a uuid that represents a sensitive.
try {
    apiInstance.sensitivesDeleteSensitive(sensitive)
} catch (e: ClientException) {
    println("4xx response calling SensitivesApi#sensitivesDeleteSensitive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensitivesApi#sensitivesDeleteSensitive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitive** | **kotlin.String**| This is a uuid that represents a sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sensitivesSnapshot"></a>
# **sensitivesSnapshot**
> Sensitives sensitivesSnapshot()

/sensitives [GET]

This will get a snapshot of all of the sensitives.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SensitivesApi()
try {
    val result : Sensitives = apiInstance.sensitivesSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SensitivesApi#sensitivesSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SensitivesApi#sensitivesSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Sensitives**](Sensitives.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

