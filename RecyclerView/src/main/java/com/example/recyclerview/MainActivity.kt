package com.example.recyclerview

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

        val list : List<Info> = listOf(
            Info("첫 번째 아이템","첫 번째 내용입니다."),
            Info("두 번째 아이템","두 번째 내용입니다."),
            Info("세 번째 아이템","세 번째 내용입니다."),
            Info("네 번째 아이템","네 번째 내용입니다.")
        )
        val mainAdapter = MainAdapter()
        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        }
        mainAdapter.submitList(list)
    }
}