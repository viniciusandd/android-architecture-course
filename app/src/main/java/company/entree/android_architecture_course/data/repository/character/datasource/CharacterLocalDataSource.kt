package company.entree.android_architecture_course.data.repository.character.datasource

import company.entree.android_architecture_course.data.model.character.Character

interface CharacterLocalDataSource {
    suspend fun get() : List<Character>
    suspend fun save(characters: List<Character>)
    suspend fun clearAll()
 }