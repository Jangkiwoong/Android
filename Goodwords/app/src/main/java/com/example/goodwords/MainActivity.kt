package com.example.goodwords

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

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
        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.1")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.2")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.2")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.3")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.4")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.5")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.6")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.7")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.8")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}