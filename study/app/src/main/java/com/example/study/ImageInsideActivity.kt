package com.example.study

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_inside)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val getData = intent.getStringExtra("data")
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)
        Toast.makeText(this, getData, Toast.LENGTH_SHORT).show()

        if(getData == "1") {
            memberImage.setImageResource(R.drawable.dummy1)
        }
        if(getData == "2") {
            memberImage.setImageResource(R.drawable.dummy2)
        }
        if(getData == "3") {
            memberImage.setImageResource(R.drawable.dummy3)
        }
        if(getData == "4") {
            memberImage.setImageResource(R.drawable.dummy4)
        }
        if(getData == "5") {
            memberImage.setImageResource(R.drawable.dummy5)
        }
        if(getData == "6") {
            memberImage.setImageResource(R.drawable.dummy6)
        }
        if(getData == "7") {
            memberImage.setImageResource(R.drawable.dummy7)
        }
        if(getData == "8") {
            memberImage.setImageResource(R.drawable.dummy8)
        }
        if(getData == "9") {
            memberImage.setImageResource(R.drawable.dummy9)
        }
    }
}