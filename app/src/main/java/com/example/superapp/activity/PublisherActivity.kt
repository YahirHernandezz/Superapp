package com.example.superapp.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superapp.R
import com.example.superapp.models.User
import com.example.superapp.MainActivity
import com.example.superapp.adapters.BandoAdapter
import com.example.superapp.models.Publisher

class PublisherActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView
    lateinit var bandoRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)

        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)

        //BANDO DE HEROES
        bandoRecyclerView = findViewById(R.id.bando_recyclerview)
        bandoRecyclerView.layoutManager = LinearLayoutManager(this)
        bandoRecyclerView.adapter = BandoAdapter(this, Publisher.publishers) { publisher ->
            val intent = Intent(this, HeroesActivity::class.java)
            intent.putExtra("publisherId", publisher.id)
            startActivity(intent)
        }

        val user = User.users[1]
        usernameTV.text = user.startName
        logoutBtn.setOnClickListener {
            Log.i("LOGOUT", "CERRANDO SESION")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}