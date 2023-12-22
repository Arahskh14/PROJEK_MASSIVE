package com.example.projek_massive.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projek_massive.R


class Notifikasilogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasilogin)

        val button: Button = findViewById(R.id.btn)

        button.setOnClickListener {
            val intent = Intent(this@Notifikasilogin, Login::class.java)
            startActivity(intent)
        }
    }
}