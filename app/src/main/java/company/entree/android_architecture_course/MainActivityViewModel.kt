package company.entree.android_architecture_course

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()
    val countData: LiveData<Int>
        get() = count

    init {
        this.count.value = 0
    }

    fun updatedCount() {
        this.count.value = (this.count.value)?.plus(1)
    }
}