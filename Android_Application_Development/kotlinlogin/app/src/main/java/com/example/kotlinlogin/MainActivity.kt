package com.example.kotlinlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1:Button=findViewById(R.id.button1)

        val b2:Button=findViewById(R.id.button2)


        b1.setOnClickListener {

            val intent= Intent(this,register::class.java)
            startActivity(intent)
        }


        b2.setOnClickListener {

            val intent= Intent(this,sigin::class.java)
            startActivity(intent)
        }






    }
}
