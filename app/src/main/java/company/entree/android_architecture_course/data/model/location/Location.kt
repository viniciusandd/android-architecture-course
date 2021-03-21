package company.entree.android_architecture_course.data.model.location

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "locations")
data class Location(
    @PrimaryKey
    val id: Int,
    val created: String,
    val dimension: String,
    val name: String,
    val type: String,
    val url: String
)