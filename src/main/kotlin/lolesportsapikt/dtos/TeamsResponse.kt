package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class TeamsResponse(
    val data: TeamsData
)

@Serializable
data class TeamsData(
    val teams: List<Team>
)
