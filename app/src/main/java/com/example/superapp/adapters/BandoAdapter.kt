package com.example.superapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.superapp.R
import com.example.superapp.models.Publisher
import com.squareup.picasso.Picasso

class BandoAdapter(
    private val context: Context,
    private val publishers: List<Publisher>,
    private val onItemClick: (Publisher) -> Unit
) : RecyclerView.Adapter<BandoAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.publisherImageView)

        init {
            view.setOnClickListener {
                onItemClick(publishers[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.publusher_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val publisher = publishers[position]
        Picasso.get().load(publisher.image).into(holder.imageView)
    }

    override fun getItemCount(): Int = publishers.size
}