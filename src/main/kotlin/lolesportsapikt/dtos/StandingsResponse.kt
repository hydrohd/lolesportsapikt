package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class StandingsData(
    val standings: List<Standing>
)

@Serializable
data class StandingsResponse(
    val data: StandingsData
)
