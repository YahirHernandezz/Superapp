package com.example.superapp.adapters

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

class BandoAdapter(val bandoList : List<Publisher>, val onClick:(Publisher)->Unit)
    : RecyclerView.Adapter<BandoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BandoViewHolder {
        //MANDAMOS A LLAMARLO DE PARENT (PublisherActivity), INFLAMOS/MOSTRAR EL RESTAURANT ITEM
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bando_item,parent,false)
        return BandoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bandoList.count()
    }

    override fun onBindViewHolder(holder: BandoViewHolder, position: Int) {
        val heroe = bandoList[position]
        holder.heroeNameTV.text = heroe.name
        Picasso.get().load(heroe.image).into(holder.heroeImage)
        //itemView es el conjunto que hay en Bando Adpater, agarra all lo que haya en esa vista
        holder.itemView.setOnClickListener{
            onClick(heroe)
        }
    }
}

class BandoViewHolder(view : View) : ViewHolder(view){
    val heroeNameTV : TextView = view.findViewById(R.id.bando_name)
    val heroeImage : ImageView = view.findViewById(R.id.bando_image)
}