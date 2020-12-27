package com.example.mvvmdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.model.User

class UserAdapter(private val list: List<User?>?) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_users, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(userViewHolder: UserViewHolder, position: Int) {

        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val userModel: User? = list?.get(position)
        if (userModel != null) {
            userViewHolder.name.setText("Name: " + userModel.name)
            userViewHolder.username.setText("Username: " + userModel.username)
            userViewHolder.email.setText("Email: " + userModel.email)
            userViewHolder.phone.setText("Phone Number: " + userModel.phone)
            userViewHolder.website.setText("Website: " + userModel.website)


            userViewHolder.city.setText("City: " + userModel.address?.city)
            userViewHolder.zipcode.setText("zip code: " + userModel.address?.zipcode)
            userViewHolder.street.setText("Street : " + userModel.address?.street)
            userViewHolder.suite.setText("Suite : " + userModel.address?.suite)
            userViewHolder.lat.setText("Lat: " + userModel.address?.geo?.lat)
            userViewHolder.lng.setText("Lng: " + userModel.address?.geo?.lng)
            userViewHolder.company_name.setText("Company Name: " + userModel.company?.name)
            userViewHolder.company_catchPhrase.setText("Company Catch Phrase: " + userModel.company?.catchPhrase)
            userViewHolder.bs.setText("Business Strategy: " + userModel.company?.bs)
        }

    }





    override fun getItemCount(): Int {
        if (list != null) {
            return list.size
        } else {
            return 0
        }

    }


    // Provide a reference to the views for each data item

    // Provide a reference to the views for each data item
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var username: TextView
        var email: TextView
        var phone: TextView
        var website: TextView
        var street: TextView
        var suite: TextView
        var city: TextView
        var zipcode: TextView
        var lat: TextView
        var lng: TextView
        var company_name: TextView
        var company_catchPhrase: TextView
        var bs: TextView

        // each data item is just a string in this case
        init {
            name = itemView.findViewById(R.id.tv_name)
            username = itemView.findViewById(R.id.tv_username)
            email = itemView.findViewById(R.id.tv_email)
            phone = itemView.findViewById(R.id.tv_phone)
            website = itemView.findViewById(R.id.tv_website)
            street = itemView.findViewById(R.id.tv_street)
            suite = itemView.findViewById(R.id.tv_suite)
            city = itemView.findViewById(R.id.tv_city)
            zipcode = itemView.findViewById(R.id.tv_zipcode)
            lat = itemView.findViewById(R.id.tv_lat)
            lng = itemView.findViewById(R.id.tv_lng)
            company_name = itemView.findViewById(R.id.tv_company_name)
            company_catchPhrase = itemView.findViewById(R.id.tv_company_catchPhrase)
            bs = itemView.findViewById(R.id.tv_bs)
        }
    }

}