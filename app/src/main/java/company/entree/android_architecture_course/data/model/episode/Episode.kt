package company.entree.android_architecture_course.data.model.episode

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "episodes")
data class Episode(
    @PrimaryKey
    val id: Int,
    val air_date: String,
    val created: String,
    val episode: String,
    val name: String,
    val url: String
)