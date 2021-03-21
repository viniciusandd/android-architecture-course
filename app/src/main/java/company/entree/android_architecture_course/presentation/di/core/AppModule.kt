package company.entree.android_architecture_course.presentation.di.core

import android.content.Context
import company.entree.android_architecture_course.presentation.di.character.CharacterSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CharacterSubComponent::class])
class AppModule(private val context: Context) {
    @Singleton
    @Provides
    fun provideApplicationContext() : Context {
        return context.applicationContext
    }
}