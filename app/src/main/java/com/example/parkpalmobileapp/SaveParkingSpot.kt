package com.example.parkpalmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SaveParkingSpot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_parking_spot)

        val button_savespace = findViewById<Button>(R.id.savespace)

        button_savespace.setOnClickListener {
            val intent = Intent(this, MapsActivity :: class.java)
            startActivity(intent)
        }
    }


}
