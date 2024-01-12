# RelationshipsApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationshipsSnapshot**](RelationshipsApi.md#relationshipsSnapshot) | **GET** /relationships | /relationships [GET]


<a name="relationshipsSnapshot"></a>
# **relationshipsSnapshot**
> Relationships relationshipsSnapshot()

/relationships [GET]

This will reurn all of the relationships that exists within your pieces db.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = RelationshipsApi()
try {
    val result : Relationships = apiInstance.relationshipsSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationshipsApi#relationshipsSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationshipsApi#relationshipsSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Relationships**](Relationships.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

