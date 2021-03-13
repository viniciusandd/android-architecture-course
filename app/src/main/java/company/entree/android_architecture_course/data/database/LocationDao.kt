package company.entree.android_architecture_course.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import company.entree.android_architecture_course.data.model.location.Location

@Dao
interface LocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(locations: List<Location>)

    @Query(value = "DELETE FROM locations")
    suspend fun deleteAll()

    @Query(value = "SELECT * FROM locations")
    suspend fun get(locations: List<Location>)
}