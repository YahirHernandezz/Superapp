package com.example.superapp.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superapp.R
import com.example.superapp.adapters.SuperAdapter
import com.example.superapp.models.Publisher
import com.example.superapp.models.Super

class HeroesActivity : AppCompatActivity() {
    lateinit var publisherTitle : TextView
    lateinit var superRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        publisherTitle = findViewById(R.id.bando_title)
        superRecyclerView = findViewById(R.id.heroes_recyclerview)
        val publisherId = intent.getIntExtra("publisherId",0)
        Log.i("HeroesActivity","Id pasado: ${publisherId}")
        //intenta buscar entre toda la lista para que se empareje con nuestra busqueda

        val publisher = Publisher.publishers.firstOrNull{ publisher ->
            publisher.id == publisherId
        }
        Log.i("HeroesActivity",publisher.toString())
        publisherTitle.text = publisher?.name
        val supers = Super.supers.filter { hero ->
            hero.publisherId == publisherId
        }
        Log.i("HeroesActivity",supers.toString())
        superRecyclerView.adapter = SuperAdapter(supers){ hero ->
            val intent = Intent(this@HeroesActivity,HeroDetailActivity::class.java)
            intent.putExtra("superId",hero.id)
            startActivity(intent)
        }

        superRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}