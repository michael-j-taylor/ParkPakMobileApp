package com.example.parkpalmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class ReportVehicleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_vehicle)

        val report_button = findViewById<Button>(R.id.report_button)
        report_button.setOnClickListener {
            val report_intent = Intent(this, MainMenuActivity :: class.java)
            startActivity(report_intent)
        }
    }

}