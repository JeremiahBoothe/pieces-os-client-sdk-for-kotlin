# RelationshipApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationshipsSpecificRelationshipSnapshot**](RelationshipApi.md#relationshipsSpecificRelationshipSnapshot) | **GET** /relationship/{relationship} | /relationship/{relationship} [GET]


<a name="relationshipsSpecificRelationshipSnapshot"></a>
# **relationshipsSpecificRelationshipSnapshot**
> Relationship relationshipsSpecificRelationshipSnapshot(relationship)

/relationship/{relationship} [GET]

This will return a single relationship object.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = RelationshipApi()
val relationship : kotlin.String = relationship_example // kotlin.String | this is a specific relationship uuid.
try {
    val result : Relationship = apiInstance.relationshipsSpecificRelationshipSnapshot(relationship)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationshipApi#relationshipsSpecificRelationshipSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationshipApi#relationshipsSpecificRelationshipSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship** | **kotlin.String**| this is a specific relationship uuid. |

### Return type

[**Relationship**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

