package company.entree.android_architecture_course.domain.use_case.character

import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.domain.repository.CharacterRepository

class UpdateCharacterUseCase(private val characterRepository: CharacterRepository) {
    suspend fun execute() : List<Character>? = this.characterRepository.updateCharacters()
}