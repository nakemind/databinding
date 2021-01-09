package com.example.mvvmdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvmdemo.databinding.ActivityDataBindingDemo1Binding
import com.example.mvvmdemo.databinding.ViewModelActivity

class DatabindActivityDemo : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vv:String?
        vv=null
        val fsdfadsfasd=vv?.length
        val ffffs=vv?.length?:"444"

        val fsdfdf:String?
        fsdfdf=null
        val fadssfasdfdsarewr= fsdfdf?.length


        val bind: ActivityDataBindingDemo1Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_data_binding_demo1);

        bind.observableFieldsActivityButton.setOnClickListener{

        }
        bind.viewmodelActivityButton.setOnClickListener {
            startActivity(Intent(this,ViewModelActivity::class.java))

        }
    }

}