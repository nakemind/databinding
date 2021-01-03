package com.example.mvvmdemo

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmdemo.adapter.ActivityMainAdapter
import com.example.mvvmdemo.databinding.ActivityMainRecyclerviewBinding
import com.example.mvvmdemo.model.Person
import com.example.mvvmdemo.model.Student
import com.example.mvvmdemo.passwork.Password
import com.google.android.material.snackbar.Snackbar

class SecondRecyclerViewDemo2 : AppCompatActivity() {


    val data: List<Student> = listOf(
        Student(1, "Fowler", 30),
        Student(1, "Beck", 34),
        Student(1, "Evans", 30)
    )

    private val listAdapter = ActivityMainAdapter().apply {

        setOnItemClickListener { showStudent(currentList[it]) }
        //setOnItemClickListener(showStudent(currentList[it]))
    }

    private val binding: ActivityMainRecyclerviewBinding by lazy {
        ActivityMainRecyclerviewBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupRecyclerView()



    }

    private fun showStudent(str: Student) {
        Snackbar.make(binding.root, str.name, Snackbar.LENGTH_SHORT).show()
    }

    private fun setupRecyclerView() {
        val tamp=binding.rvAnimals.run {
            adapter = listAdapter
            layoutManager = LinearLayoutManager(this@SecondRecyclerViewDemo2)

        }
        binding.btnClickGetPhone.setOnClickListener{
            Toast.makeText(this,"134",Toast.LENGTH_LONG).show()
        }
        //What's the difference between Array<Int> and IntArray?
        val arrayOfInts: Array<Int> = arrayOf(1, 2, 3, 4, 5)

        val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)

        val intArray2 = IntArray(10)
        val arrayOfInts2 = Array<Int>(5) { i -> i * 2 }

        var str :String?=null
        Log.d("","")
        str.let {
            val baby="$it!!!"
            Log.d("","")
        }
        var name:String?="kotlin let nuul chekck"
        name?.let{
            println(it)
        }
        name=null
        name?.let {

        }



        val map : Map<String, String> = mapOf("a" to "akui")
        val config = map["fse"]
// config is a "Config?"
        config?.let {
// This whole block will not be executed if "config" is null.
// Additionally, "it" has now been cast to a "Config" (no
            Log.d("","")
            Log.d("","")

        }


        listAdapter.submitList(data)


        var tutorial = "This is Kotlin Tutorial"
        println(tutorial) //This is Kotlin Tutorial
        tutorial = run {
            val tutorial = "This is run function"
            tutorial
        }
        println(tutorial) //This is run function

        var persion = Person("12","6666")
        with(persion) {
            name="22"
            tutorial="88888"
        }
        val baby=persion.toString()
        Log.d("",persion.toString())
        val babyss=Person("","").apply {
            name="fffff"
            tutorial="english"
        }

        var second=Person("bruce","physic")

        second.apply {
            name="llllllllll"
            tutorial="math"
        }

        val fffsss=second.also {
            val vvv=it.name
            val ppp=it.tutorial
            Log.d("","")
            it.ajust("ppppppppppppp")
        }

        val sdfff=second.let {
            it.ajust("vvvvvvvvvvvvvvvvvvvvvvvvvvvvv")
        }

        val ssdf=with(second) {
           name="heloo"
           tutorial="vvvv"
        }




        Log.d("","")




    }

    fun alphabet()=StringBuilder().apply {  }

}

