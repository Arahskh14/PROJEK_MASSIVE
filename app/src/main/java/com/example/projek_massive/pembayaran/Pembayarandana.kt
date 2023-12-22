package com.example.projek_massive.pembayaran

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projek_massive.R

class Pembayarandana : AppCompatActivity() {

    private lateinit var editTextNomorTujuan: EditText
    private lateinit var editTextAtasNama: EditText
    private lateinit var editTextNominalTransfer: EditText
    private lateinit var editTextCatatan: EditText
    private lateinit var btnBayarSekarang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayarandana)

        editTextNomorTujuan = findViewById(R.id.editTextNomorTujuan)
        editTextAtasNama = findViewById(R.id.editTextAtasNama)
        editTextNominalTransfer = findViewById(R.id.editTextNominalTransfer)
        editTextCatatan = findViewById(R.id.editTextCatatan)
        btnBayarSekarang = findViewById(R.id.btn)

        btnBayarSekarang.setOnClickListener {
            // Mendapatkan nilai dari EditText
            val nomorTujuan = editTextNomorTujuan.text.toString()
            val atasNama = editTextAtasNama.text.toString()
            val nominalTransfer = editTextNominalTransfer.text.toString()
            val catatan = editTextCatatan.text.toString()

            if (nomorTujuan.isNotEmpty() && atasNama.isNotEmpty() && nominalTransfer.isNotEmpty()) {
                // Show success dialog with a delay
                showSuccessDialogWithDelay()

                // Optionally, navigate to the next screen
                val intent = Intent(this@Pembayarandana, NomorAntrian::class.java)
                Handler().postDelayed({
                    startActivity(intent)
                }, 2000) // 2000 milliseconds (2 seconds) delay
            } else {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showSuccessDialogWithDelay() {
        val namaPenerima = "Sarah Khoirunnisa"  // Ganti dengan nama penerima yang sesuai
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Pembayaran Berhasil")
            .setMessage("Pembayaran sebesar ${editTextNominalTransfer.text} kepada $namaPenerima berhasil.")
            .setPositiveButton("OK") { _, _ ->
                // Handle the "OK" button click if needed
            }
            .show()
    }
}
