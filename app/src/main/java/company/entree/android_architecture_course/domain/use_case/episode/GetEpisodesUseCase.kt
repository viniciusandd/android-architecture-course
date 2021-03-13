package company.entree.android_architecture_course.domain.use_case.episode

import company.entree.android_architecture_course.data.model.episode.Episode
import company.entree.android_architecture_course.domain.repository.EpisodeRepository

class GetEpisodesUseCase(private val episodeRepository: EpisodeRepository) {
    suspend fun execute() : List<Episode>? = this.episodeRepository.getEpisodes()
}