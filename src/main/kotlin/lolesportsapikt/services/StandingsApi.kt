package lolesportsapikt.services

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import lolesportsapikt.dtos.Standing
import lolesportsapikt.dtos.StandingsResponse

class StandingsApi(private val client: HttpClient) {

    suspend fun getStandings(tournamentId: String): List<Standing>?{

        val standingsResponse: StandingsResponse = client.get("getStandings"){
          parameter("tournamentId", tournamentId)
        }.body()

        if (standingsResponse.data.standings.isNotEmpty()){
            return standingsResponse.data.standings
        }

         return null

    }
}