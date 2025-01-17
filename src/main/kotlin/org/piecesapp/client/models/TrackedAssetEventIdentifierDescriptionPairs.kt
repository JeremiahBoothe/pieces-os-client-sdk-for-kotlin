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

import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * These are all of the available event types that are permitted in an object pair notation.
 * @param schema 
 * @param assetCreated The key value pair for an asset being created.
 * @param assetViewed An asset was viewed
 * @param assetFormatCopied An asset's format was copied
 * @param assetFormatDownloaded An asset's format was downloaded
 * @param assetDeleted An asset was deleted or not
 * @param assetDescriptionUpdated An asset was redescribed by the user
 * @param assetNameUpdated An asset was renamed by the user
 * @param assetFormatGenericClassificationUpdated A generic classification was changed on a format within an asset
 * @param assetFormatSpecificClassificationUpdated A specific classification was changed on a format within an asset
 * @param assetCreationFailed 
 * @param assetTagAdded 
 * @param assetLinkAdded 
 * @param assetLinkGenerated user generated a link for the asset
 * @param assetLinkDeleted 
 * @param assetTagDeleted 
 * @param assetUpdated This is just a generic string for an asset was updated.
 * @param assetFormatValueEdited This is a side effect event for a format value getting edited that exists on an asset.
 * @param assetFormatUpdated This is a generic activity event for an asset getting updated because our format was updated for some reason.
 * @param assetLinkRevoked This means that a shareable link was revoked.
 * @param assetPersonAdded This just means that a person was added via the user.
 * @param assetPersonDeleted This just means that a person was deleted via the user.
 * @param assetSensitiveAdded This just means that a sensitive was added via the user.
 * @param assetSensitiveDeleted This just means that a sensitive was deleted via the user.
 * @param suggestedAssetReferenced This means that an asset was view/used while the user was looking at the suggestion view.
 * @param searchedAssetReferenced This means that an asset was view/used while the user was looking at the searching view.
 * @param assetReferenced This means that an asset was view/used while the user was looking at the default view.
 * @param activityAssetReferenced This means that a user referenced an asset by first clicking on an asset within an activity event.(ie from the activity view)
 * @param assetAnnotationAdded 
 * @param assetAnnotationDeleted 
 * @param assetAnnotationUpdated 
 * @param assetHintAdded 
 * @param assetHintDeleted 
 * @param assetHintUpdated 
 * @param assetAnchorAdded 
 * @param assetAnchorDeleted 
 * @param assetAnchorUpdated 
 */

data class TrackedAssetEventIdentifierDescriptionPairs (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* The key value pair for an asset being created. */
    @Json(name = "asset_created")
    val assetCreated: TrackedAssetEventIdentifierDescriptionPairs.AssetCreated? = null,
    /* An asset was viewed */
    @Json(name = "asset_viewed")
    val assetViewed: TrackedAssetEventIdentifierDescriptionPairs.AssetViewed? = null,
    /* An asset's format was copied */
    @Json(name = "asset_format_copied")
    val assetFormatCopied: TrackedAssetEventIdentifierDescriptionPairs.AssetFormatCopied? = null,
    /* An asset's format was downloaded */
    @Json(name = "asset_format_downloaded")
    val assetFormatDownloaded: TrackedAssetEventIdentifierDescriptionPairs.AssetFormatDownloaded? = null,
    /* An asset was deleted or not */
    @Json(name = "asset_deleted")
    val assetDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetDeleted? = null,
    /* An asset was redescribed by the user */
    @Json(name = "asset_description_updated")
    val assetDescriptionUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetDescriptionUpdated? = null,
    /* An asset was renamed by the user */
    @Json(name = "asset_name_updated")
    val assetNameUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetNameUpdated? = null,
    /* A generic classification was changed on a format within an asset */
    @Json(name = "asset_format_generic_classification_updated")
    val assetFormatGenericClassificationUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetFormatGenericClassificationUpdated? = null,
    /* A specific classification was changed on a format within an asset */
    @Json(name = "asset_format_specific_classification_updated")
    val assetFormatSpecificClassificationUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetFormatSpecificClassificationUpdated? = null,
    @Json(name = "asset_creation_failed")
    val assetCreationFailed: TrackedAssetEventIdentifierDescriptionPairs.AssetCreationFailed? = null,
    @Json(name = "asset_tag_added")
    val assetTagAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetTagAdded? = null,
    @Json(name = "asset_link_added")
    val assetLinkAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetLinkAdded? = null,
    /* user generated a link for the asset */
    @Json(name = "asset_link_generated")
    val assetLinkGenerated: TrackedAssetEventIdentifierDescriptionPairs.AssetLinkGenerated? = null,
    @Json(name = "asset_link_deleted")
    val assetLinkDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetLinkDeleted? = null,
    @Json(name = "asset_tag_deleted")
    val assetTagDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetTagDeleted? = null,
    /* This is just a generic string for an asset was updated. */
    @Json(name = "asset_updated")
    val assetUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetUpdated? = null,
    /* This is a side effect event for a format value getting edited that exists on an asset. */
    @Json(name = "asset_format_value_edited")
    val assetFormatValueEdited: TrackedAssetEventIdentifierDescriptionPairs.AssetFormatValueEdited? = null,
    /* This is a generic activity event for an asset getting updated because our format was updated for some reason. */
    @Json(name = "asset_format_updated")
    val assetFormatUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetFormatUpdated? = null,
    /* This means that a shareable link was revoked. */
    @Json(name = "asset_link_revoked")
    val assetLinkRevoked: TrackedAssetEventIdentifierDescriptionPairs.AssetLinkRevoked? = null,
    /* This just means that a person was added via the user. */
    @Json(name = "asset_person_added")
    val assetPersonAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetPersonAdded? = null,
    /* This just means that a person was deleted via the user. */
    @Json(name = "asset_person_deleted")
    val assetPersonDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetPersonDeleted? = null,
    /* This just means that a sensitive was added via the user. */
    @Json(name = "asset_sensitive_added")
    val assetSensitiveAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetSensitiveAdded? = null,
    /* This just means that a sensitive was deleted via the user. */
    @Json(name = "asset_sensitive_deleted")
    val assetSensitiveDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetSensitiveDeleted? = null,
    /* This means that an asset was view/used while the user was looking at the suggestion view. */
    @Json(name = "suggested_asset_referenced")
    val suggestedAssetReferenced: TrackedAssetEventIdentifierDescriptionPairs.SuggestedAssetReferenced? = null,
    /* This means that an asset was view/used while the user was looking at the searching view. */
    @Json(name = "searched_asset_referenced")
    val searchedAssetReferenced: TrackedAssetEventIdentifierDescriptionPairs.SearchedAssetReferenced? = null,
    /* This means that an asset was view/used while the user was looking at the default view. */
    @Json(name = "asset_referenced")
    val assetReferenced: TrackedAssetEventIdentifierDescriptionPairs.AssetReferenced? = null,
    /* This means that a user referenced an asset by first clicking on an asset within an activity event.(ie from the activity view) */
    @Json(name = "activity_asset_referenced")
    val activityAssetReferenced: TrackedAssetEventIdentifierDescriptionPairs.ActivityAssetReferenced? = null,
    @Json(name = "asset_annotation_added")
    val assetAnnotationAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetAnnotationAdded? = null,
    @Json(name = "asset_annotation_deleted")
    val assetAnnotationDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetAnnotationDeleted? = null,
    @Json(name = "asset_annotation_updated")
    val assetAnnotationUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetAnnotationUpdated? = null,
    @Json(name = "asset_hint_added")
    val assetHintAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetHintAdded? = null,
    @Json(name = "asset_hint_deleted")
    val assetHintDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetHintDeleted? = null,
    @Json(name = "asset_hint_updated")
    val assetHintUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetHintUpdated? = null,
    @Json(name = "asset_anchor_added")
    val assetAnchorAdded: TrackedAssetEventIdentifierDescriptionPairs.AssetAnchorAdded? = null,
    @Json(name = "asset_anchor_deleted")
    val assetAnchorDeleted: TrackedAssetEventIdentifierDescriptionPairs.AssetAnchorDeleted? = null,
    @Json(name = "asset_anchor_updated")
    val assetAnchorUpdated: TrackedAssetEventIdentifierDescriptionPairs.AssetAnchorUpdated? = null
) {

    /**
    * The key value pair for an asset being created.
    * Values: anAssetWasCreated
    */
    
    enum class AssetCreated(val value: kotlin.String){
        @Json(name = "an_asset_was_created") anAssetWasCreated("an_asset_was_created");
    }
    /**
    * An asset was viewed
    * Values: anAssetWasViewed
    */
    
    enum class AssetViewed(val value: kotlin.String){
        @Json(name = "an_asset_was_viewed") anAssetWasViewed("an_asset_was_viewed");
    }
    /**
    * An asset's format was copied
    * Values: anAssetPreviewFormatWasCopied
    */
    
    enum class AssetFormatCopied(val value: kotlin.String){
        @Json(name = "an_asset_preview_format_was_copied") anAssetPreviewFormatWasCopied("an_asset_preview_format_was_copied");
    }
    /**
    * An asset's format was downloaded
    * Values: anAssetFormatWasDownloaded
    */
    
    enum class AssetFormatDownloaded(val value: kotlin.String){
        @Json(name = "an_asset_format_was_downloaded") anAssetFormatWasDownloaded("an_asset_format_was_downloaded");
    }
    /**
    * An asset was deleted or not
    * Values: anAssetWasDeleted
    */
    
    enum class AssetDeleted(val value: kotlin.String){
        @Json(name = "an_asset_was_deleted") anAssetWasDeleted("an_asset_was_deleted");
    }
    /**
    * An asset was redescribed by the user
    * Values: anAssetWasRedescribedByTheUser
    */
    
    enum class AssetDescriptionUpdated(val value: kotlin.String){
        @Json(name = "an_asset_was_redescribed_by_the_user") anAssetWasRedescribedByTheUser("an_asset_was_redescribed_by_the_user");
    }
    /**
    * An asset was renamed by the user
    * Values: anAssetWasRenamedByTheUser
    */
    
    enum class AssetNameUpdated(val value: kotlin.String){
        @Json(name = "an_asset_was_renamed_by_the_user") anAssetWasRenamedByTheUser("an_asset_was_renamed_by_the_user");
    }
    /**
    * A generic classification was changed on a format within an asset
    * Values: aGenericClassificationWasChangedOnAFormatWithinAnAsset
    */
    
    enum class AssetFormatGenericClassificationUpdated(val value: kotlin.String){
        @Json(name = "a_generic_classification_was_changed_on_a_format_within_an_asset") aGenericClassificationWasChangedOnAFormatWithinAnAsset("a_generic_classification_was_changed_on_a_format_within_an_asset");
    }
    /**
    * A specific classification was changed on a format within an asset
    * Values: aSpecificClassificationWasChangedOnAFormatWithinAnAsset
    */
    
    enum class AssetFormatSpecificClassificationUpdated(val value: kotlin.String){
        @Json(name = "a_specific_classification_was_changed_on_a_format_within_an_asset") aSpecificClassificationWasChangedOnAFormatWithinAnAsset("a_specific_classification_was_changed_on_a_format_within_an_asset");
    }
    /**
    * 
    * Values: anAssetFailedToBeCreated
    */
    
    enum class AssetCreationFailed(val value: kotlin.String){
        @Json(name = "an_asset_failed_to_be_created") anAssetFailedToBeCreated("an_asset_failed_to_be_created");
    }
    /**
    * 
    * Values: aTagWasAddedByTheUser
    */
    
    enum class AssetTagAdded(val value: kotlin.String){
        @Json(name = "a_tag_was_added_by_the_user") aTagWasAddedByTheUser("a_tag_was_added_by_the_user");
    }
    /**
    * 
    * Values: aLinkWasAddedByTheUser
    */
    
    enum class AssetLinkAdded(val value: kotlin.String){
        @Json(name = "a_link_was_added_by_the_user") aLinkWasAddedByTheUser("a_link_was_added_by_the_user");
    }
    /**
    * user generated a link for the asset
    * Values: anAssetLinkWasGenerated
    */
    
    enum class AssetLinkGenerated(val value: kotlin.String){
        @Json(name = "an_asset_link_was_generated") anAssetLinkWasGenerated("an_asset_link_was_generated");
    }
    /**
    * 
    * Values: aLinkWasDeletedByTheUser
    */
    
    enum class AssetLinkDeleted(val value: kotlin.String){
        @Json(name = "a_link_was_deleted_by_the_user") aLinkWasDeletedByTheUser("a_link_was_deleted_by_the_user");
    }
    /**
    * 
    * Values: aTagWasDeletedByTheUser
    */
    
    enum class AssetTagDeleted(val value: kotlin.String){
        @Json(name = "a_tag_was_deleted_by_the_user") aTagWasDeletedByTheUser("a_tag_was_deleted_by_the_user");
    }
    /**
    * This is just a generic string for an asset was updated.
    * Values: anAssetWasUpdated
    */
    
    enum class AssetUpdated(val value: kotlin.String){
        @Json(name = "an_asset_was_updated") anAssetWasUpdated("an_asset_was_updated");
    }
    /**
    * This is a side effect event for a format value getting edited that exists on an asset.
    * Values: aSpecificFormatValueWasEditedOnAnAsset
    */
    
    enum class AssetFormatValueEdited(val value: kotlin.String){
        @Json(name = "a_specific_format_value_was_edited_on_an_asset") aSpecificFormatValueWasEditedOnAnAsset("a_specific_format_value_was_edited_on_an_asset");
    }
    /**
    * This is a generic activity event for an asset getting updated because our format was updated for some reason.
    * Values: aSpecificFormatWasUpdatedOnAnAsset
    */
    
    enum class AssetFormatUpdated(val value: kotlin.String){
        @Json(name = "a_specific_format_was_updated_on_an_asset") aSpecificFormatWasUpdatedOnAnAsset("a_specific_format_was_updated_on_an_asset");
    }
    /**
    * This means that a shareable link was revoked.
    * Values: anAssetLinkWasRevoked
    */
    
    enum class AssetLinkRevoked(val value: kotlin.String){
        @Json(name = "an_asset_link_was_revoked") anAssetLinkWasRevoked("an_asset_link_was_revoked");
    }
    /**
    * This just means that a person was added via the user.
    * Values: aPersonWasAddedByTheUser
    */
    
    enum class AssetPersonAdded(val value: kotlin.String){
        @Json(name = "a_person_was_added_by_the_user") aPersonWasAddedByTheUser("a_person_was_added_by_the_user");
    }
    /**
    * This just means that a person was deleted via the user.
    * Values: aPersonWasDeletedByTheUser
    */
    
    enum class AssetPersonDeleted(val value: kotlin.String){
        @Json(name = "a_person_was_deleted_by_the_user") aPersonWasDeletedByTheUser("a_person_was_deleted_by_the_user");
    }
    /**
    * This just means that a sensitive was added via the user.
    * Values: aSensitiveWasAddedByTheUser
    */
    
    enum class AssetSensitiveAdded(val value: kotlin.String){
        @Json(name = "a_sensitive_was_added_by_the_user") aSensitiveWasAddedByTheUser("a_sensitive_was_added_by_the_user");
    }
    /**
    * This just means that a sensitive was deleted via the user.
    * Values: aSensitiveWasDeletedByTheUser
    */
    
    enum class AssetSensitiveDeleted(val value: kotlin.String){
        @Json(name = "a_sensitive_was_deleted_by_the_user") aSensitiveWasDeletedByTheUser("a_sensitive_was_deleted_by_the_user");
    }
    /**
    * This means that an asset was view/used while the user was looking at the suggestion view.
    * Values: aSuggestedAssetWasReferencedByTheUser
    */
    
    enum class SuggestedAssetReferenced(val value: kotlin.String){
        @Json(name = "a_suggested_asset_was_referenced_by_the_user") aSuggestedAssetWasReferencedByTheUser("a_suggested_asset_was_referenced_by_the_user");
    }
    /**
    * This means that an asset was view/used while the user was looking at the searching view.
    * Values: aSearchedAssetWasReferencedByTheUser
    */
    
    enum class SearchedAssetReferenced(val value: kotlin.String){
        @Json(name = "a_searched_asset_was_referenced_by_the_user") aSearchedAssetWasReferencedByTheUser("a_searched_asset_was_referenced_by_the_user");
    }
    /**
    * This means that an asset was view/used while the user was looking at the default view.
    * Values: anAssetWasReferencedByTheUser
    */
    
    enum class AssetReferenced(val value: kotlin.String){
        @Json(name = "an_asset_was_referenced_by_the_user") anAssetWasReferencedByTheUser("an_asset_was_referenced_by_the_user");
    }
    /**
    * This means that a user referenced an asset by first clicking on an asset within an activity event.(ie from the activity view)
    * Values: anActivityAssetWasReferencedByTheUser
    */
    
    enum class ActivityAssetReferenced(val value: kotlin.String){
        @Json(name = "an_activity_asset_was_referenced_by_the_user") anActivityAssetWasReferencedByTheUser("an_activity_asset_was_referenced_by_the_user");
    }
    /**
    * 
    * Values: anAnnotationWasAddedByTheUser
    */
    
    enum class AssetAnnotationAdded(val value: kotlin.String){
        @Json(name = "an_annotation_was_added_by_the_user") anAnnotationWasAddedByTheUser("an_annotation_was_added_by_the_user");
    }
    /**
    * 
    * Values: anAnnotationWasDeletedByTheUser
    */
    
    enum class AssetAnnotationDeleted(val value: kotlin.String){
        @Json(name = "an_annotation_was_deleted_by_the_user") anAnnotationWasDeletedByTheUser("an_annotation_was_deleted_by_the_user");
    }
    /**
    * 
    * Values: anAnnotationWasUpdatedByTheUser
    */
    
    enum class AssetAnnotationUpdated(val value: kotlin.String){
        @Json(name = "an_annotation_was_updated_by_the_user") anAnnotationWasUpdatedByTheUser("an_annotation_was_updated_by_the_user");
    }
    /**
    * 
    * Values: aHintWasAddedByTheUser
    */
    
    enum class AssetHintAdded(val value: kotlin.String){
        @Json(name = "a_hint_was_added_by_the_user") aHintWasAddedByTheUser("a_hint_was_added_by_the_user");
    }
    /**
    * 
    * Values: aHintWasDeletedByTheUser
    */
    
    enum class AssetHintDeleted(val value: kotlin.String){
        @Json(name = "a_hint_was_deleted_by_the_user") aHintWasDeletedByTheUser("a_hint_was_deleted_by_the_user");
    }
    /**
    * 
    * Values: aHintWasUpdatedByTheUser
    */
    
    enum class AssetHintUpdated(val value: kotlin.String){
        @Json(name = "a_hint_was_updated_by_the_user") aHintWasUpdatedByTheUser("a_hint_was_updated_by_the_user");
    }
    /**
    * 
    * Values: aAnchorWasAddedByTheUser
    */
    
    enum class AssetAnchorAdded(val value: kotlin.String){
        @Json(name = "a_anchor_was_added_by_the_user") aAnchorWasAddedByTheUser("a_anchor_was_added_by_the_user");
    }
    /**
    * 
    * Values: aAnchorWasDeletedByTheUser
    */
    
    enum class AssetAnchorDeleted(val value: kotlin.String){
        @Json(name = "a_anchor_was_deleted_by_the_user") aAnchorWasDeletedByTheUser("a_anchor_was_deleted_by_the_user");
    }
    /**
    * 
    * Values: aAnchorWasUpdatedByTheUser
    */
    
    enum class AssetAnchorUpdated(val value: kotlin.String){
        @Json(name = "a_anchor_was_updated_by_the_user") aAnchorWasUpdatedByTheUser("a_anchor_was_updated_by_the_user");
    }
}

