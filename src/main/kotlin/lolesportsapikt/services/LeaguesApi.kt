package lolesportsapikt.services

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import lolesportsapikt.dtos.League
import lolesportsapikt.dtos.LeaguesResponse

class LeaguesApi(val client: HttpClient) {

    suspend fun getAllLeagues(): List<League>{
        val leaguesResponse: LeaguesResponse = client.get("getLeagues").body()

        return leaguesResponse.data.leagues
    }

    suspend fun getLeague(leagueId: String): League? {
        val leaguesResponse: LeaguesResponse = client.get("getLeagues"){
            parameter("id", leagueId)
        }.body()

        if (leaguesResponse.data.leagues.isNotEmpty()){
            return leaguesResponse.data.leagues[0]
        }
        return null
    }
}