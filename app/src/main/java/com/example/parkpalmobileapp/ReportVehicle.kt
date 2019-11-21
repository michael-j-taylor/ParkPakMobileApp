package com.example.parkpalmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class ReportVehicle() : AppCompatActivity(), Parcelable {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_vehicle)
    }

    val other_input = findViewById<EditText>(R.id.other_reason_input)

    constructor(parcel: Parcel) : this() {
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.reason_other -> {
                    if (checked) {
                        // Put some meat on the sandwich
                        other_input.setVisibility(View.VISIBLE);
                    } else {
                        // Remove the meat
                        other_input.setVisibility(View.INVISIBLE);
                    }
                }
            }
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ReportVehicle> {
        override fun createFromParcel(parcel: Parcel): ReportVehicle {
            return ReportVehicle(parcel)
        }

        override fun newArray(size: Int): Array<ReportVehicle?> {
            return arrayOfNulls(size)
        }
    }
}
