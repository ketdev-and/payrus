package com.example.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : FragmentActivity(), OnMapReadyCallback {
    lateinit var map: GoogleMap;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment: SupportMapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0
        val location : LatLng = LatLng(6.489262388832656, 3.2011790122512127)
        map.addMarker(MarkerOptions().position(location).title("Iyana Iba Ojo Lagos"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(location,15f))
    }
}