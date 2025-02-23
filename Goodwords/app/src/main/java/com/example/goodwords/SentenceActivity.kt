package com.example.goodwords

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sentence)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.1")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.2")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.3")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.4")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.5")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.6")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.7")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.8")
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.9")

        val senteceAdapter = ListViewAdapter(sentenceList)

        val listview = findViewById<ListView>(R.id.sentenceListView)
        listview.adapter = senteceAdapter
        listview.setOnItemClickListener {parent, view, position, id ->
            Toast.makeText( this, sentenceList[position], Toast.LENGTH_SHORT).show()
        }
    }
}