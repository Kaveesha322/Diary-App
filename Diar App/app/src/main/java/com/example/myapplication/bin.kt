package com.example.myapplication;
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class bin : AppCompatActivity() {
    private lateinit var backButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bin)

        backButton = findViewById(R.id.imageButton16)


        backButton.setOnClickListener {
            val inten = Intent(applicationContext, home::class.java)
            startActivity(inten)
        }
    }
}

