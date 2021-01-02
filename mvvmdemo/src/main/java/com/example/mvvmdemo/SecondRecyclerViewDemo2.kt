package com.example.mvvmdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmdemo.adapter.MySelcetionRecyclerAdapter
import com.example.mvvmdemo.databinding.ActivityMainRecyclerviewBinding
import com.example.mvvmdemo.model.Student
import com.google.android.material.snackbar.Snackbar

class SecondRecyclerViewDemo2 : AppCompatActivity() {


    val data: List<Student> = listOf(
        Student(1, "Fowler", 30),
        Student(1, "Beck", 34),
        Student(1, "Evans", 30)
    )

   /* private val listAdapter = MySelcetionRecyclerAdapter(data, data).apply {
        setOnItemClickListener {
            showStudent(currentList[it])
            showStudent(currentList[it])
        }
    }*/

    private val listAdapter = MySelcetionRecyclerAdapter().apply {
        setOnItemClickListener(showStudent(currentList[it]))

    }

    private val binding: ActivityMainRecyclerviewBinding by lazy {
        ActivityMainRecyclerviewBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }


    fun setOnItemClickListener(listener: MySelcetionRecyclerAdapter.OnItemClickListener) {
        onItemClickListener = listener
    }


    private fun showStudent(str: Student) {
        Snackbar.make(binding.root, str.name, Snackbar.LENGTH_SHORT).show()
    }

}