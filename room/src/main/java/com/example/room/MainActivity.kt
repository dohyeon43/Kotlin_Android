package com.example.room

import android.os.Bundle
import android.util.Log
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
        val list : List<Student> = db!!.studentDao().getAll() ?: emptyList()
        Log.e("TEST",list.toString())
        mainAdapter.submitList(list)

        binding.btnSubmit.setOnClickListener(View.OnClickListener {
            db.studentDao().addStudent(
                binding.name.text.toString(),
                binding.grade.text.toString(),
                binding.classNum.text.toString(),
                binding.stuNum.text.toString()
            )
            Log.e("TEST","정상적으로 데이터베이스에 값 들어감")
        })

    }
}