package company.entree.android_architecture_course.presentation.character

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import company.entree.android_architecture_course.R
import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.databinding.ActivityCharacterBinding
import company.entree.android_architecture_course.presentation.di.Injector
import javax.inject.Inject

class CharacterActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: CharacterViewModelFactory
    private lateinit var characterViewModel: CharacterViewModel
    private lateinit var binding: ActivityCharacterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character)

        (application as Injector).createCharacterSubComponent()
            .inject(this)

        characterViewModel = ViewModelProvider(this, factory)
            .get(CharacterViewModel::class.java)

        val responseLiveData: LiveData<List<Character>?> = characterViewModel.getCharacters()
        responseLiveData.observe(this, Observer {
            Log.i("MYTAG", it.toString())
        })
    }
}