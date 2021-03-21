package company.entree.android_architecture_course.presentation.di.character

import company.entree.android_architecture_course.presentation.character.CharacterActivity
import dagger.Subcomponent

@CharacterScope
@Subcomponent(modules = [CharacterModule::class])
class CharacterSubComponent {
    fun inject(characterActivity: CharacterActivity) {}

    @Subcomponent.Factory
    interface Factory {
        fun create() : CharacterSubComponent
    }
}