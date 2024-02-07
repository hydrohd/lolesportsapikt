package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Tournament(
    val id: String,
    val slug: String,
    val startDate: String,
    val endDate: String
)
