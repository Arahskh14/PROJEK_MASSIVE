package com.example.projek_massive.pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.projek_massive.R
import com.example.projek_massive.history.History
import com.example.projek_massive.history.History1

class NomorAntrian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomor_antrian)

        setContentView(R.layout.activity_nomor_antrian)
        val textView23: TextView = findViewById(R.id.textView23)
        textView23.setOnClickListener {
            // Intent untuk membuka aktivitas History
            val intent = Intent(this@NomorAntrian, History::class.java)
            startActivity(intent)
        }
    }
}