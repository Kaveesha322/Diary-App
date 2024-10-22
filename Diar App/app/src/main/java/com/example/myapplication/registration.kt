package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registration : AppCompatActivity() {

    private lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)

        signupButton = findViewById(R.id.button2)





        signupButton.setOnClickListener {
            val inten = Intent(applicationContext,login::class.java)
            startActivity(inten)
        }

    }
}