package com.example.room

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.room.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding
                = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val mainAdapter = MainAdapter()
        val db = StudentDatabase.getInstance(this)

        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        }
        val list = db!!.studentDao().getAll()
        mainAdapter.submitList(list)

        binding.btnSubmit.setOnClickListener(View.OnClickListener {
            db.studentDao().addStudent(
                binding.name.text.toString(),
                binding.grade.text.toString().toInt(),
                binding.classNum.text.toString().toInt(),
                binding.stuNum.text.toString().toInt()
            )
        })

    }
}