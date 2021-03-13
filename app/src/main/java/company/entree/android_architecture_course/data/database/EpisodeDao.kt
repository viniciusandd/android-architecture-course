package company.entree.android_architecture_course.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import company.entree.android_architecture_course.data.model.episode.Episode

@Dao
interface EpisodeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(episodes: List<Episode>)

    @Query(value = "DELETE FROM episodes")
    suspend fun deleteAll()

    @Query(value = "SELECT * FROM episodes")
    suspend fun get() : List<Episode>
}