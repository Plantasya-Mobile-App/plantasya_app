package com.example.plantasya

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val btnHome = findViewById<ImageButton>(R.id.btnNavHome)
        val btnDictionary = findViewById<ImageButton>(R.id.btnNavDictionary)
        val btnHistory = findViewById<ImageButton>(R.id.btnNavHistory)
        val btnProfile = findViewById<ImageButton>(R.id.btnNavProfile)

        // Load HistoryFragment by default
        if (savedInstanceState == null) {
            replaceFragment(HistoryFragment())
            updateNavButtons(btnHistory)
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

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    private fun updateNavButtons(selectedButton: ImageButton) {
        val navButtons = listOf(
            findViewById<ImageButton>(R.id.btnNavHome),
            findViewById<ImageButton>(R.id.btnNavDictionary),
            findViewById<ImageButton>(R.id.btnNavHistory),
            findViewById<ImageButton>(R.id.btnNavProfile)
        )

        for (btn in navButtons) {
            if (btn == selectedButton) {
                btn.setBackgroundResource(R.drawable.round_button)
                btn.setColorFilter(null)
            } else {
                btn.setBackgroundResource(R.drawable.round_button_white)
                btn.setColorFilter(resources.getColor(R.color.plant_green, theme))
            }
        }
    }
}