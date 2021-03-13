package company.entree.android_architecture_course.data.repository.character.datasourceimpl

import company.entree.android_architecture_course.data.database.CharacterDao
import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CharacterLocalDataSourceImpl(
    private val characterDao: CharacterDao
) : CharacterLocalDataSource {
    override suspend fun get(): List<Character> = this.characterDao.get()

    override suspend fun save(characters: List<Character>) {
        CoroutineScope(Dispatchers.IO).launch {
            this@CharacterLocalDataSourceImpl.characterDao.save(characters)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            this@CharacterLocalDataSourceImpl.characterDao.deleteAll()
        }
    }
}