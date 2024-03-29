package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class League(
    val name: String,
    val region: String? = null,
    val slug: String? = null,
    val image: String? = null,
    val priority: Int? = null
)
