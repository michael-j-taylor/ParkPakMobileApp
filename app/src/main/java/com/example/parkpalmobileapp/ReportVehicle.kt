package com.example.parkpalmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_report_vehicle.*

class ReportVehicle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_vehicle)

        val button_report = findViewById<Button>(R.id.button_report)

        button_report.setOnClickListener {
            val intent = Intent(this, MapsActivity :: class.java)
            startActivity(intent)
        }
    }


}
