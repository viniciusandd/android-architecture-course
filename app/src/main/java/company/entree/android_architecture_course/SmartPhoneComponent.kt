package company.entree.android_architecture_course

import dagger.Component

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}