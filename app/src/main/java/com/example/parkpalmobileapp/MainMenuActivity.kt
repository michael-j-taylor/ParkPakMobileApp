package com.example.parkpalmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val button_home_map = findViewById<Button>(R.id.button_home_map)

        button_home_map.setOnClickListener {
            val intent = Intent(this, MapsActivity :: class.java)
            startActivity(intent)
        }

        val user_set_up = findViewById<Button>(R.id.user_set_up)

        user_set_up.setOnClickListener {
            val sign_up_intent = Intent(this, CreateNewUser :: class.java)
            startActivity(sign_up_intent)
        }
    }
}
