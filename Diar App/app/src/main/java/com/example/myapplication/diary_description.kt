package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class diary_description : AppCompatActivity() {
    private lateinit var savebtn: Button
    private lateinit var backButton: ImageButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diary_description)

        savebtn = findViewById(R.id.button8)
        backButton = findViewById(R.id.imageButton16)

        savebtn.setOnClickListener {
            val inten = Intent(applicationContext,diary_view::class.java)
            startActivity(inten)
        }

        backButton.setOnClickListener {
            val inten = Intent(applicationContext,diary_view::class.java)
            startActivity(inten)
        }
    }
}