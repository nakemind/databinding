package com.example.mvvmdemo.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.databinding.HoursListItemsBinding

class HoursAdapter(private val hourList: List<String>) :
    RecyclerView.Adapter<HoursAdapter.HoursViewHolder>() {


    inner class HoursViewHolder(val binding: HoursListItemsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}