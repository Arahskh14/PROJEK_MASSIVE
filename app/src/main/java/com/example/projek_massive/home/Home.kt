package com.example.projek_massive.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projek_massive.Adapter.homeAdapter
import com.example.projek_massive.Adapter.home_datalist
import com.example.projek_massive.Profile.Profile
import com.example.projek_massive.R
import com.example.projek_massive.booking.Booking
import com.example.projek_massive.booking.Kalender
import com.example.projek_massive.history.Halamanuatama

class Home : AppCompatActivity() {

    private lateinit var yourAdapter: homeAdapter
    private lateinit var yourOriginalDataList: List<home_datalist>
    private val yourDataList = mutableListOf<home_datalist>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize yourOriginalDataList with your data
        yourOriginalDataList = listOf(
            home_datalist(
                R.drawable.motor1,
                "Gogo Car Wash", "Cijoho, Kuningan"),
            home_datalist(R.drawable.mobil2, "Hapuna Wash", "Jl.Karet, Cigintung"),
            home_datalist(R.drawable.motor3, "Dikta Sejati", "Jl.Kadugede, Kuningan"),
            home_datalist(R.drawable.mobil1, "Cuci Salju", "Jl.Veteran, Kuningan")
            // Add more items as needed
        )

        // Set up RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.view1)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        // Initialize the adapter with yourOriginalDataList
        yourAdapter = homeAdapter(yourOriginalDataList, object : homeAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                // Handle button click here, e.g., start Categorise activity
                val intent = Intent(this@Home, Kalender::class.java)
                startActivity(intent)
            }
        })

        recyclerView.adapter = yourAdapter

        val textViewFavorit: TextView = findViewById(R.id.textView5)
        textViewFavorit.setOnClickListener {
            val intent = Intent(this@Home, Halamanuatama::class.java)
            startActivity(intent)
        }

        val textView: TextView = findViewById(R.id.textView2)
        textView.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val textViewBooking: TextView = findViewById(R.id.textView3)
        textViewBooking.setOnClickListener {
            val intent = Intent(this@Home, Kalender::class.java)
            startActivity(intent)
        }

        val lokasiTextView: TextView = findViewById(R.id.textView7)
        lokasiTextView.setOnClickListener {
            // Intent untuk membuka Google Maps
            val gmmIntentUri = Uri.parse("geo:0,0?q=lokasi")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            } else {
                val playStoreUri = Uri.parse("market://details?id=com.google.android.apps.maps")
                val playStoreIntent = Intent(Intent.ACTION_VIEW, playStoreUri)
                startActivity(playStoreIntent)
            }
        }
    }
}
