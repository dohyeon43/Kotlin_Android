package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.ItemMainBinding

class MainAdapter(data : List<Info>) : ListAdapter<Info, MainAdapter.MainViewHolder>(MainDiffUtilCallBack) {
    inner class MainViewHolder (val binding : ItemMainBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Info){
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