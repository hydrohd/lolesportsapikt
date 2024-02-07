package lolesportsapikt.services

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import lolesportsapikt.dtos.Tournament
import lolesportsapikt.dtos.TournamentsResponse

class TournamentsApi(private val client: HttpClient) {

    suspend fun getTournamentsByLeague(leagueId: String): List<Tournament>?{
        val tournamentResponse: TournamentsResponse =  client.get("getTournamentsForLeague"){
            parameter("leagueId", leagueId)
        }.body()

        if (tournamentResponse.data.leagues.isNotEmpty() && tournamentResponse.data.leagues[0].tournaments.isNotEmpty()){
            return tournamentResponse.data.leagues[0].tournaments
        }

        return null
    }
}