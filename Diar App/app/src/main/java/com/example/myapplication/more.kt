package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class more : AppCompatActivity() {

    private lateinit var moreButton: ImageButton
    private lateinit var homeButton: ImageButton
    private lateinit var memoButton: ImageButton
    private lateinit var backButton: ImageButton
    private lateinit var plusButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.more)
        plusButton= findViewById(R.id.imageView41)
        moreButton = findViewById(R.id.imageButton15)
        homeButton = findViewById(R.id.imageButton14)
        memoButton = findViewById(R.id.imageButton19)
        backButton= findViewById(R.id.imageButton)

        moreButton.setOnClickListener {
            val inten = Intent(applicationContext,profile::class.java)
            startActivity(inten)
        }
        memoButton.setOnClickListener {
            val inten = Intent(applicationContext,memo::class.java)
            startActivity(inten)
        }
        homeButton.setOnClickListener {
            val inten = Intent(applicationContext,home::class.java)
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