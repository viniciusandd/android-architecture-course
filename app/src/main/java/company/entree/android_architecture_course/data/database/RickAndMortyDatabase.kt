package company.entree.android_architecture_course.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.data.model.episode.Episode
import company.entree.android_architecture_course.data.model.location.Location

@Database(
        entities = [Character::class, Episode::class, Location::class],
        version = 1,
        exportSchema = false
)
abstract class RickAndMortyDatabase : RoomDatabase() {
    abstract fun characterDao() : CharacterDao
    abstract fun episodeDao() : EpisodeDao
    abstract fun locationDao() : LocationDao
}