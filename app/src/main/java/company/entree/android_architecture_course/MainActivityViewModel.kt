package company.entree.android_architecture_course

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCurrentCount(): Int {
        return this.count
    }

    fun getUpdatedCount(): Int {
        return ++this.count
    }
}