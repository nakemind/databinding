package com.example.mvvmdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.adapter.MyRecyclerViewAdapter
import com.example.mvvmdemo.databinding.ActivityMainRecyclerviewBinding


class RecyclerViewDemoList : AppCompatActivity() {
    private var binding: ActivityMainRecyclerviewBinding? = null
    var adapter: MyRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        val jjjs=Client("2222",123)
        val ffss=jjjs.toString()
        jjjs.toString()
        Log.d("", jjjs.toString())
        super.onCreate(savedInstanceState)
        println("helo,effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffork")

        val animalNames: ArrayList<String> = ArrayList()
        animalNames.add("Horse")
        animalNames.add("Cow")
        animalNames.add("Camel")
        animalNames.add("Sheep")
        animalNames.add("Goat")
        //setContentView(R.layout.activity_main_recyclerview)
        binding = ActivityMainRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding?.rvAnimals?.layoutManager= LinearLayoutManager(this)
        adapter = MyRecyclerViewAdapter(this, animalNames)
        binding?.rvAnimals?.adapter = adapter

        val jjj=max(12,34)
        Log.d("",alphabet())
        val fser=alphabet()

        Log.d("","")


        val ffs=alphabet2()
        Log.d("","")


        /*val recyclerView = binding?.rvAnimals;//findViewById<RecyclerView>(R.id.rvAnimals)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        adapter = MyRecyclerViewAdapter(this, animalNames)
        recyclerView?.adapter = adapter*/


    }

    fun max(a:Int,b:Int):Int {
        return if(a>b)a else b
    }


    fun alphabet():String {
        val result =StringBuilder()
        for(letter in 'A'..'Z'){
            result.append(letter)
        }
        result.append("\n now i konw the alphabet!")
        return result.toString()
    }

    fun alphabet2():String{

        val stringBuilder  = java.lang.StringBuilder()
        return with(stringBuilder) {
            for(letter in 'A'..'Z'){
                append(letter)
            }
            append("\nnow i konw this letter")
            toString()
        }
    }
}