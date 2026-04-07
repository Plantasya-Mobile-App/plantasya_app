package com.example.plantasya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<ImageButton>(R.id.btnNavHome)
        val btnDictionary = findViewById<ImageButton>(R.id.btnNavDictionary)
        val btnHistory = findViewById<ImageButton>(R.id.btnNavHistory)
        val btnProfile = findViewById<ImageButton>(R.id.btnNavProfile)

        btnHome.setOnClickListener {
            // Already on Home
        }

        btnDictionary.setOnClickListener {
            val intent = Intent(this, DictionaryActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        btnHistory.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }

    fun resetToHome() {
        // This method can be used to reset the UI to the home state.
    }
}