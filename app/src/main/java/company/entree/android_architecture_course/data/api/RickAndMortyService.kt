package company.entree.android_architecture_course.data.api

import company.entree.android_architecture_course.data.model.character.CharacterList
import company.entree.android_architecture_course.data.model.episode.EpisodeList
import company.entree.android_architecture_course.data.model.location.LocationList
import retrofit2.Response
import retrofit2.http.GET

interface RickAndMortyService {
    @GET("character")
    suspend fun getCharacters() : Response<CharacterList>

    @GET("episode")
    suspend fun getEpisodes() : Response<EpisodeList>

    @GET("location")
    suspend fun getLocations() : Response<LocationList>
}