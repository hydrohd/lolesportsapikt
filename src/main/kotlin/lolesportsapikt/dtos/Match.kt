package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Match(
    @SerialName("flags")
    val flags: List<String>,
    @SerialName("id")
    val id: String,
    @SerialName("strategy")
    val strategy: Strategy? = null,
    @SerialName("teams")
    val teams: List<Team>,
    @SerialName("state")
    val state: String? = null
)