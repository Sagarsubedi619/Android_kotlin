package com.example.kotlinlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Ruserame: EditText =findViewById(R.id.Rusername)
        val Rpass: EditText =findViewById(R.id.Rpassword)
        val Rcpass:EditText=findViewById(R.id.RCpassword)
        val register:Button=findViewById(R.id.register)




        register.setOnClickListener {
            val userEdit=Ruserame.text.toString()
            val passEdit=Rpass.text.toString()
            val rcpassEdit=Rcpass.text.toString()

            val database=DBhelper(this)

            if(userEdit==""||passEdit==""||rcpassEdit==""){


                Toast.makeText(this.baseContext,"All fields needs to be filled",Toast.LENGTH_LONG).show()
            }

            else
            {
                if(passEdit==rcpassEdit)

                {


                    val res=database.checkusername(userEdit)
                    if(res)
                    {
                        Toast.makeText(this.baseContext,"user already exists proceed to sign in !",Toast.LENGTH_LONG).show()

                    }
                    else {
                        val result = database.Inserdata(userEdit, passEdit)

                        if (result) {

                            Toast.makeText(
                                this.baseContext,
                                "Registration denied !",
                                Toast.LENGTH_LONG
                            ).show()

                        } else {
                            Toast.makeText(
                                this.baseContext,
                                "Registration.. success..",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }



                }

                else
                {
                    Toast.makeText(this.baseContext,"password do not match.. please try again",Toast.LENGTH_LONG).show()

                }
            }



        }
    }
}
