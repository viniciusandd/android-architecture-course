package company.entree.android_architecture_course.domain.repository

import company.entree.android_architecture_course.data.model.location.Location

interface LocationRepository {
    suspend fun getLocations() : List<Location>?
    suspend fun updateLocations() : List<Location>?
}