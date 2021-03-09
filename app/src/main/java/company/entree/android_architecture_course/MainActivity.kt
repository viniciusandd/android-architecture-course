package company.entree.android_architecture_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_count.setOnClickListener {
            text_count.text = this.count++.toString()
        }

        btn_download_user_data.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                this@MainActivity.downloadUserData()
            }
        }
    }

    private fun downloadUserData() {
        for (i in 1..200000) {
            Log.i("[DOWNLOAD]", "Dowloading user $i in ${Thread.currentThread().name}")
        }
    }
}