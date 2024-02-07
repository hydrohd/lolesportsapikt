package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stage(
    @SerialName("name")
    val name: String,
    @SerialName("sections")
    val sections: List<Section>,
    @SerialName("slug")
    val slug: String,
    @SerialName("type")
    val type: String? = null
)