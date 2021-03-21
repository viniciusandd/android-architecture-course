package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.data.api.RickAndMortyService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(private val baseUrl : String) {
    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(this.baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideRickAndMortyService(retrofit: Retrofit) : RickAndMortyService {
        return retrofit.create(RickAndMortyService::class.java)
    }
}