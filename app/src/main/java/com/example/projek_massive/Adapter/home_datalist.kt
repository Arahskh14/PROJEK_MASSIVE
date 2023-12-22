package com.example.projek_massive.Adapter

import com.example.projek_massive.R


data class home_datalist(val imageResource: Int, val title: String, val subtitle: String) {
}

val data = listOf(
    home_datalist(R.drawable.motor1, "Gogo Car Wash", "Jl. RE. Martadinata No.54, Cijoho, Kec. Kuningan, Kabupaten Kuningan"),
    home_datalist(R.drawable.mobil2, "Hapuna Wash", "Jl.Karet, Jakarta Pusat"),
    home_datalist(R.drawable.motor3, "Dikta Sejati", "Jl.Kadugede, Bandung"),
    home_datalist(R.drawable.mobil1, "Cuci Salju", "Jl.Veteran, Jakarta Kuningan"),
    // Add more items as needed
)
