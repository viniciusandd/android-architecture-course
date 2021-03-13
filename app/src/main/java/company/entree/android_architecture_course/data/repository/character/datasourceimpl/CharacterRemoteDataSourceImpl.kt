package company.entree.android_architecture_course.data.repository.character.datasourceimpl

import company.entree.android_architecture_course.data.api.RickAndMortyService
import company.entree.android_architecture_course.data.model.character.CharacterList
import company.entree.android_architecture_course.data.repository.character.datasource.CharacterRemoteDataSource
import retrofit2.Response

class CharacterRemoteDataSourceImpl(
    private val rickAndMortyService: RickAndMortyService
) : CharacterRemoteDataSource {
    override suspend fun get(): Response<CharacterList> = this.rickAndMortyService.getCharacters()
}