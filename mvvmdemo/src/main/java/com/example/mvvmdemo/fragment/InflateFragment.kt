package com.example.mvvmdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvmdemo.databinding.FragmentBlankBinding

class InflateFragment: Fragment(){

    private var fragmentBlankBinding :FragmentBlankBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding=FragmentBlankBinding.inflate(inflater,container,false)
        fragmentBlankBinding =binding
        binding.textViewFragment.text="hello from view binding (BindFragment)"
        return binding.root

        //return super.onCreateView(inflater, container, savedInstanceState)
    }


}