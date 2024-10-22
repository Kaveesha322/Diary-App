package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    private lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        loginButton = findViewById(R.id.buttonLogin)





        loginButton.setOnClickListener {
            val inten = Intent(applicationContext,home::class.java)
            startActivity(inten)
        }
    }
}