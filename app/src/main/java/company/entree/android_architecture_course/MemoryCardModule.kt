package company.entree.android_architecture_course

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {
    @Provides
    fun providesMemoryCard() : MemoryCard {
        return MemoryCard()
    }
}