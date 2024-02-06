package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class ScheduleResponse(
    val data: ScheduleData

)

@Serializable
data class ScheduleData(
    val schedule: Schedule
)

@Serializable
data class Schedule(
    val events: List<Event>
)
