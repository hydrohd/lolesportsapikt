package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Event(
    @SerialName("blockName")
    val blockName: String,
    @SerialName("league")
    val league: League,
    @SerialName("match")
    val match: Match,
    @SerialName("startTime")
    val startTime: String,
    @SerialName("state")
    val state: String,
    @SerialName("type")
    val type: String
)