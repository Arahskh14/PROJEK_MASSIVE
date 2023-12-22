package com.example.projek_massive.kategori

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projek_massive.Adapter.categorisAdapter
import com.example.projek_massive.R

class Kategori1 : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Newscategoris>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori1)

        // Initialize RecyclerView
        newRecyclerView = findViewById(R.id.recyclerView1)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        // Initialize data for RecyclerView
        imageId = arrayOf(
            R.drawable.mobil1,
            R.drawable.mobil2,
            R.drawable.mobil3,
            R.drawable.mobil1,
            R.drawable.mobil2,
            R.drawable.mobil5,
            R.drawable.mobil1,
            R.drawable.mobil2,
            R.drawable.mobil3
        )

        heading = arrayOf(
            "77 car wash",
            "Mobile car expres",
            "Pusaka car cer",
            "77 car wash",
            "Mobile car expres",
            "Pusaka car cer",
            "77 car wash",
            "Mobile car expres",
            "Pusaka car cer",
        )

        newArrayList = arrayListOf<Newscategoris>()

        // Populate the ArrayList with data
        getUserdata()

        // Initialize RecyclerView adapter and set it to the RecyclerView
        val adapter = categorisAdapter(newArrayList)
        newRecyclerView.adapter = adapter

        val button: Button = findViewById(R.id.button1)

        button.setOnClickListener {
            val intent = Intent(this@Kategori1, Categorise::class.java)
            startActivity(intent)
        }
    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = Newscategoris(imageId[i], heading[i])
            newArrayList.add(news)
        }
    }
}
