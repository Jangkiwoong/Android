package com.example.databinding_ex

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databinding_ex.databinding.ActivityMainBinding

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
        val value = "여기는 value입니다."
        val value2 = "여기는 value2입니다!!"

        Log.w("MainActivity", value)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //기존의 findViewById방식
        val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }
        //새로운 DataBinding방식
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }
    }
}