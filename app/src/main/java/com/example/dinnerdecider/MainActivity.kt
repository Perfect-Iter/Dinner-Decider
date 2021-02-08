package com.example.dinnerdecider

import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var lastChoice: SharedPreferences

    lateinit var editChoice: SharedPreferences.Editor

    var choice: Int = 0
    var loadChoice: Int = 0
    lateinit var food: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        lastChoice = applicationContext.getSharedPreferences("choice", MODE_PRIVATE)

        editChoice = lastChoice.edit()



        binding.button.setOnClickListener {
            choice =Random.nextInt(0, 6)
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

    override fun onStart() {
        super.onStart()
        retrieveData()
    }

    override fun onRestart(){
        super.onRestart()
        retrieveData()
    }
    override fun onStop() {
        super.onStop()
        saveData()
    }


    fun saveData(){
        editChoice.putInt("kchoice", choice)
        editChoice.commit()
    }
    fun retrieveData(){
        loadChoice = lastChoice.getInt("kchoice", 0)

        selectFood(loadChoice)


    }

    fun selectFood(opt: Int){
        when (loadChoice) {
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