package com.example.superapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.superapp.R
import com.squareup.picasso.Picasso
import com.example.superapp.models.Super

class SuperAdapter(val superList : List<Super>,
                  val onClick : (Super) -> Unit)
    : RecyclerView.Adapter<SuperViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperViewHolder {
        //MANDAMOS A LLAMARLO DE PARENT (PublisherActivity), INFLAMOS/MOSTRAR EL RESTAURANT ITEM
        val view = LayoutInflater.from(parent.context).inflate(R.layout.super_item,parent,false)
        return SuperViewHolder(view)
    }

    override fun getItemCount(): Int {
        return superList.count()
    }

    override fun onBindViewHolder(holder: SuperViewHolder, position: Int) {
        val hero = superList[position]
        holder.superNameTV.text = hero.name
        Picasso.get().load(hero.image).into(holder.superImage)
        holder.itemView.setOnClickListener{
            onClick(hero)
        }
    }
}

class SuperViewHolder(view : View) : ViewHolder(view){
    val superNameTV : TextView = view.findViewById(R.id.super_name)
    val superImage : ImageView = view.findViewById(R.id.super_image)
}