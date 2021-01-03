package com.example.mvvmdemo.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.FragmentBlankBinding

class BindFragment :Fragment(R.layout.fragment_blank){

    private var fragemntBlankBinding :FragmentBlankBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding =FragmentBlankBinding.bind(view)
        fragemntBlankBinding=binding
        binding.textViewFragment.text="helo from binding inflatgramgnet"
    }

    override fun onDestroy() {
        fragemntBlankBinding=null
        super.onDestroy()
    }
}