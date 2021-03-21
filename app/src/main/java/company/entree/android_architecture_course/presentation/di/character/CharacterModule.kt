package company.entree.android_architecture_course.presentation.di.character

import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.domain.use_case.character.GetCharactersUseCase
import company.entree.android_architecture_course.domain.use_case.character.UpdateCharacterUseCase
import company.entree.android_architecture_course.presentation.character.CharacterViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CharacterModule {
    @CharacterScope
    @Provides
    fun provideCharacterViewModelFactory(
        getCharactersUseCase: GetCharactersUseCase,
        updateCharacterUseCase: UpdateCharacterUseCase
    ) : CharacterViewModelFactory {
        return CharacterViewModelFactory(
            getCharactersUseCase,
            updateCharacterUseCase
        )
    }
}