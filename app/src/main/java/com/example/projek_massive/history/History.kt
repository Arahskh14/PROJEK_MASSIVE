package com.example.projek_massive.history

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projek_massive.R

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val button: Button = findViewById(R.id.button2)

        button.setOnClickListener {
            val intent = Intent(this@History, History1::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.btn_)

        button1.setOnClickListener {
            val intent = Intent(this@History, Struk::class.java)
            startActivity(intent)
        }
    }
}