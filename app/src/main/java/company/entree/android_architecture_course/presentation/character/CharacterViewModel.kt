package company.entree.android_architecture_course.presentation.character

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import company.entree.android_architecture_course.domain.use_case.character.GetCharactersUseCase
import company.entree.android_architecture_course.domain.use_case.character.UpdateCharacterUseCase

class CharacterViewModel(
    private val getCharactersUseCase: GetCharactersUseCase,
    private val updateCharacterUseCase: UpdateCharacterUseCase
) : ViewModel() {
    fun getCharacters() = liveData {
        val characterList = this@CharacterViewModel.getCharactersUseCase.execute()
        emit(characterList)
    }

    fun updateCharacters() = liveData {
        val characterList = this@CharacterViewModel.updateCharacterUseCase.execute()
        emit(characterList)
    }
}