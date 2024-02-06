package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Record(
    @SerialName("losses")
    val losses: Int,
    @SerialName("wins")
    val wins: Int
)