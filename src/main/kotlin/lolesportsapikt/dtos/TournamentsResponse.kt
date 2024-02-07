package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class TournamentsData(
    val leagues: List<TournamentLeagues>
)

@Serializable
data class TournamentLeagues(
    val tournaments: List<Tournament>
)

@Serializable
data class TournamentsResponse(
    val data: TournamentsData
)
