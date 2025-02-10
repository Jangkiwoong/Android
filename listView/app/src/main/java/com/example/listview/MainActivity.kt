package com.example.listview

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
         }
        val list_item = mutableListOf<ListViewModel>()
        list_item.add(ListViewModel("a","b"))
        list_item.add(ListViewModel("c","d"))
        list_item.add(ListViewModel("e","f"))

        val listView = findViewById<ListView>(R.id.mainlistview)
        val listAdapter = ListViewAdapter(list_item)
        listView.adapter = listAdapter

        //뒤로가기 종료
        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
    }
    //뒤로가기 종료 기능
    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            Log.d("MainActivity", "backbutton_Start")
            if (System.currentTimeMillis() - backPressedTime <= 2000) {
                Log.d("MainActivity", "backbutton_Stop")
                finish()
            } else {
                Log.d("MainActivity", "backbutton_OneClick")
                backPressedTime = System.currentTimeMillis()
                Toast.makeText(this@MainActivity, "한 번 더 누르면 종료합니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}