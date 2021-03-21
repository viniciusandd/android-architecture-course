package company.entree.android_architecture_course.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import company.entree.android_architecture_course.R
import company.entree.android_architecture_course.databinding.ActivityHomeBinding
import company.entree.android_architecture_course.presentation.character.CharacterActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding.apply {
            buttonCharacter.setOnClickListener {
                val intent = Intent(this@HomeActivity, CharacterActivity::class.java)
                startActivity(intent)
            }
            buttonEpisode.setOnClickListener {
                Toast.makeText(this@HomeActivity, "In construction...", Toast.LENGTH_SHORT).show()
            }
            buttonLocation.setOnClickListener {
                Toast.makeText(this@HomeActivity, "In construction...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}