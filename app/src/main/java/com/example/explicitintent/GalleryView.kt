package com.example.explicitintent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton

class GalleryView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galleryview)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backButton = findViewById<Button>(R.id.btnback)
        backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

            val btnj1 = findViewById<ImageButton>(R.id.btnj1)
            btnj1.setOnClickListener {
                //open a new activity
                intent= Intent(this, j1::class.java)
                startActivity(intent)
            }

           val btnj2 = findViewById<ImageButton>(R.id.btnj2)
        btnj2.setOnClickListener {
            //open a new activity
            intent= Intent(this, j2::class.java)
            startActivity(intent)
        }

        val btnj3 = findViewById<ImageButton>(R.id.btnj3)
        btnj3.setOnClickListener {
            //open a new activity
            intent= Intent(this, j3::class.java)
            startActivity(intent)
        }

        val btnj4 = findViewById<ImageButton>(R.id.btnj4)
        btnj4.setOnClickListener {
            //open a new activity
            intent= Intent(this, j4::class.java)
            startActivity(intent)
        }

        val btnj5 = findViewById<ImageButton>(R.id.btnj5)
        btnj5.setOnClickListener {
            //open a new activity
            intent= Intent(this, j5::class.java)
            startActivity(intent)
        }

        val btnj6 = findViewById<ImageButton>(R.id.btnj6)
        btnj6.setOnClickListener {
            //open a new activity
            intent= Intent(this, j6::class.java)
            startActivity(intent)
        }

        }
    }