package company.entree.android_architecture_course

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    private var total = 0

    init {
        this.total = startingTotal
    }

    fun getTotal(): Int {
        return this.total
    }

    fun setTotal(input : Int) {
        this.total += input
    }
}