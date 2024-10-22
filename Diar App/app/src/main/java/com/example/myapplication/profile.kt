package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class profile : AppCompatActivity() {
    private lateinit var backButton: ImageButton
    private lateinit var plusButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)


        backButton = findViewById(R.id.imageButton11)
        plusButton= findViewById(R.id.imageView41)

        backButton.setOnClickListener {
            val inten = Intent(applicationContext,more::class.java)
            startActivity(inten)
        }
        plusButton.setOnClickListener {
            val inten = Intent(applicationContext,diary_description::class.java)
            startActivity(inten)
        }
    }
}