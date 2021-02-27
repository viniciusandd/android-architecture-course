package company.entree.android_architecture_course

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    private var total = MutableLiveData<Int>()

    val totalData: LiveData<Int>
        get() = this.total

    init {
        this.total.value = startingTotal
    }

    fun setTotal(input : Int) {
        this.total.value  = (total.value)?.plus(input)
    }
}