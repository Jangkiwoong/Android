package com.example.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Second_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_, container, false)
        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            it.findNavController().navigate(R.id.action_second_Fragment_to_first_fragment)
        }
        view.findViewById<Button>(R.id.btn3).setOnClickListener {
            it.findNavController().navigate(R.id.action_second_Fragment_to_third_Fragment)
        }
        return view
    }
}