package company.entree.android_architecture_course.data.model.character

import com.google.gson.annotations.SerializedName
import company.entree.android_architecture_course.data.model.character.Character

data class CharacterList(
    @SerializedName("results")
    val characters: List<Character>
)