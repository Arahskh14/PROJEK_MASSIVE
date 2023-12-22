package com.example.projek_massive.pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projek_massive.R
import com.example.projek_massive.booking.FormActivity

class eMoney : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoney)

        val button: Button = findViewById(R.id.dompetDigital)

        button.setOnClickListener {
            val intent = Intent(this@eMoney, Pembayarandana::class.java)
            startActivity(intent)
        }
    }
}
