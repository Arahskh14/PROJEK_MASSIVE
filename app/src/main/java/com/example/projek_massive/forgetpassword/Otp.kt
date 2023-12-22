package com.example.projek_massive.forgetpassword

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.projek_massive.R

class Otp : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var editText4: EditText
    private lateinit var editTextPhoneNumber: EditText
    private lateinit var buttonSend: Button

    private val SMS_PERMISSION_REQUEST_CODE = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val button: Button = findViewById(R.id.btn)

        button.setOnClickListener {
            val intent = Intent(this@Otp, Notifikasisukses::class.java)
            startActivity(intent)
        }

        editText1 = findViewById(R.id.edit_text_1)
        editText2 = findViewById(R.id.edit_text_2)
        editText3 = findViewById(R.id.edit_text_3)
        editText4 = findViewById(R.id.edit_text_4)
        editTextPhoneNumber = findViewById(R.id.edit_text_phone_number)
        buttonSend = findViewById(R.id.button_send_activity_main)

        buttonSend.setOnClickListener {
            val input1 = editText1.text.toString()
            val input2 = editText2.text.toString()
            val input3 = editText3.text.toString()
            val input4 = editText4.text.toString()
            val phoneNumber = editTextPhoneNumber.text.toString()

            val otp = "$input1$input2$input3$input4"

            if (isValidOtp(otp)) {
                sendOtpSms(phoneNumber, otp)
            } else {
                // Handle invalid OTP
                // For example, show an error message
            }
        }
    }

    private fun isValidOtp(otp: String): Boolean {
        val expectedOtp = "1234"

        return otp == expectedOtp
    }

    @Suppress("DEPRECATION")
    private fun sendOtpSms(phoneNumber: String, otp: String) {
        val permissionCheck = ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.SEND_SMS
        )

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            val smsManager = SmsManager.getDefault()
            val message = "Your OTP is: $otp"

            smsManager.sendTextMessage(phoneNumber, null, message, null, null)
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                SMS_PERMISSION_REQUEST_CODE
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == SMS_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val phoneNumber =
                    findViewById<EditText>(R.id.edit_text_phone_number).text.toString()
                sendOtpSms(phoneNumber, generateOtp())
            } else {
                // Handle permission denied
            }
        }
    }

    private fun generateOtp(): String {
        val otp = (1000..9999).random()
        return String.format("%04d", otp)
    }

    companion object {
        const val EXTRA_OTP = "extra_otp"
        const val EXTRA_PHONE_NUMBER = "extra_phone_number"
    }
}
