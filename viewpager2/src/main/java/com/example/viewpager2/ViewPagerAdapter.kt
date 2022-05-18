package com.example.viewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2.databinding.FragmentViewBinding

class VIewPagerAdapter : ListAdapter<profile.Profile, VIewPagerAdapter.MainItemViewHolder>(MainListDiffCallback) {
    private lateinit var binding: FragmentViewBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainItemViewHolder {
        binding = FragmentViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class MainItemViewHolder(private val binding: MainItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Profile) {
            binding.image.setImageResource(item.image)
            binding.name.text = item.name
            binding.favorite.text = item.favorite
        }
    }

    object MainListDiffCallback : DiffUtil.ItemCallback<Profile>() {
        override fun areItemsTheSame(oldItem: Profile, newItem: Profile): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Profile, newItem: Profile): Boolean {
            return oldItem.name == newItem.name
        }

    }
} {
}