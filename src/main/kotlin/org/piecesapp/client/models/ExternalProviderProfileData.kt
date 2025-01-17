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
 * All of these will be optional.  Will support ProfileData from all our social providers.
 * @param name 
 * @param picture 
 * @param nickname 
 * @param email 
 * @param emailVerified 
 * @param nodeId 
 * @param gravatarId 
 * @param url 
 * @param htmlUrl 
 * @param followersUrl 
 * @param followingUrl 
 * @param gistsUrl 
 * @param starredUrl 
 * @param subscriptionsUrl 
 * @param organizationsUrl 
 * @param reposUrl 
 * @param eventsUrl 
 * @param receivedEventsUrl 
 * @param type 
 * @param siteAdmin 
 * @param company 
 * @param blog 
 * @param anchor 
 * @param hireable 
 * @param bio 
 * @param twitterUsername 
 * @param publicRepos 
 * @param publicGists 
 * @param followers 
 * @param following 
 * @param createdAt 
 * @param updatedAt 
 * @param privateGists 
 * @param totalPrivateRepos 
 * @param ownedPrivateRepos 
 * @param diskUsage 
 * @param collaborators 
 * @param twoFactorAuthentication 
 */

data class ExternalProviderProfileData (
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "picture")
    val picture: kotlin.String? = null,
    @Json(name = "nickname")
    val nickname: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "email_verified")
    val emailVerified: kotlin.Boolean? = null,
    @Json(name = "node_id")
    val nodeId: kotlin.String? = null,
    @Json(name = "gravatar_id")
    val gravatarId: kotlin.String? = null,
    @Json(name = "url")
    val url: kotlin.String? = null,
    @Json(name = "html_url")
    val htmlUrl: kotlin.String? = null,
    @Json(name = "followers_url")
    val followersUrl: kotlin.String? = null,
    @Json(name = "following_url")
    val followingUrl: kotlin.String? = null,
    @Json(name = "gists_url")
    val gistsUrl: kotlin.String? = null,
    @Json(name = "starred_url")
    val starredUrl: kotlin.String? = null,
    @Json(name = "subscriptions_url")
    val subscriptionsUrl: kotlin.String? = null,
    @Json(name = "organizations_url")
    val organizationsUrl: kotlin.String? = null,
    @Json(name = "repos_url")
    val reposUrl: kotlin.String? = null,
    @Json(name = "events_url")
    val eventsUrl: kotlin.String? = null,
    @Json(name = "received_events_url")
    val receivedEventsUrl: kotlin.String? = null,
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "site_admin")
    val siteAdmin: kotlin.Boolean? = null,
    @Json(name = "company")
    val company: kotlin.String? = null,
    @Json(name = "blog")
    val blog: kotlin.String? = null,
    @Json(name = "anchor")
    val anchor: kotlin.String? = null,
    @Json(name = "hireable")
    val hireable: kotlin.Boolean? = null,
    @Json(name = "bio")
    val bio: kotlin.String? = null,
    @Json(name = "twitter_username")
    val twitterUsername: kotlin.String? = null,
    @Json(name = "public_repos")
    val publicRepos: kotlin.Int? = null,
    @Json(name = "public_gists")
    val publicGists: kotlin.Int? = null,
    @Json(name = "followers")
    val followers: kotlin.Int? = null,
    @Json(name = "following")
    val following: kotlin.Int? = null,
    @Json(name = "created_at")
    val createdAt: kotlin.String? = null,
    @Json(name = "updated_at")
    val updatedAt: kotlin.String? = null,
    @Json(name = "private_gists")
    val privateGists: kotlin.Int? = null,
    @Json(name = "total_private_repos")
    val totalPrivateRepos: kotlin.Int? = null,
    @Json(name = "owned_private_repos")
    val ownedPrivateRepos: kotlin.Int? = null,
    @Json(name = "disk_usage")
    val diskUsage: kotlin.Int? = null,
    @Json(name = "collaborators")
    val collaborators: kotlin.Int? = null,
    @Json(name = "two_factor_authentication")
    val twoFactorAuthentication: kotlin.Boolean? = null
)

