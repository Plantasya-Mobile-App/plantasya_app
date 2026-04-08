package com.example.plantasya

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        val tvChangeUserPass = view.findViewById<TextView>(R.id.tvChangeUserPass)
        val tvLogout = view.findViewById<TextView>(R.id.tvLogout)
        val tvDeleteAccount = view.findViewById<TextView>(R.id.tvDeleteAccount)

        tvChangeUserPass.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(ChangePassFragment())
        }

        tvLogout.setOnClickListener {
            showLogoutDialog()
        }

        tvDeleteAccount.setOnClickListener {
            showDeleteAccountDialog()
        }

        // Add about this app button logic if needed here, 
        // though it's typically in ProfileFragment based on previous steps.
        // If there's an "About" option in settings as well:
        /*
        val tvAbout = view.findViewById<TextView>(R.id.tvAbout)
        tvAbout?.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(AboutFragment())
        }
        */

        return view
    }

    private fun showLogoutDialog() {
        val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_logout, null)
        val builder = AlertDialog.Builder(context)
            .setView(dialogView)
            .setCancelable(true)

        val alertDialog = builder.create()
        alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val btnYes = dialogView.findViewById<Button>(R.id.btnYes)
        val btnNo = dialogView.findViewById<Button>(R.id.btnNo)

        btnYes.setOnClickListener {
            alertDialog.dismiss()
            val intent = Intent(activity, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            activity?.finish()
        }

        btnNo.setOnClickListener {
            alertDialog.dismiss()
        }

        alertDialog.show()
    }

    private fun showDeleteAccountDialog() {
        val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_delete_account, null)
        val builder = AlertDialog.Builder(context)
            .setView(dialogView)
            .setCancelable(true)

        val alertDialog = builder.create()
        alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val btnYes = dialogView.findViewById<Button>(R.id.btnYesDelete)
        val btnNo = dialogView.findViewById<Button>(R.id.btnNoDelete)

        btnYes.setOnClickListener {
            alertDialog.dismiss()
            val intent = Intent(activity, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            activity?.finish()
        }

        btnNo.setOnClickListener {
            alertDialog.dismiss()
        }

        alertDialog.show()
    }
}