package com.example.mvvmdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.adapter.MyRecyclerViewAdapter
import com.example.mvvmdemo.databinding.ActivityMainRecyclerviewBinding


class RecyclerViewDemoList : AppCompatActivity() {
    private var binding: ActivityMainRecyclerviewBinding? = null
    var adapter: MyRecyclerViewAdapter? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recyclerview)
        binding = ActivityMainRecyclerviewBinding.inflate(layoutInflater)
        binding?.rvAnimals?.layoutManager= LinearLayoutManager(this)

        // data to populate the RecyclerView with
        // data to populate the RecyclerView with
        val animalNames: ArrayList<String> = ArrayList()
        animalNames.add("Horse")
        animalNames.add("Cow")
        animalNames.add("Camel")
        animalNames.add("Sheep")
        animalNames.add("Goat")
        //adapter = MyRecyclerViewAdapter(this, animalNames)
        //binding!!.rvAnimals.adapter =adapter
/*        adapter2 = MyRecyclerViewAdapter(this, animalNames)

        binding!!.rvAnimals.adapter =adapter2*/




        // set up the RecyclerView

        // set up the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvAnimals)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MyRecyclerViewAdapter(this, animalNames)
        recyclerView.adapter = adapter


    }

}