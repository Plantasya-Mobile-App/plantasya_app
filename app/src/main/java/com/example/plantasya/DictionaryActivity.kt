package com.example.plantasya

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DictionaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary)

        val btnHome = findViewById<ImageButton>(R.id.btnNavHome)
        val btnDictionary = findViewById<ImageButton>(R.id.btnNavDictionary)
        val btnHistory = findViewById<ImageButton>(R.id.btnNavHistory)
        val btnProfile = findViewById<ImageButton>(R.id.btnNavProfile)

        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }

        btnDictionary.setOnClickListener {
            // Already on Dictionary screen
        }

        btnHistory.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }

        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }
    }
}