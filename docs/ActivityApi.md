# ActivityApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activitiesSpecificActivitySnapshot**](ActivityApi.md#activitiesSpecificActivitySnapshot) | **GET** /activity/{activity} | /activity/{activity} [GET]
[**activityIdentifiersSnapshot**](ActivityApi.md#activityIdentifiersSnapshot) | **GET** /activity/identifiers | /activity/identifiers [GET]
[**activityUpdate**](ActivityApi.md#activityUpdate) | **POST** /activity/update | /activity/update [POST]


<a name="activitiesSpecificActivitySnapshot"></a>
# **activitiesSpecificActivitySnapshot**
> Activity activitiesSpecificActivitySnapshot(activity, transferables)

/activity/{activity} [GET]

This will attempt to get a specific activity.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val activity : kotlin.String = activity_example // kotlin.String | This is a specific activity uuid.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Activity = apiInstance.activitiesSpecificActivitySnapshot(activity, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activitiesSpecificActivitySnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activitiesSpecificActivitySnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activity** | **kotlin.String**| This is a specific activity uuid. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Activity**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityIdentifiersSnapshot"></a>
# **activityIdentifiersSnapshot**
> FlattenedActivities activityIdentifiersSnapshot(pseudo, activityFilterEnum)

/activity/identifiers [GET]

This is going to return all the identifiers of the activity event in order of most recent -&gt; oldest.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val pseudo : kotlin.Boolean = true // kotlin.Boolean | This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false.
val activityFilterEnum : kotlin.String = activityFilterEnum_example // kotlin.String | This is an ActivityFilterEnum as a optional filter. Ensure you update ActivityFilterEnum if this is updated.
try {
    val result : FlattenedActivities = apiInstance.activityIdentifiersSnapshot(pseudo, activityFilterEnum)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityIdentifiersSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityIdentifiersSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pseudo** | **kotlin.Boolean**| This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. | [optional]
 **activityFilterEnum** | **kotlin.String**| This is an ActivityFilterEnum as a optional filter. Ensure you update ActivityFilterEnum if this is updated. | [optional] [enum: CREATED, UPDATED, DELETED, REFERENCED]

### Return type

[**FlattenedActivities**](FlattenedActivities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityUpdate"></a>
# **activityUpdate**
> Activity activityUpdate(transferables, activity)

/activity/update [POST]

this will update a specific activity.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val activity : Activity =  // Activity | 
try {
    val result : Activity = apiInstance.activityUpdate(transferables, activity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **activity** | [**Activity**](Activity.md)|  | [optional]

### Return type

[**Activity**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

