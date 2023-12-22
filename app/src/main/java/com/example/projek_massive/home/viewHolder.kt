package com.example.projek_massive.home

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projek_massive.R


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val titleTextView: TextView = itemView.findViewById(R.id.titletext)
    val subtitleTextView: TextView = itemView.findViewById(R.id.subtitletext)

    init {
        // Log statements to help with debugging
        Log.d("ViewHolder", "ImageView ID: ${imageView.id}")
        Log.d("ViewHolder", "TitleTextView ID: ${titleTextView.id}")
        Log.d("ViewHolder", "SubtitleTextView ID: ${subtitleTextView.id}")
    }
}
