package company.entree.android_architecture_course.data.model.location

import com.google.gson.annotations.SerializedName
import company.entree.android_architecture_course.data.model.location.Location

data class LocationList(
    @SerializedName("results")
    val locations: List<Location>
)