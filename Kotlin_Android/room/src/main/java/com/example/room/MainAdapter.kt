package com.example.room

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.room.databinding.ItemMainBinding

class MainAdapter: ListAdapter<Student, MainAdapter.MainViewHolder>(MainDiffUtil) {


    inner class MainViewHolder (val binding : ItemMainBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Student){
            binding.item = data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_main,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        return holder.bind(getItem(position))
    }
}