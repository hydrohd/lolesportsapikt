package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Standing(
    @SerialName("stages")
    val stages: List<Stage>
)