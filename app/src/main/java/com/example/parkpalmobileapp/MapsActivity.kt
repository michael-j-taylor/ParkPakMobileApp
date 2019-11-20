package com.example.parkpalmobileapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)  //This determines what view to show
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker at garage location and move the camera
        val garage1 = LatLng(33.5778, -101.8752)
        val garage2 = LatLng(33.5190, -101.8534)

        val garage1_marker = mMap.addMarker(MarkerOptions().position(garage1).title("garage1"))
        val garage2_marker = mMap.addMarker(MarkerOptions().position(garage2).title("garage2"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(garage1))
        mMap.animateCamera(CameraUpdateFactory.zoomTo(11.toFloat()), 2000, null)

        mMap.setOnMarkerClickListener { marker ->
            openGarageActivity(marker)
            true
        }
    }

    //Open specific activity based on clicked marker's title
    //as of now, just opens main menu activity
    public fun openGarageActivity(marker : Marker) {
        if (marker.title == "garage1") {
            val intent = Intent(this, Garage1Activity :: class.java)
            startActivity(intent)
        }
        else if (marker.title == "garage2") {
            val intent = Intent(this, Garage1Activity :: class.java)
            startActivity(intent)
        }
    }



}
