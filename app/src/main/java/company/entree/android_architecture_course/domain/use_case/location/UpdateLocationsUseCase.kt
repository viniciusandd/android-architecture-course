package company.entree.android_architecture_course.domain.use_case.location

import company.entree.android_architecture_course.data.model.location.Location
import company.entree.android_architecture_course.domain.repository.LocationRepository

class UpdateLocationsUseCase(private val locationRepository: LocationRepository) {
    suspend fun execute() : List<Location>? = this.locationRepository.updateLocations()
}