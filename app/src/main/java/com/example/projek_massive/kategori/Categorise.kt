package com.example.projek_massive.kategori

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projek_massive.Adapter.categorisAdapter
import com.example.projek_massive.R

class Categorise : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Newscategoris>
    private lateinit var imageId: Array<Int>
    private lateinit var heading: Array<String>
    private lateinit var bottomButton: Button  // Tambahkan deklarasi Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorise)

        newRecyclerView = findViewById(R.id.recyclerView)
        bottomButton = findViewById(R.id.button)  // Sesuaikan dengan ID yang sesuai
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        imageId = arrayOf(
            R.drawable.motor1,
            R.drawable.motor2,
            R.drawable.motor3,
            R.drawable.motor1,
            R.drawable.motor2,
            R.drawable.motor3,
            R.drawable.motor1,
            R.drawable.motor2,
            R.drawable.motor3
        )

        heading = arrayOf(
            "Gemilang cuci motor",
            "Kilat cuci motor",
            "Serasi motor spa",
            "Gemilang cuci motor",
            "Kilat cuci motor",
            "Serasi motor spa",
            "Gemilang cuci motor",
            "Kilat cuci motor",
            "Serasi motor spa"
        )

        newArrayList = arrayListOf<Newscategoris>()
        getUserdata()

        val adapter = categorisAdapter(newArrayList)
        newRecyclerView.adapter = adapter
    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = Newscategoris(imageId[i], heading[i])
            newArrayList.add(news)
        }

        bottomButton.setOnClickListener {
            // Handle button click to navigate to the next activity
            val intent = Intent(this, Kategori1::class.java)
            startActivity(intent)
        }
    }
}

