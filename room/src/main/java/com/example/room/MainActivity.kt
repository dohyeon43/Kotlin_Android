package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding : ActivityMainBinding
                = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val list = emptyList<Student>()
        val mainAdapter = MainAdapter()

        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        }
        mainAdapter.submitList(list)
    }
}