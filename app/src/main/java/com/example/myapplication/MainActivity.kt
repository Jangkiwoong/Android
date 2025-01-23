package com.example.myapplication

import android.os.Bundle
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
            image1.setOnClickListener {
                Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()
            }
    }
}