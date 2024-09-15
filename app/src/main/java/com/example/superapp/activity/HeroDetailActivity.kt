package com.example.superapp.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.superapp.R
import com.example.superapp.models.Super
import com.squareup.picasso.Picasso

class HeroDetailActivity : AppCompatActivity() {
    lateinit var superTextView: TextView
    lateinit var superDescriptionTextView: TextView
    lateinit var superImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_detail)
        superTextView = findViewById(R.id.super_title)
        superDescriptionTextView = findViewById(R.id.super_description)
        superImageView = findViewById(R.id.super_image)


        val superId = intent.getIntExtra("foodId",0)

        val hero = Super.supers.firstOrNull{ hero : Super ->
            hero.id == superId
        }

        superTextView.text = hero?.name
        superDescriptionTextView.text = hero?.description
        Picasso.get().load(hero?.image).into(superImageView)
    }
}