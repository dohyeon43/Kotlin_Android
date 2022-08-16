package com.example.retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding : ActivityMainBinding
                = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //Data Binding

        val list : List<Info> = listOf(
            Info("첫 번째 아이템","첫 번째 내용입니다."),
            Info("두 번째 아이템","두 번째 내용입니다."),
            Info("세 번째 아이템","세 번째 내용입니다."),
            Info("네 번째 아이템","네 번째 내용입니다.")
        )
        //임의로 데이터가 들어있는 리스트를 생성


        val mainAdapter = MainAdapter()
        //Adapter 객체 생성

        binding.recyclerView.apply {
            adapter = mainAdapter//recyclerView에 Adapter를 붙여주고
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)//LayoutManager까지 설정
        }
        mainAdapter.submitList(list)
        //Adapter에 값을 넘겨주는 과정
    }
}