package company.entree.android_architecture_course.data.repository.character

import android.util.Log
import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterCacheDataSource
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterLocalDataSource
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterRemoteDataSource
import company.entree.android_architecture_course.domain.repository.CharacterRepository

class CharacterRepositoryImpl(
        private val characterRemoteDataSource: CharacterRemoteDataSource,
        private val characterLocalDataSource: CharacterLocalDataSource,
        private val characterCacheDataSource: CharacterCacheDataSource
) : CharacterRepository {
    override suspend fun getCharacters(): List<Character>? {
        return this.getCharactersFromCache()
    }

    override suspend fun updateCharacters(): List<Character>? {
        val newListOfCharacters = this.getCharactersFromAPI()
        this.characterLocalDataSource.clearAll()
        this.characterLocalDataSource.save(newListOfCharacters)
        this.characterCacheDataSource.save(newListOfCharacters)
        return newListOfCharacters
    }

    private suspend fun getCharactersFromAPI() : List<Character> {
        lateinit var characterList: List<Character>
        try {
            val response = this.characterRemoteDataSource.get()
            val body = response.body()
            body?.let {
                characterList = it.characters
            }
        } catch (exception: Exception) {
            Log.i("[GET-REMOTE]", exception.message.toString())
        }
        return characterList
    }

    private suspend fun getCharactersFromDatabase() : List<Character> {
        lateinit var characterList: List<Character>
        try {
            characterList = this.characterLocalDataSource.get()
        } catch (exception: Exception) {
            Log.i("[GET-LOCAL]", exception.message.toString())
        }
        if (characterList.size > 0) {
            return characterList
        } else {
            characterList = this.getCharactersFromAPI()
            this.characterLocalDataSource.save(characterList)
        }
        return characterList
    }

    private suspend fun getCharactersFromCache() : List<Character> {
        lateinit var characterList: List<Character>
        try {
            characterList = this.characterCacheDataSource.get()
        } catch (exception: Exception) {
            Log.i("[GET-CACHE]", exception.message.toString())
        }
        if (characterList.size > 0) {
            return characterList
        } else {
            characterList = this.getCharactersFromDatabase()
            this.characterCacheDataSource.save(characterList)
        }
        return characterList
    }
}