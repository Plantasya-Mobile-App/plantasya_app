package com.example.plantasya

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<ImageButton>(R.id.btnNavHome)
        val btnDictionary = findViewById<ImageButton>(R.id.btnNavDictionary)
        val btnHistory = findViewById<ImageButton>(R.id.btnNavHistory)
        val btnProfile = findViewById<ImageButton>(R.id.btnNavProfile)

        // Load HomeFragment by default
        if (savedInstanceState == null) {
            replaceFragment(HomeFragment())
            updateNavButtons(btnHome)
        }

        btnHome.setOnClickListener {
            replaceFragment(HomeFragment())
            updateNavButtons(btnHome)
        }

        btnDictionary.setOnClickListener {
            replaceFragment(DictionaryFragment())
            updateNavButtons(btnDictionary)
        }

        btnHistory.setOnClickListener {
            replaceFragment(HistoryFragment())
            updateNavButtons(btnHistory)
        }

        btnProfile.setOnClickListener {
            replaceFragment(ProfileFragment())
            updateNavButtons(btnProfile)
        }
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    fun updateNavButtons(selectedButton: ImageButton) {
        val navButtons = listOf(
            findViewById<ImageButton>(R.id.btnNavHome),
            findViewById<ImageButton>(R.id.btnNavDictionary),
            findViewById<ImageButton>(R.id.btnNavHistory),
            findViewById<ImageButton>(R.id.btnNavProfile)
        )

        for (btn in navButtons) {
            if (btn == selectedButton) {
                btn.setBackgroundResource(R.drawable.round_button)
                btn.setColorFilter(null) // White icon on green background
            } else {
                btn.setBackgroundResource(R.drawable.round_button_white)
                btn.setColorFilter(resources.getColor(R.color.plant_green, theme)) // Green icon on white background
            }
        }
    }
}