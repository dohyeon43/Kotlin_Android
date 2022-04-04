package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.ItemMainBinding

class MainActivity : AppCompatActivity() {

    var TAG: String = "로그"
    val datas = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        for (i in 1..10){
            datas.add("item $i")
        }
        //Adapter : 뷰홀더에 구성된 레이아웃에 알맞은 값을 넣어주는 역할
//getItemCount, onCreaterViewHolder, onBindViewHolder 의 3개 함수가 필수로 들어간다.
        class MyAdapter(val binding: ItemMainBinding): RecyclerView.Adapter<RecyclerView.ViewHolder>()
        {
            override fun getItemCount(): Int = datas.size

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = MyViewHolder(
                ItemMainBinding.inflate(LayoutInflater.from(parent.context),parent, false))

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                val binding = (holder as MyViewHolder).binding

                binding.itemData.text = datas[position]

                binding.itemRoot.setOnClickListener {
                    binding.itemData.text="눌러짐"
                }
            }
        }
        binding.recyclerView.adapter = MyAdapter(datas)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))
    }
    //View Holder
    class MyViewHolder(val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root)
}