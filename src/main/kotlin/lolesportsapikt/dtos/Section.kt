package lolesportsapikt.dtos


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Section(
    @SerialName("matches")
    val matches: List<Match>,
    @SerialName("name")
    val name: String,
    @SerialName("rankings")
    val rankings: List<Rank>
)