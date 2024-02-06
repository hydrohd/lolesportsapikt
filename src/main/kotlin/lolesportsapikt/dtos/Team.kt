package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Team(
    val alternativeImage: String?,   // An alternative image for the team, usually some silhouette of OG logo
    val backgroundImage: String?,    //Just a different version of a team logo
    val slug: String,               //The slug for the team
    val name: String,               //The name for this team, this is the full name.
    val code: String? = null,       //IDK
    val image: String,              //Link to team logo
    val status: TeamStatus,         //Indicates whether team is active or archived.
    val players: List<Player>,      //The players on the team
    val homeLeague: League,         //The home league for the team, such as LCS or LEc
    val id: String,                 //The id for the team
)
