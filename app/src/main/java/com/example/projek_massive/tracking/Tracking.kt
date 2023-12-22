package com.example.projek_massive.tracking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projek_massive.R
import com.example.projek_massive.home.Home


class Tracking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracking)

        val tvDate: TextView = findViewById(R.id.tvDate)

        // Menambahkan OnClickListener ke TextView
        tvDate.setOnClickListener {
            val intent = Intent(this@Tracking, Home::class.java)
            startActivity(intent)
        }
    }
}