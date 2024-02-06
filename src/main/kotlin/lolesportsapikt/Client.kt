package lolesportsapikt

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.util.*
import kotlinx.serialization.json.*
import lolesportsapikt.services.TeamsApi


suspend fun main() {
    val client = HttpClient(CIO){
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }

//        install(Logging) {
//            level = LogLevel.ALL
//        }

        defaultRequest {
            url {
                protocol = URLProtocol.HTTPS
                host = "esports-api.lolesports.com"
                path("/persisted/gw/")
                parameters.append("hl", "en-US")
            }
            header("x-api-key", "0TvQnueqKa5mxJntVWt0w4LpLfEkrV1Ta8rQBb9Z")
        }


    }
    val teamsService = TeamsApi(client)

    val aTeam =  teamsService.getTeam("98926509885559666")

    println(aTeam?.name)



//    val response: HttpResponse = client.get("https://httpbin.org/get"){
//        accept(ContentType.Application.Json)
//        url { parameters.append("hello", "world") }
//    }
//
//    println(response.bodyAsText())
}