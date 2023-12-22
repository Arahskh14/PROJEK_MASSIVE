package com.example.projek_massive.history

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projek_massive.R

class History1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history1)

        val button: Button = findViewById(R.id.button1)

        button.setOnClickListener {
            val intent = Intent(this@History1, History::class.java)
            startActivity(intent)
        }
    }
}