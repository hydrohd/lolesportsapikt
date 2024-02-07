package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Rank(
    @SerialName("ordinal")
    val ordinal: Int,
    @SerialName("teams")
    val teams: List<Team>
)