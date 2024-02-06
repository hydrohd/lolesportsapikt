package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class LeaguesResponse(
    val data: LeaguesData
)

@Serializable
data class LeaguesData(
    val leagues: List<League>
)
