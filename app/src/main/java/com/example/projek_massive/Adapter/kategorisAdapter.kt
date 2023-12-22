package com.example.projek_massive.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projek_massive.R
import com.example.projek_massive.kategori.Newskategoris
import com.google.android.material.imageview.ShapeableImageView

class kategorisAdapter(private val newList: ArrayList<Newskategoris>) :
    RecyclerView.Adapter<kategorisAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.listkategoris,
            parent, false)
        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return newList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvHeading)

    }
}