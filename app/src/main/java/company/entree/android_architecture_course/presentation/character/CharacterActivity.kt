package company.entree.android_architecture_course.presentation.character

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import company.entree.android_architecture_course.R
import company.entree.android_architecture_course.databinding.ActivityCharacterBinding

class CharacterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCharacterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character)
    }
}