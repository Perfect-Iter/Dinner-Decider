package com.example.dinnerdecider

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        lateinit var food: String
        binding.button.setOnClickListener {
            var choice: Int = Random.nextInt(0, 6)
            when (choice) {
                0 -> {
                    food = "Chips"
                    //binding.backgroud.setBackgroundColor(Color.BLUE)
                    binding.backgroud.setBackgroundResource(R.drawable.chips)
                    binding.textView.setTextColor(Color.BLACK)

                }
                1 -> {
                    food = "Rice"
                    //binding.backgroud.setBackgroundColor(Color.GREEN)
                    binding.backgroud.setBackgroundResource(R.drawable.rice)
                    binding.textView.setTextColor(Color.BLACK)
                }
                2 -> {
                    food = "Ugali"
                    //binding.backgroud.setBackgroundColor(Color.CYAN)
                    binding.backgroud.setBackgroundResource(R.drawable.ugali)
                    binding.textView.setTextColor(Color.BLACK)
                }
                3 -> {
                    food = "Matoke"
                    //binding.backgroud.setBackgroundColor(Color.MAGENTA)
                    binding.backgroud.setBackgroundResource(R.drawable.matoke)
                    binding.textView.setTextColor(Color.BLACK)
                }
                4 -> {
                    food = "Chapati"
                    //binding.backgroud.setBackgroundColor(Color.BLACK)
                    binding.backgroud.setBackgroundResource(R.drawable.chapati)
                    binding.textView.setTextColor(Color.BLACK)

                }
                5 -> {
                    food = "Pilau"
                    //binding.backgroud.setBackgroundColor(Color.GRAY)
                    binding.backgroud.setBackgroundResource(R.drawable.pilau)
                }
                else -> food = "We could not decide"

            }
            binding.textView.text = food
        }


    }
}