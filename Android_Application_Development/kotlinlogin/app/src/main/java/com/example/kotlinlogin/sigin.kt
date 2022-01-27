package com.example.kotlinlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class sigin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigin)

        val userN: EditText =findViewById(R.id.username)
        val pass: EditText =findViewById(R.id.password)
        val logIn: Button =findViewById(R.id.login)

        val database=DBhelper(this)



        logIn.setOnClickListener {

            val Suseredit=userN.text.toString()
            val Spassedit=pass.text.toString()

            if(database.checkusernameandpasswoerd(Suseredit,Spassedit))
            {
                Toast.makeText(this.baseContext,"Login successful !", Toast.LENGTH_LONG).show()

                val intent= Intent(this,home::class.java)
                startActivity(intent)

            }

            else
            {
                Toast.makeText(this.baseContext,"Login Denied !", Toast.LENGTH_LONG).show()

            }
        }
    }
}
