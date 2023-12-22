// homeAdapter.kt
package com.example.projek_massive.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projek_massive.R

class homeAdapter(private var dataList: List<home_datalist>, private val listener: OnItemClickListener) :
    RecyclerView.Adapter<homeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_list, parent, false)
        return ViewHolder(view)
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataList[position]

        // Bind data to views in the item layout
        holder.titleTextView.text = currentItem.title
        holder.subtitleTextView.text = currentItem.subtitle
        holder.imageView.setImageResource(currentItem.imageResource)

        // Set click listener for the button
        holder.button.setOnClickListener {
            listener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titletext)
        val subtitleTextView: TextView = itemView.findViewById(R.id.subtitletext)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val button: Button = itemView.findViewById(R.id.button1)
    }
}
