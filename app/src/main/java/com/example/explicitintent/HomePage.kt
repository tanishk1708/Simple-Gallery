package com.example.explicitintent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backButton = findViewById<Button>(R.id.btnback)
        backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        val btnexp = findViewById<Button>(R.id.btnexp)
        btnexp.setOnClickListener {
            val intent = Intent(this, GalleryView::class.java)
            startActivity(intent)
        }
        val btnupd = findViewById<Button>(R.id.btnupd)
        btnupd.setOnClickListener {
            val intent = Intent(this, UpdateScreen::class.java)
            startActivity(intent)
        }
    }
}