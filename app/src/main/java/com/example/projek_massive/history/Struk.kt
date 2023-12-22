package com.example.projek_massive.history

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projek_massive.R
import com.example.projek_massive.pembayaran.Paymentsukses
import com.example.projek_massive.tracking.Tracking

class Struk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_struk)

        val button: Button = findViewById(R.id.btn)

        button.setOnClickListener {
            val intent = Intent(this@Struk, Tracking::class.java)
            startActivity(intent)
        }
    }
}