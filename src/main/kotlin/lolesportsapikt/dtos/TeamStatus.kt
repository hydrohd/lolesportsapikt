package lolesportsapikt.dtos
import kotlinx.serialization.Serializable
@Serializable
enum class TeamStatus(val status: String) {
    archived("archived"),
    active("active")
}