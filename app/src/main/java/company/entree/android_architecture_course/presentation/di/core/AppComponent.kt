package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.presentation.di.character.CharacterSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    DatabaseModule::class,
    UseCaseModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    LocalDataModule::class,
    CacheDataModule::class
])
interface AppComponent {
    fun characterSubComponent() : CharacterSubComponent.Factory
}