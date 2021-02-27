package company.entree.android_architecture_course

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        this.count.value = 0
    }

    fun updatedCount() {
        this.count.value = (this.count.value)?.plus(1)
    }
}