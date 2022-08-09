package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding
                = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val db = StudentDatabase.getInstance(this)
        //DB 객체 생성

        val list = db!!.studentDao().getAll()
        val mainAdapter = MainAdapter()

        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        }
        mainAdapter.submitList(list)



        //Button을 누를 시, DB에 학생 정보를 넣어주는 코드
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