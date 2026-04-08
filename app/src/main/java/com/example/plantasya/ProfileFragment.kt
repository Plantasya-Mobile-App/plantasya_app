package com.example.plantasya

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val llSettings = view.findViewById<LinearLayout>(R.id.llSettings)
        val llTutorial = view.findViewById<LinearLayout>(R.id.llTutorial)
        val llAbout = view.findViewById<LinearLayout>(R.id.llAbout)

        llSettings.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(SettingsFragment())
        }

        llTutorial.setOnClickListener {
            // (activity as? MainActivity)?.replaceFragment(TutorialFragment())
        }

        llAbout.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(AboutFragment())
        }

        return view
    }
}