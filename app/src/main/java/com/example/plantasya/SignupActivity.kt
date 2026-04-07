package com.example.plantasya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)
        val tvCancel = findViewById<TextView>(R.id.tvCancel)

        btnCreateAccount.setOnClickListener {
            // Placeholder for signup logic
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        tvCancel.setOnClickListener {
            finish()
        }
    }
}