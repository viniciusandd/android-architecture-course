package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.data.database.CharacterDao
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterLocalDataSource
import company.entree.android_architecture_course.data.repository.character.datasourceimpl.CharacterLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideCharacterLocalDataSource(characterDao: CharacterDao) : CharacterLocalDataSource {
        return CharacterLocalDataSourceImpl(characterDao)
    }
}