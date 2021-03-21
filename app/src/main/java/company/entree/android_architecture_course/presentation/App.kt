package company.entree.android_architecture_course.presentation

import android.app.Application
import company.entree.android_architecture_course.presentation.di.Injector
import company.entree.android_architecture_course.presentation.di.character.CharacterSubComponent
import company.entree.android_architecture_course.presentation.di.core.AppComponent

class App : Application(), Injector {
    private lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
    }

    override fun createCharacterSubComponent(): CharacterSubComponent {
        TODO("Not yet implemented")
    }
}