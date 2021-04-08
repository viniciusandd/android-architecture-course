package company.entree.android_architecture_course

import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}