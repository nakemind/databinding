package com.example.mvvmdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.get
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.RecyclerviewRowBinding
import com.example.mvvmdemo.model.Student

val StudentDiffCallback = object: DiffUtil.ItemCallback<Student>() {
    override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean =
        oldItem == newItem

}
class MySelcetionRecyclerAdapter :
    ListAdapter<Student,MySelcetionRecyclerAdapter.ViewHoler>(StudentDiffCallback) {

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
        TODO("Not yet implemented")
        val layoutInflater =LayoutInflater.from(parent.context)
        val binding =RecyclerviewRowBinding.inflate(layoutInflater)
        return ViewHoler(binding)

    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        TODO("Not yet implemented")
        val student=currentList[position]
        holder.bind(student)
    }
/*
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        data.size
    }

    inner class ViewHoler(val bingitem: RecyclerviewRowBinding) :
        RecyclerView.ViewHolder(bingitem.root) {
        var name: TextView

        init {
            name = itemView.findViewById(R.id.tvAnimalName)
        }

        fun bind(str: String) {
            bingitem.run {
                tvAnimalName.text = str
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        TODO("Not yet implemented")
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewRowBinding.inflate(layoutInflater, parent, false)
        return ViewHoler(binding)

    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        TODO("Not yet implemented")
        val animal = data.get(position)
        //holder.name.text=animal
        holder.bind(animal)
    }

    fun interface OnItemClickListener {
        fun onItemClick(position: Int)
    }*/
}