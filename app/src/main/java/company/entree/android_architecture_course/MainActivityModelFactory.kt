package company.entree.android_architecture_course

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}