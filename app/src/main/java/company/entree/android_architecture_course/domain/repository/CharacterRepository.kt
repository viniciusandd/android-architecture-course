package company.entree.android_architecture_course.domain.repository

import company.entree.android_architecture_course.data.model.character.Character

interface CharacterRepository {
    suspend fun getCharacters() : List<Character>?
    suspend fun updateCharacters() : List<Character>?
}