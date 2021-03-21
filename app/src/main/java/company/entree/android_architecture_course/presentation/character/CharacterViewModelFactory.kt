package company.entree.android_architecture_course.presentation.character

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import company.entree.android_architecture_course.domain.use_case.character.GetCharactersUseCase
import company.entree.android_architecture_course.domain.use_case.character.UpdateCharacterUseCase

class CharacterViewModelFactory(
    private val getCharactersUseCase: GetCharactersUseCase,
    private val updateCharacterUseCase: UpdateCharacterUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CharacterViewModel(
            getCharactersUseCase, updateCharacterUseCase
        ) as T
    }
}