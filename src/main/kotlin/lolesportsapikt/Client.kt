package lolesportsapikt

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.*

suspend fun main() {
    val client = HttpClient(CIO){
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }

    val response: HttpResponse = client.get("https://httpbin.org/get"){
        accept(ContentType.Application.Json)
        url { parameters.append("hello", "world") }
    }

    println(response.bodyAsText())
}