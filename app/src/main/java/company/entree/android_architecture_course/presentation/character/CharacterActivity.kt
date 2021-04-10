package company.entree.android_architecture_course.presentation.character

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
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
    private lateinit var adapter: CharacterAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character)

        (application as Injector).createCharacterSubComponent()
            .inject(this)

        characterViewModel = ViewModelProvider(this, factory)
            .get(CharacterViewModel::class.java)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.characterRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = CharacterAdapter()
        binding.characterRecyclerView.adapter = adapter
        displayCharacters()
    }

    private fun displayCharacters() {
        binding.characterProgressBar.visibility = View.VISIBLE
        val responseLiveData: LiveData<List<Character>?> = characterViewModel.getCharacters()
        responseLiveData.observe(this, Observer {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.characterProgressBar.visibility = View.GONE
            } else {
                binding.characterProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext, "No data available", Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.update, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_update -> {
                updateMovies()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun updateMovies() {
        binding.characterProgressBar.visibility = View.VISIBLE
        val response = characterViewModel.updateCharacters()
        response.observe(this, Observer {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.characterProgressBar.visibility = View.GONE
            } else {
                binding.characterProgressBar.visibility = View.GONE
            }
        })
    }
}