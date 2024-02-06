package lolesportsapikt.services

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import lolesportsapikt.dtos.Event
import lolesportsapikt.dtos.ScheduleResponse

class ScheduleApi(val client: HttpClient) {

    suspend fun getSchedule(leagueId: String): List<Event>?{
        val scheduleResponse: ScheduleResponse = client.get("getSchedule"){
            parameter("leagueId", leagueId)
        }.body()

        if (scheduleResponse.data.schedule.events.isNotEmpty()){
            return scheduleResponse.data.schedule.events
        }

        return null
    }
}