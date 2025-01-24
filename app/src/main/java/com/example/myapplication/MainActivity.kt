package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            // 시스템 바 크기 가져오기
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            // 뷰에 시스템 바 크기만큼 패딩 적용
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // 처리된 insets 반환
            insets

        }
        val image1 = findViewById<ImageView>(R.id.image_1)
        val image2 = findViewById<ImageView>(R.id.image_2)
        val image3 = findViewById<ImageView>(R.id.image_3)
        val image4 = findViewById<ImageView>(R.id.image_4)
        val image5 = findViewById<ImageView>(R.id.image_5)
        val image6 = findViewById<ImageView>(R.id.image_6)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()//토스트 기능

            val intent = Intent(this, ImageActivity2::class.java)
            startActivity(intent) //페이지 전환
        }
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_SHORT).show()//토스트 기능

            val intent = Intent(this, ImageActivity3::class.java)
            startActivity(intent) //페이지 전환
        }
        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_SHORT).show()//토스트 기능

            val intent = Intent(this, ImageActivity4::class.java)
            startActivity(intent) //페이지 전환
        }
        image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_SHORT).show()//토스트 기능

            val intent = Intent(this, ImageActivity5::class.java)
            startActivity(intent) //페이지 전환
        }
        image5.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_SHORT).show()//토스트 기능

            val intent = Intent(this, ImageActivity6::class.java)
            startActivity(intent) //페이지 전환
        }
        image6.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_SHORT).show()//토스트 기능

            val intent = Intent(this, ImageActivity7::class.java)
            startActivity(intent) //페이지 전환
        }
    }
}