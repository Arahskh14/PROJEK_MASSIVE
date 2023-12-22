package com.example.projek_massive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menyiapkan NavController
        val navController: NavController = Navigation.findNavController(this, R.id.nav_host_fragment)

        // Menyiapkan BottomNavigationView dengan NavController
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomview)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        // Menggunakan setOnItemSelectedListener yang telah diperbarui
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home, R.id.categorise, R.id.history, R.id.profile -> {
                    // Handle navigation to corresponding destinations
                    navController.navigate(item.itemId)
                    true
                }
                else -> false
            }
        }
    }
}
