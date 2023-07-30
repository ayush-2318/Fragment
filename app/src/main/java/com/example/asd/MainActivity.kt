package com.example.asd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.asd.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.btn1

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.Flfrag,firstFragment)

            commit()
        }
        binding.btn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Flfrag,firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        binding.btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Flfrag,secondFragment)
                addToBackStack(null)
                commit()
            }
        }





    }
}