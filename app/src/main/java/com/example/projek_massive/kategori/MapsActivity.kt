package com.example.projek_massive.kategori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projek_massive.R

class MapsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps2)

        // Tambahkan fragment ke dalam kontainer
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, Maps())
            .commit()
    }
}