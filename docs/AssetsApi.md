# AssetsApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetsCreateNewAsset**](AssetsApi.md#assetsCreateNewAsset) | **POST** /assets/create | /assets/create [POST] Scoped to Asset
[**assetsDeleteAsset**](AssetsApi.md#assetsDeleteAsset) | **POST** /assets/{asset}/delete | /assets/delete [POST] Scoped to Asset
[**assetsDraft**](AssetsApi.md#assetsDraft) | **POST** /assets/draft | /assets/draft [POST]
[**assetsGetRecommendedAssets**](AssetsApi.md#assetsGetRecommendedAssets) | **GET** /assets/recommended | Your GET endpoint
[**assetsGetRelatedAssets**](AssetsApi.md#assetsGetRelatedAssets) | **GET** /assets/related | /assets/related [GET]
[**assetsIdentifiersSnapshot**](AssetsApi.md#assetsIdentifiersSnapshot) | **GET** /assets/identifiers | /assets/identifiers [GET]
[**assetsPseudoSnapshot**](AssetsApi.md#assetsPseudoSnapshot) | **GET** /assets/pseudo | /assets/pseudo [GET]
[**assetsSearchAssets**](AssetsApi.md#assetsSearchAssets) | **GET** /assets/search | /assets/search?query&#x3D;string [GET]
[**assetsSearchWithFilters**](AssetsApi.md#assetsSearchWithFilters) | **POST** /assets/search | /assets/search [POST]
[**assetsSnapshot**](AssetsApi.md#assetsSnapshot) | **GET** /assets | /assets [GET] Scoped to Assets
[**assetsSpecificAssetFormatsSnapshot**](AssetsApi.md#assetsSpecificAssetFormatsSnapshot) | **GET** /assets/{asset}/formats | /assets/{asset}/formats [GET] Scoped To Assets
[**assetsSpecificAssetSnapshot**](AssetsApi.md#assetsSpecificAssetSnapshot) | **GET** /assets/{asset} | /assets/{asset} [GET] Scoped to Assets
[**assetsStreamIdentifiers**](AssetsApi.md#assetsStreamIdentifiers) | **GET** /assets/stream/identifiers | /assets/stream/identifiers [GET]
[**getAssetsStreamTransferables**](AssetsApi.md#getAssetsStreamTransferables) | **GET** /assets/stream/transferables | Your GET endpoint
[**streamAssets**](AssetsApi.md#streamAssets) | **GET** /assets/stream | /assets/stream [GET]


<a name="assetsCreateNewAsset"></a>
# **assetsCreateNewAsset**
> Asset assetsCreateNewAsset(transferables, seed)

/assets/create [POST] Scoped to Asset

This endpoint will accept a seeded (a structure that comes before an asset, will be used in creation) asset to be uploaded to pieces. Response here will be an Asset that was create!

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val seed : Seed =  // Seed | 
try {
    val result : Asset = apiInstance.assetsCreateNewAsset(transferables, seed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsCreateNewAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsCreateNewAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **seed** | [**Seed**](Seed.md)|  | [optional]

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assetsDeleteAsset"></a>
# **assetsDeleteAsset**
> kotlin.String assetsDeleteAsset(asset)

/assets/delete [POST] Scoped to Asset

This endpoint will just take a uid to delete out of the assets table, will return the uid that was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
try {
    val result : kotlin.String = apiInstance.assetsDeleteAsset(asset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsDeleteAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsDeleteAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsDraft"></a>
# **assetsDraft**
> Seed assetsDraft(transferables, seed)

/assets/draft [POST]

This is an endpoint that will enable a developer to pass in a Seed and get a seed with preprocessed information on that seed out of this endpoint, nothing is persisted, this is a strict input/output endpoint. and return a drafted asset (seed with some initial information).  for images, we will just return the seed that was passed to us. a TODO for v2 would eb to add preprocessing for images as well.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val seed : Seed =  // Seed | 
try {
    val result : Seed = apiInstance.assetsDraft(transferables, seed)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **seed** | [**Seed**](Seed.md)|  | [optional]

### Return type

[**Seed**](Seed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assetsGetRecommendedAssets"></a>
# **assetsGetRecommendedAssets**
> Assets assetsGetRecommendedAssets(seededAssetsRecommendation)

Your GET endpoint

An endpoint that takes in a SeededAssetsRecommendation Model within it&#39;s request body, which requires an object including assets (Assets Model) as well as interactions (InteractedAssets Model) - the resulting will return an Assets Model for use in a UI.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val seededAssetsRecommendation : SeededAssetsRecommendation =  // SeededAssetsRecommendation | The body of the request will be an SeededAssetsRecommendation Model with interaction meta data included at body.interactions.iterable and then the corrresponding index-paired body.assets.iterable with a fully populated assets array with fully sub-populated formats.
try {
    val result : Assets = apiInstance.assetsGetRecommendedAssets(seededAssetsRecommendation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsGetRecommendedAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsGetRecommendedAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seededAssetsRecommendation** | [**SeededAssetsRecommendation**](SeededAssetsRecommendation.md)| The body of the request will be an SeededAssetsRecommendation Model with interaction meta data included at body.interactions.iterable and then the corrresponding index-paired body.assets.iterable with a fully populated assets array with fully sub-populated formats. | [optional]

### Return type

[**Assets**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assetsGetRelatedAssets"></a>
# **assetsGetRelatedAssets**
> Assets assetsGetRelatedAssets(assets)

/assets/related [GET]

Gets one or more related assets when provided one or more input assets. The body will expect the shape of

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assets : Assets =  // Assets | The body of the request is an object (Assets Model) with iterable internally.
try {
    val result : Assets = apiInstance.assetsGetRelatedAssets(assets)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsGetRelatedAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsGetRelatedAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets** | [**Assets**](Assets.md)| The body of the request is an object (Assets Model) with iterable internally. | [optional]

### Return type

[**Assets**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assetsIdentifiersSnapshot"></a>
# **assetsIdentifiersSnapshot**
> FlattenedAssets assetsIdentifiersSnapshot(pseudo)

/assets/identifiers [GET]

This will get all of your asset ids

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val pseudo : kotlin.Boolean = true // kotlin.Boolean | This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false.
try {
    val result : FlattenedAssets = apiInstance.assetsIdentifiersSnapshot(pseudo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsIdentifiersSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsIdentifiersSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pseudo** | **kotlin.Boolean**| This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. | [optional]

### Return type

[**FlattenedAssets**](FlattenedAssets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsPseudoSnapshot"></a>
# **assetsPseudoSnapshot**
> PseudoAssets assetsPseudoSnapshot()

/assets/pseudo [GET]

This will get a snapshot of ONLY the pseudo Assets included in your Pieces drive.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
try {
    val result : PseudoAssets = apiInstance.assetsPseudoSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsPseudoSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsPseudoSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PseudoAssets**](PseudoAssets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsSearchAssets"></a>
# **assetsSearchAssets**
> SearchedAssets assetsSearchAssets(query, transferables, searchableTags, pseudo)

/assets/search?query&#x3D;string [GET]

This function will search your pieces and will return Assets(the results) based on your query! Eventually** /assets/search?query&#x3D;string [GET] Scoped to Asset  Currently just send along your query in the body.  Required to pass searchable_tags (csv of tags) or a query string.  if a query is passed we will run through fuzzy search.  if searchable_tags are passed we will run through tag_based_search.  if neither are passed in we will return a 500.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val query : kotlin.String = query_example // kotlin.String | This is a string that you can use to search your assets.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val searchableTags : kotlin.String = searchableTags_example // kotlin.String | This is a comma separated value of tags used for search.
val pseudo : kotlin.Boolean = true // kotlin.Boolean | This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false.
try {
    val result : SearchedAssets = apiInstance.assetsSearchAssets(query, transferables, searchableTags, pseudo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsSearchAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsSearchAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| This is a string that you can use to search your assets. | [optional]
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **searchableTags** | **kotlin.String**| This is a comma separated value of tags used for search. | [optional]
 **pseudo** | **kotlin.Boolean**| This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. | [optional]

### Return type

[**SearchedAssets**](SearchedAssets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsSearchWithFilters"></a>
# **assetsSearchWithFilters**
> AssetsSearchWithFiltersOutput assetsSearchWithFilters(transferables, pseudo, assetsSearchWithFiltersInput)

/assets/search [POST]

This function will search your pieces and will return Assets(the results) based on your query! /assets/search [POST] Scoped to Asset  Currently just send along your query in the body.  if a query is passed we will run through fuzzy search.  The Post Body will also accept a search space, being either a list of uuids.(in the future potentially Seeds.) The Post Body will also accept optional filters, which is an iterable of filters all will be AND operations for now.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val pseudo : kotlin.Boolean = true // kotlin.Boolean | This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false.
val assetsSearchWithFiltersInput : AssetsSearchWithFiltersInput =  // AssetsSearchWithFiltersInput | 
try {
    val result : AssetsSearchWithFiltersOutput = apiInstance.assetsSearchWithFilters(transferables, pseudo, assetsSearchWithFiltersInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsSearchWithFilters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsSearchWithFilters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **pseudo** | **kotlin.Boolean**| This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. | [optional]
 **assetsSearchWithFiltersInput** | [**AssetsSearchWithFiltersInput**](AssetsSearchWithFiltersInput.md)|  | [optional]

### Return type

[**AssetsSearchWithFiltersOutput**](AssetsSearchWithFiltersOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assetsSnapshot"></a>
# **assetsSnapshot**
> Assets assetsSnapshot(transferables, suggested, pseudo)

/assets [GET] Scoped to Assets

Get all of the users Assets.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val suggested : kotlin.Boolean = true // kotlin.Boolean | This will let us know if a developer, wants a snapshot related to suggested content or normal content
val pseudo : kotlin.Boolean = true // kotlin.Boolean | This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false.
try {
    val result : Assets = apiInstance.assetsSnapshot(transferables, suggested, pseudo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **suggested** | **kotlin.Boolean**| This will let us know if a developer, wants a snapshot related to suggested content or normal content | [optional]
 **pseudo** | **kotlin.Boolean**| This is helper boolean that will give you the ability to also include your pseudo assets, we will always default to false. | [optional]

### Return type

[**Assets**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsSpecificAssetFormatsSnapshot"></a>
# **assetsSpecificAssetFormatsSnapshot**
> Formats assetsSpecificAssetFormatsSnapshot(asset, transferables)

/assets/{asset}/formats [GET] Scoped To Assets

This will query the formats for agiven asset when provided that asset&#39;s id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Formats = apiInstance.assetsSpecificAssetFormatsSnapshot(asset, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsSpecificAssetFormatsSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsSpecificAssetFormatsSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Formats**](Formats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsSpecificAssetSnapshot"></a>
# **assetsSpecificAssetSnapshot**
> Asset assetsSpecificAssetSnapshot(asset, transferables)

/assets/{asset} [GET] Scoped to Assets

This is an endpoint to enable a client to access a specific asset through a provided uuid in the path.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val asset : java.util.UUID = 2254f2c8-5797-40e8-ac56-41166dc0e159 // java.util.UUID | The id (uuid) of the asset that you are trying to access.
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Asset = apiInstance.assetsSpecificAssetSnapshot(asset, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsSpecificAssetSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsSpecificAssetSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | [**java.util.UUID**](.md)| The id (uuid) of the asset that you are trying to access. |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assetsStreamIdentifiers"></a>
# **assetsStreamIdentifiers**
> StreamedIdentifiers assetsStreamIdentifiers()

/assets/stream/identifiers [GET]

This will stream the asset identifiers(uuids) that have changed via a websocket connection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
try {
    val result : StreamedIdentifiers = apiInstance.assetsStreamIdentifiers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#assetsStreamIdentifiers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#assetsStreamIdentifiers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StreamedIdentifiers**](StreamedIdentifiers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetsStreamTransferables"></a>
# **getAssetsStreamTransferables**
> Assets getAssetsStreamTransferables()

Your GET endpoint

This will emit changes of your assets with your transferables included. This is a websocket connection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
try {
    val result : Assets = apiInstance.getAssetsStreamTransferables()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetsStreamTransferables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetsStreamTransferables")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Assets**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamAssets"></a>
# **streamAssets**
> Assets streamAssets()

/assets/stream [GET]

*** IMPORTANT this stream will emit changes WITHOUT the transferables on a format. if you want transferables included please refer to /assets/stream/transferables

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
try {
    val result : Assets = apiInstance.streamAssets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#streamAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#streamAssets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Assets**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

