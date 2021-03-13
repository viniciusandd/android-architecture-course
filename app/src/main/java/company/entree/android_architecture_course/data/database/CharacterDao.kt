package company.entree.android_architecture_course.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import company.entree.android_architecture_course.data.model.character.Character

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(characters: List<Character>)

    @Query(value = "DELETE FROM characters")
    suspend fun deleteAll()

    @Query(value = "SELECT * FROM characters")
    suspend fun get(characters: List<Character>)
}