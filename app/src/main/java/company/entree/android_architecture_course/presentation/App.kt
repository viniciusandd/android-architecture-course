package company.entree.android_architecture_course.presentation

import android.app.Application
import company.entree.android_architecture_course.BuildConfig
import company.entree.android_architecture_course.presentation.di.Injector
import company.entree.android_architecture_course.presentation.di.character.CharacterSubComponent
import company.entree.android_architecture_course.presentation.di.core.*

class App : Application(), Injector {
    private lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .netModule(NetModule(BuildConfig.BASE_URL))
                .remoteDataModule(RemoteDataModule())
                .build()
    }

    override fun createCharacterSubComponent(): CharacterSubComponent {
        return appComponent.characterSubComponent().create()
    }
}