package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Player(
    val id: String,
    val summonerName: String,
    val firstName: String,
    val lastName: String,
    val image: String,
    val role: String
)
