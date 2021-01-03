package com.example.mvvmdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.RecyclerviewRowBinding
import com.example.mvvmdemo.model.Student

val StudentDiffCallback = object : DiffUtil.ItemCallback<Student>() {
    override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean =
        oldItem == newItem

}

class ActivityMainAdapter :
    ListAdapter<Student, ActivityMainAdapter.ViewHoler>(StudentDiffCallback) {
    private var onItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    inner class ViewHoler(val bingitem: RecyclerviewRowBinding) :
        RecyclerView.ViewHolder(bingitem.root) {
        var name: TextView

        init {
            name = itemView.findViewById(R.id.tvAnimalName)
        }

        fun bind(str: Student) {
            bingitem.run {
                tvAnimalName.text = str.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewRowBinding.inflate(layoutInflater)
        return ViewHoler(binding)

    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        val student = currentList[position]
        holder.bind(student)
    }

    fun interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}