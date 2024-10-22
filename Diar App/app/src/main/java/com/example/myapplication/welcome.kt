package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class welcome : AppCompatActivity() {

    private lateinit var startButton: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        startButton = findViewById(R.id.imageButton8)


        startButton.setOnClickListener {
            val inten = Intent(applicationContext,registration::class.java)
            startActivity(inten)
        }
    }
}