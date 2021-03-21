package company.entree.android_architecture_course.presentation.di

import company.entree.android_architecture_course.presentation.di.character.CharacterSubComponent

interface Injector {
    fun createCharacterSubComponent() : CharacterSubComponent
}