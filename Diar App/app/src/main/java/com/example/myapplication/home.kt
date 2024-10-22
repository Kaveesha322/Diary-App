package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView


class home : AppCompatActivity() {

    private lateinit var moreButton: ImageButton
    private lateinit var binButton: ImageButton
    private lateinit var recentButton: ImageButton
    private lateinit var diaryButton: ImageButton
    private lateinit var backButton: ImageButton
    private lateinit var plusButton: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        diaryButton  = findViewById(R.id.imageButton6)
        moreButton  = findViewById(R.id.imageButton9)
        binButton  = findViewById(R.id.imageButton12)
        plusButton= findViewById(R.id.imageView41)




        diaryButton.setOnClickListener {
            val inten = Intent(applicationContext,diary_view::class.java)
            startActivity(inten)
        }

        moreButton.setOnClickListener {
            val inten = Intent(applicationContext,more::class.java)
            startActivity(inten)
        }
        binButton.setOnClickListener {
            val inten = Intent(applicationContext,bin::class.java)
            startActivity(inten)
        }

        plusButton.setOnClickListener {
            val inten = Intent(applicationContext,diary_description::class.java)
            startActivity(inten)
        }

    }
}