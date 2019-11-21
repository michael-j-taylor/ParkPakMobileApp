package com.example.parkpalmobileapp

import android.content.Context
import android.content.Intent
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import java.lang.Exception

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    //private lateinit var fuse: FusedL

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
        //val garage1 = LatLng(33.5778, -101.8752) 1838-1842 Flint Ave, Lubbock, TX 79410
        val garage_raiderpark = LatLng(33.593419, -101.874219)
        val garage_z4 = LatLng(33.578933, -101.884648)

        val garage_raiderpark_marker = mMap.addMarker(MarkerOptions()
            .position(garage_raiderpark).title("garage_raiderpark"))
            .setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))

        val garage_z4_marker = mMap.addMarker(MarkerOptions()
            .position(garage_z4).title("garage_z4"))
            .setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(LatLng(33.586410, -101.875340)))
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14.toFloat()), 2000, null)

        mMap.setOnMarkerClickListener { marker ->
            openGarageActivity(marker)
            true
        }
    }

    //Open specific activity based on clicked marker's title
    //as of now, just opens main menu activity
    fun openGarageActivity(marker : Marker) {
        if (marker.title == "garage_raiderpark") {
            val intent = Intent(this, GarageRaiderParkActivity :: class.java)
            startActivity(intent)
        }
        else if (marker.title == "garage_z4") {
            val intent = Intent(this, Garage1Activity :: class.java)
            startActivity(intent)
        }
    }

}
