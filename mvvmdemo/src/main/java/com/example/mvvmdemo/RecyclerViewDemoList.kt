package com.example.mvvmdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.adapter.MyRecyclerViewAdapter
import com.example.mvvmdemo.databinding.ActivityMainRecyclerviewBinding
import java.util.*
import kotlin.collections.ArrayList


class RecyclerViewDemoList : AppCompatActivity() {
    private var binding: ActivityMainRecyclerviewBinding? = null
    var adapter: MyRecyclerViewAdapter? = null
    val binaryReps =TreeMap<Char,String>()


    fun foo (s:String) {
        val t:String =s?:"";
        Log.d("","")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
val vsdfd=foo("fuuu")

         print("\r\n\r\n")
        for (c in 'A'..'Z') {
            val binrary =Integer.toBinaryString(c.toInt())
            binaryReps[c]=binrary
        }

        for ((letter,binary) in binaryReps) {
            println("$letter=$binary")
        }
        print("\r\n\r\n")


        val color = CardType2.SILVER.color
        for(i in 1..100 step 3){
            print(fizzBuzz(i))
        }


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

        val name="fasdfd"
        val vwer="fadsfdsaf+$name"
        Log.d("","")
        val rectangle=Rectangle(41,43)
        val valuesss=rectangle.isSquare
        Log.d("","")

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

    fun getMnemonic(color:Color)=
        when(color) {
            Color.RED->"richard"
            Color.ORANGE->"of"
            Color.YELLOW->"york"
            Color.GREEN->""
            Color.BLUE->""
            Color.INDIGO->""
            Color.VIOLET->""
        }

    fun fizzBuzz(i:Int)=when{
        i%15==0->"$i "
        /*i%15==0->"fizzbuzz"
        i%3==0->"fizz"
        i%5==0->"buzz"
        else->"$i"*/
        else -> "$i "
    }
}