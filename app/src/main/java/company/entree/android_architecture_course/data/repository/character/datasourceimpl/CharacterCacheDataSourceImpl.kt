package company.entree.android_architecture_course.data.repository.character.datasourceimpl

import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterCacheDataSource

class CharacterCacheDataSourceImpl : CharacterCacheDataSource {
    private var characterList = ArrayList<Character>()
    override suspend fun get(): List<Character> {
        return this.characterList
    }

    override suspend fun save(characters: List<Character>) {
        this.characterList.clear()
        this.characterList = ArrayList(characters)
    }
}