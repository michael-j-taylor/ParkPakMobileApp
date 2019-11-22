package com.example.parkpalmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val payment_skip = findViewById<Button>(R.id.payment_skip)

        val payment_add_card = findViewById<Button>(R.id.payment_add_card)

        payment_skip.setOnClickListener {
            val skip_intent = Intent(this, MapsActivity :: class.java)
            startActivity(skip_intent)
        }
        payment_add_card.setOnClickListener {
            val add_card_intent = Intent(this, MapsActivity :: class.java)
            startActivity(add_card_intent)
        }
    }
}
