package com.example.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Second_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_, container, false)

        val items = mutableListOf<String>()
        items.add("a노래")
        items.add("b노래")
        items.add("c노래")
        items.add("d노래")
        items.add("e노래")
        items.add("f노래")
        items.add("g노래")
        items.add("h노래")
        items.add("i노래")
        items.add("j노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")
        items.add("k노래")

        val rv = view.findViewById<RecyclerView>(R.id.rv_second)
        val rvAdapter = RvAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        rvAdapter.itemClick = object : RvAdapter.ItemClick {
            override  fun onClick(view: View, position: Int){
                Toast.makeText(context, items[position], Toast.LENGTH_SHORT).show()
            }
        }
        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            it.findNavController().navigate(R.id.action_second_Fragment_to_first_fragment)
        }
        view.findViewById<Button>(R.id.btn3).setOnClickListener {
            it.findNavController().navigate(R.id.action_second_Fragment_to_third_Fragment)
        }
        return view
    }
}