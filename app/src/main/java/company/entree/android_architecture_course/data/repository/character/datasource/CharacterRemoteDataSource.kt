package company.entree.android_architecture_course.data.repository.character.datasource

import company.entree.android_architecture_course.data.model.character.CharacterList
import retrofit2.Response

interface CharacterRemoteDataSource {
    suspend fun get() : Response<CharacterList>
}