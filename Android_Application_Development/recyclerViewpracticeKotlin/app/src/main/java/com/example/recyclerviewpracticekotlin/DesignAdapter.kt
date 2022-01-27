package com.example.recyclerviewpracticekotlin

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//adapter

class DesignAdapter (val userList:ArrayList<User>):RecyclerView.Adapter<DesignAdapter.ViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.cards,parent,false)

        return ViewHolder(v)
    }





    override fun getItemCount(): Int {
        return userList.size
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


     val user:User=userList[position]
        holder.tName.text=user.name
        holder.tRestaurant.text=user.restaurant


    }

    class ViewHolder(iView:View):RecyclerView.ViewHolder(iView)
    {
        val tName=iView.findViewById(R.id.name) as TextView
        val tRestaurant=iView.findViewById(R.id.restaurant) as TextView

    }

}

