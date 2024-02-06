package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Result(
    @SerialName("gameWins")
    val gameWins: Int? = null,
    @SerialName("outcome")
    val outcome: String? = null
)