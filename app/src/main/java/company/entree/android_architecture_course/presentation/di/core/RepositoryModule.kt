package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.data.repository.character.CharacterRepositoryImpl
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterCacheDataSource
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterLocalDataSource
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterRemoteDataSource
import company.entree.android_architecture_course.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideCharacterRepository(
        characterRemoteDataSource: CharacterRemoteDataSource,
        characterLocalDataSource: CharacterLocalDataSource,
        characterCacheDataSource: CharacterCacheDataSource
    ) : CharacterRepository {
        return CharacterRepositoryImpl(
            characterRemoteDataSource,
            characterLocalDataSource,
            characterCacheDataSource
        )
    }
}