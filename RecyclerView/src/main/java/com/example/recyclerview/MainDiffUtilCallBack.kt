package com.example.recyclerview

import androidx.recyclerview.widget.DiffUtil

object MainDiffUtilCallBack : DiffUtil.ItemCallback<Info>() {
    override fun areItemsTheSame(oldItem: Info, newItem: Info): Boolean
    = oldItem == newItem

    override fun areContentsTheSame(oldItem: Info, newItem: Info): Boolean
    = oldItem == newItem
}