package com.example.kotlinlogin

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

public class DBhelper(

    context: Context?,
    name: String?="Login.db",
    factory: SQLiteDatabase.CursorFactory?=null,
    version: Int=1
) : SQLiteOpenHelper(context, name, factory, version)


{




    override fun onCreate(createdDB: SQLiteDatabase) {

       createdDB.execSQL("create Table logInout(username Text primary key,password Text)")



    }

    override fun onUpgrade(createdDB: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

        createdDB.execSQL("drop Table if exists logInout")



    }

    public fun Inserdata(username:String,password:String):Boolean
    {
        val database=this.writableDatabase

         val cv= ContentValues()

        cv.put("username",username)
        cv.put("password", password)

        val result=database.insert("logInout",null,cv)

        return result.toInt()==-1



    }

    fun checkusername(username: String):Boolean
    {
        val database=this.writableDatabase

        val q1="select * from logInout where username=?"
        val x= mutableListOf<String>()

        val cursor=database.rawQuery(q1, arrayOf(username))

        return cursor.count>0
    }


    fun checkusernameandpasswoerd(username: String,password: String):Boolean
    {
        val database=this.writableDatabase

        val q1="select * from logInout where username=? and password=?"

        val cursor=database.rawQuery(q1, arrayOf(username,password))

        return cursor.count>0
    }








}