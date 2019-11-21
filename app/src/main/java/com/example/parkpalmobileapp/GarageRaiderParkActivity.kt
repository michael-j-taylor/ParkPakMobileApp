package com.example.parkpalmobileapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GarageRaiderParkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garage_raider_park)

        val button_takeme = findViewById<Button>(R.id.rp_takeme)

        button_takeme.setOnClickListener {
            val mapsIntentUri: Uri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=Texas+Tech+University+Whitacre+College+of+Engineering,+Boston+Avenue,+Lubbock,+TX&destination=Raider+Park,+Boston+Avenue,+Lubbock,+TX")
            val intent: Intent = Intent(Intent.ACTION_VIEW, mapsIntentUri)

            intent.setPackage("com.google.android.apps.maps")
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }

        }
    }
}
