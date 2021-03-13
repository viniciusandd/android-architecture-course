package company.entree.android_architecture_course.data.model.episode

import com.google.gson.annotations.SerializedName
import company.entree.android_architecture_course.data.model.episode.Episode

data class EpisodeList(
    @SerializedName("results")
    val episodes: List<Episode>
)