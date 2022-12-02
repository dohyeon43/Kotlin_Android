package com.example.retrofit2

import androidx.recyclerview.widget.DiffUtil

object MainDiffUtil : DiffUtil.ItemCallback<Info>() {
    override fun areItemsTheSame(oldItem: Info, newItem: Info): Boolean
    = oldItem == newItem

    override fun areContentsTheSame(oldItem: Info, newItem: Info): Boolean
    = oldItem == newItem

}