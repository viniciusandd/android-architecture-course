package company.entree.android_architecture_course

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import company.entree.android_architecture_course.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val fruitsList = listOf(
        Fruit("Mango", "Tom"),
        Fruit("Apple", "Joe"),
        Fruit("Banana", "Mark"),
        Fruit("Guava", "Mike"),
        Fruit("Lemon", "Mike"),
        Fruit("Pear", "Frank"),
        Fruit("Orange", "Joe")
    )
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            myRecyclerView.setBackgroundColor(Color.YELLOW)
            myRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            myRecyclerView.adapter = MyRecyclerViewAdapter(
                this@MainActivity.fruitsList
            ) { selectedFruitItem: Fruit -> listItemClicked(selectedFruitItem) }
        }
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this,
            "Supplier name is ${fruit.supplier}", Toast.LENGTH_SHORT).show()
    }
}