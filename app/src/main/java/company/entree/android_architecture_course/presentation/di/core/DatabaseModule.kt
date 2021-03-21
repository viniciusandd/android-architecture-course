package company.entree.android_architecture_course.presentation.di.core

import android.content.Context
import androidx.room.Room
import company.entree.android_architecture_course.data.database.CharacterDao
import company.entree.android_architecture_course.data.database.EpisodeDao
import company.entree.android_architecture_course.data.database.LocationDao
import company.entree.android_architecture_course.data.database.RickAndMortyDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideCharacterDatabase(context: Context) : RickAndMortyDatabase {
        return Room.databaseBuilder(context, RickAndMortyDatabase::class.java, "RickAndMortyClient")
            .build()
    }

    @Singleton
    @Provides
    fun provideCharacterDao(rickAndMortyDatabase: RickAndMortyDatabase) : CharacterDao {
        return rickAndMortyDatabase.characterDao()
    }

    @Singleton
    @Provides
    fun provideEpisodeDao(rickAndMortyDatabase: RickAndMortyDatabase) : EpisodeDao {
        return rickAndMortyDatabase.episodeDao()
    }

    @Singleton
    @Provides
    fun provideLocationDao(rickAndMortyDatabase: RickAndMortyDatabase) : LocationDao {
        return rickAndMortyDatabase.locationDao()
    }
}