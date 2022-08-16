package com.example.retrofit2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemMainBinding

class MainAdapter: ListAdapter<Info, MainAdapter.MainViewHolder>(MainDiffUtil) {


    inner class MainViewHolder (val binding : ItemMainBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Info){
            binding.item = data
            //아이템에 값을 bind(연결)해주는 함수
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),//Inflater
                R.layout.item_main,//Layout Id
                parent,//Parent ViewGroup
                false//attachToParent 값
            )
        )
        //ViewHolder를에 설정값을 넣어주고 return해주는 함수
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        return holder.bind(getItem(position))
        //직접적으로 bind()를 이용해 값을 넣어주는 함수
    }
}