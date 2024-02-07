package lolesportsapikt.services
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import lolesportsapikt.dtos.Team
import lolesportsapikt.dtos.TeamsResponse

class TeamsApi(private val client: HttpClient) {
    suspend fun getTeam(teamId: String): Team?{

        val teamsResponse: TeamsResponse = client.get("getTeams"){
            parameter("id", teamId)
        }.body()

        if (teamsResponse.data.teams.isNotEmpty()){
            return teamsResponse.data.teams[0]
        }

        return null
    }

    suspend fun getAllTeams(): List<Team>{
        val teamsResponse: TeamsResponse = client.get("getTeams").body()

        return teamsResponse.data.teams
    }
}