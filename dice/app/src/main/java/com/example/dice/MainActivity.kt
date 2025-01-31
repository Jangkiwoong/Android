package com.example.dice

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위가 돌아갑니다.", Toast.LENGTH_SHORT).show()

            val number1 = Random.nextInt(1, 6)
            val number2 = Random.nextInt(1, 6)

            Log.d("MainActivity", number1.toString())
            Log.d("MainActivity", number2.toString())
            if(number1 == 1) {
                binding.dummy1.setImageResource(R.drawable.dummy1)
            } else if(number1 == 2){
                binding.dummy1.setImageResource(R.drawable.dummy2)
            } else if(number1 == 3 ){
                binding.dummy1.setImageResource(R.drawable.dummy3)
            } else if(number1 == 4){
                binding.dummy1.setImageResource(R.drawable.dummy4)
            } else if(number1 ==5){
                binding.dummy1.setImageResource(R.drawable.dummy5)
            } else if(number1 ==6){
                binding.dummy1.setImageResource(R.drawable.dummy6)
            }
            if(number2 == 1) {
                binding.dummy2.setImageResource(R.drawable.dummy1)
            } else if(number2 == 2){
                binding.dummy2.setImageResource(R.drawable.dummy2)
            } else if(number2 == 3 ){
                binding.dummy2.setImageResource(R.drawable.dummy3)
            } else if(number2 == 4){
                binding.dummy2.setImageResource(R.drawable.dummy4)
            } else if(number2 ==5){
                binding.dummy2.setImageResource(R.drawable.dummy5)
            } else if(number2 ==6){
                binding.dummy2.setImageResource(R.drawable.dummy6)
            }
        }
    }
}