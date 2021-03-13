package company.entree.android_architecture_course.domain.repository

import company.entree.android_architecture_course.data.model.episode.Episode

interface EpisodeRepository {
    suspend fun getEpisodes() : List<Episode>?
    suspend fun updateEpisodes() : List<Episode>?
}