package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class memo : AppCompatActivity() {
    private lateinit var backButton: ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.memo)


        backButton = findViewById(R.id.imageButton22)

        backButton.setOnClickListener {
            val inten = Intent(applicationContext,more::class.java)
            startActivity(inten)
        }


    }
}