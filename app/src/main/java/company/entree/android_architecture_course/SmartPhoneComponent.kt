package company.entree.android_architecture_course

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}