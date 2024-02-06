package lolesportsapikt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Team(
    val alternativeImage: String? = null,   // An alternative image for the team, usually some silhouette of OG logo
    val backgroundImage: String? = null,    //Just a different version of a team logo
    val slug: String? = null,               //The slug for the team
    val name: String,               //The name for this team, this is the full name.
    val code: String? = null,       //IDK
    val image: String,              //Link to team logo
    val status: TeamStatus? = null,         //Indicates whether team is active or archived.
    val players: List<Player>? = null,      //The players on the team
    val homeLeague: League? = null,         //The home league for the team, such as LCS or LEc
    val id: String? = null,                 //The id for the team
    val result: Result? = null,  //Event Result field, only populated for team objects that exist within an event.
    val record: Record? = null  //The teams current record for active tournament,  only populated for team objects that exist within an event.
)
