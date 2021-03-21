package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.data.repository.character.datasource.CharacterCacheDataSource
import company.entree.android_architecture_course.data.repository.character.datasourceimpl.CharacterCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideCharacterCacheDataSource() : CharacterCacheDataSource {
        return CharacterCacheDataSourceImpl()
    }
}