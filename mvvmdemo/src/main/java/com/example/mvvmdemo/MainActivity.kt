package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmdemo.adapter.UserAdapter
import com.example.mvvmdemo.databinding.ActivityMainBinding
import com.example.mvvmdemo.model.UserResponse
import com.example.mvvmdemo.repository.UserRepository
import com.example.mvvmdemo.util.NetworkStatus
import com.example.mvvmdemo.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private var userViewModel: UserViewModel? = null
    private var binding: ActivityMainBinding? = null
    private var adapter: UserAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.root
        setContentView(view)
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        binding!!.recyclerview.setHasFixedSize(true)
        binding!!.recyclerview.layoutManager = LinearLayoutManager(this)
        val isConnected = NetworkStatus.isDeviceConnected(this)
        if (isConnected) {
            //load_data()
        } else {
            binding!!.progressBar.visibility = View.GONE
            Toast.makeText(this, "Device offline", Toast.LENGTH_LONG).show()
        }

        val ff = UserRepository();
        ff.users
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        userViewModel?.listUsers?.observe(this, Observer {userResponse: UserResponse ->
            binding!!.progressBar.visibility = View.GONE
            if (userResponse.error!= null) {
                binding!!.progressBar.visibility = View.GONE
                showError("There was an error while processing your request " + userResponse?.error!!.message)
            }
            if (userResponse.userList?.size!! >= 1) {
                try {
                    adapter = UserAdapter(userResponse.userList)
                    binding!!.recyclerview.adapter = adapter
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        })

    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}