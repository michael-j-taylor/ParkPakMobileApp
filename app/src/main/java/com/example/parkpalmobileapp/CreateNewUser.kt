package com.example.parkpalmobileapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class CreateNewUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_user)

        var autopayment : Boolean = false

        val create_add_user = findViewById<Button>(R.id.create_add_user)
        val autopayment_checkbox = findViewById<CheckBox>(R.id.autopayment_checkbox)
        val button_skip = findViewById<Button>(R.id.payment_skip2)

        autopayment_checkbox.setOnClickListener(View.OnClickListener {
            if (autopayment_checkbox.isChecked) {
                autopayment = true
            }
            if (!autopayment_checkbox.isChecked) {
                autopayment = false
            }
        })

        button_skip.setOnClickListener {
            val intent = Intent(this, MainMenuActivity :: class.java)
            startActivity(intent)
        }

        create_add_user.setOnClickListener {
            if (autopayment) {
                val add_user_intent = Intent(this, PaymentActivity :: class.java)
                startActivity(add_user_intent)
            }
            else {
                val add_user_intent = Intent(this, MainMenuActivity :: class.java)
                startActivity(add_user_intent)
            }
        }
    }
}
