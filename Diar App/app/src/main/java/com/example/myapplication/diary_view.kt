package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class diary_view : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var backButton: ImageButton
    private lateinit var plusButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diary_view)

        button = findViewById(R.id.button)
        backButton = findViewById(R.id.imageButton16)
        plusButton= findViewById(R.id.imageView41)


        button.setOnClickListener {
            val inten = Intent(applicationContext,diary_description::class.java)
            startActivity(inten)
        }

        backButton.setOnClickListener {
            val inten = Intent(applicationContext,home::class.java)
            startActivity(inten)
        }
        plusButton.setOnClickListener {
            val inten = Intent(applicationContext,diary_description::class.java)
            startActivity(inten)
        }
    }
}