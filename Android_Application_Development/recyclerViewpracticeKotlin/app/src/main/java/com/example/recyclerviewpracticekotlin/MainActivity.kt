package com.example.recyclerviewpracticekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//main

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rc=findViewById(R.id.recyclerview) as RecyclerView

        rc.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        val users=ArrayList<User>()

        users.add(User("Sagar","Coco Ichi"))
        users.add(User("Rojina","Chic Fil A"))
        users.add(User("Harry","Mac"))
        users.add(User("Mike","KFC"))
        users.add(User("Brad","Five guys"))

        val ad=DesignAdapter(users)
        rc.adapter=ad

    }
}
