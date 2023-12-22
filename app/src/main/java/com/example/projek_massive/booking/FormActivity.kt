package com.example.projek_massive.booking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.projek_massive.R
import com.example.projek_massive.pembayaran.eMoney
import android.widget.Toast

class FormActivity : AppCompatActivity() {

    private lateinit var textNama: EditText
    private lateinit var textPlatNomor: EditText
    private lateinit var tglPesan: EditText
    private lateinit var btnPesan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        textNama = findViewById(R.id.editTextText)
        textPlatNomor = findViewById(R.id.editTextText1)
        tglPesan = findViewById(R.id.editTextText2)
        btnPesan = findViewById(R.id.btn)

        btnPesan.setOnClickListener {
            val namaPemesan = textNama.text.toString()
            val platNomor = textPlatNomor.text.toString()
            val jadwalPemesanan = tglPesan.text.toString()

            if (namaPemesan.isNotEmpty() && platNomor.isNotEmpty() && jadwalPemesanan.isNotEmpty()) {
                val intent = Intent(this@FormActivity, eMoney::class.java)
                startActivity(intent)
            } else {
                // Tambahkan pesan kesalahan jika kolom yang wajib diisi tidak terisi
                val errorMessage = "Isi semua kolom formulir"
                Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
