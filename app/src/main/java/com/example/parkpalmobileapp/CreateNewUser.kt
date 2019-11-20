package com.example.parkpalmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateNewUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_user)

        val create_add_user = findViewById<Button>(R.id.create_add_user)

        create_add_user.setOnClickListener {
            val add_user_intent = Intent(this, PaymentActivity :: class.java)
            startActivity(add_user_intent)
        }
    }
}
