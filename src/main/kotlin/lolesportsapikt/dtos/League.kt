package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class League(
    val name: String,
    val region: String
)
