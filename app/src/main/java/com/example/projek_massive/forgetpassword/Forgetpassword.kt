package com.example.projek_massive.forgetpassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projek_massive.R

class Forgetpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassword)

        val button: Button = findViewById(R.id.buttonnn)

        button.setOnClickListener {
            val intent = Intent(this@Forgetpassword, NoHp::class.java)
            startActivity(intent)
        }
    }
}