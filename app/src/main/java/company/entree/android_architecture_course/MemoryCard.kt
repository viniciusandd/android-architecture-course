package company.entree.android_architecture_course

import android.util.Log
import javax.inject.Inject

class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}