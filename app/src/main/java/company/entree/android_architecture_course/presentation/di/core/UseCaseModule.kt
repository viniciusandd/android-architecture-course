package company.entree.android_architecture_course.presentation.di.core

import company.entree.android_architecture_course.domain.repository.CharacterRepository
import company.entree.android_architecture_course.domain.use_case.character.GetCharactersUseCase
import company.entree.android_architecture_course.domain.use_case.character.UpdateCharacterUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {
    @Provides
    fun provideGetCharacterUseCase(characterRepository: CharacterRepository) : GetCharactersUseCase {
        return GetCharactersUseCase(characterRepository)
    }

    @Provides
    fun provideUpdateCharacterUseCase(characterRepository: CharacterRepository) : UpdateCharacterUseCase {
        return UpdateCharacterUseCase(characterRepository)
    }
}