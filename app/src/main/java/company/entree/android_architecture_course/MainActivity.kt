package company.entree.android_architecture_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import company.entree.android_architecture_course.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSend.setOnClickListener {
            this.displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.apply {
            txtGreetings.text = "Hello ${inputPersonName.text}"
        }
    }
}