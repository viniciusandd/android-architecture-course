package company.entree.android_architecture_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import company.entree.android_architecture_course.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewmodelFactory: MainActivityModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewmodelFactory = MainActivityModelFactory(125)
        viewModel = ViewModelProvider(this, viewmodelFactory).get(MainActivityViewModel::class.java)
        binding.txtTotal.text = viewModel.getTotal().toString()
        binding.btnTotal.setOnClickListener {
            viewModel.setTotal(binding.inputValue.text.toString().toInt())
            binding.txtTotal.text = viewModel.getTotal().toString()
        }
    }
}