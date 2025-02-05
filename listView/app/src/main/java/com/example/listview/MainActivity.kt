package com.example.listview

import android.os.Bundle
import android.widget.ListView
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
    }
}