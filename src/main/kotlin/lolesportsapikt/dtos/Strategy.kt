package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Strategy(
    @SerialName("count")
    val count: Int,
    @SerialName("type")
    val type: String
)