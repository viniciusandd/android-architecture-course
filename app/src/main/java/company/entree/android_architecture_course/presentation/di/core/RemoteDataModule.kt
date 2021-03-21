package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.data.api.RickAndMortyService
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterRemoteDataSource
import company.entree.android_architecture_course.data.repository.character.datasourceimpl.CharacterRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideCharacterRemoteDataSource(rickAndMortyService: RickAndMortyService) : CharacterRemoteDataSource {
        return CharacterRemoteDataSourceImpl(rickAndMortyService)
    }
}