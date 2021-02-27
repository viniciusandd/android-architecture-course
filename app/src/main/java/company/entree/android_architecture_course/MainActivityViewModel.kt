package company.entree.android_architecture_course

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        this.userName.value = "Vinicius"
    }
}