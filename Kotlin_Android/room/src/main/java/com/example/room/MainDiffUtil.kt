package com.example.room

import androidx.recyclerview.widget.DiffUtil

object MainDiffUtil : DiffUtil.ItemCallback<Student>() {
    override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean
    = oldItem == newItem

    override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean
    = oldItem == newItem
}