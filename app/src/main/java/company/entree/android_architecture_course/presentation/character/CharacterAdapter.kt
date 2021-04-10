package company.entree.android_architecture_course.presentation.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import company.entree.android_architecture_course.R
import company.entree.android_architecture_course.data.model.character.Character
import company.entree.android_architecture_course.databinding.ListItemBinding

class CharacterAdapter : RecyclerView.Adapter<MyViewHolder>() {
    private val charactersList = ArrayList<Character>()

    fun setList(characters: List<Character>) {
        charactersList.clear()
        charactersList.addAll(characters)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(charactersList[position])
    }

    override fun getItemCount(): Int {
        return charactersList.size
    }
}

class MyViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(character: Character) {
        binding.nameTextView.text = character.name
        binding.speciesTextView.text = character.species
        Glide.with(binding.imageView.context).load(character.image).into(binding.imageView)
    }
}