package com.example.siddhant.bvportal;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        LatLng metroStation = new LatLng(28.677319, 77.112268);
        mMap.addMarker(new MarkerOptions().position(metroStation).title("Metro Station"));
        LatLng library = new LatLng(28.675482, 77.112959);
        mMap.addMarker(new MarkerOptions().position(library).title("Library"));
        LatLng cBlock = new LatLng(28.675579, 77.113000);
        mMap.addMarker(new MarkerOptions().position(cBlock).title("C Block"));
        LatLng bBlock = new LatLng(28.675778, 77.113101);
        mMap.addMarker(new MarkerOptions().position(bBlock).title("B Block"));
        LatLng aBlock = new LatLng(28.676054, 77.113204);
        mMap.addMarker(new MarkerOptions().position(aBlock).title("A Block"));
        LatLng badiCanteen = new LatLng(28.675770, 77.112320);
        mMap.addMarker(new MarkerOptions().position(badiCanteen).title("Badi Canteen"));
        LatLng CCD = new LatLng(28.675686, 77.112229);
        mMap.addMarker(new MarkerOptions().position(CCD).title("Cafe Coffee Day"));
        LatLng cocaCola = new LatLng(28.676122, 77.112887);
        mMap.addMarker(new MarkerOptions().position(cocaCola).title("Happiness Centre"));
        LatLng goleMarket = new LatLng(28.677033, 77.111283);
        mMap.addMarker(new MarkerOptions().position(goleMarket).title("Gole Market"));
        LatLng carParking = new LatLng(28.675121, 77.113318);
        mMap.addMarker(new MarkerOptions().position(carParking).title("Car Parking"));
        LatLng girlsHostel = new LatLng(28.675997, 77.112501);
        mMap.addMarker(new MarkerOptions().position(girlsHostel).title("Girls Hostel"));
        LatLng ground = new LatLng(28.675067, 77.112623);
        mMap.addMarker(new MarkerOptions().position(ground).title("Ground"));
        //LatLng nescafe = new LatLng(28.675997, 77.112501);
        //mMap.addMarker(new MarkerOptions().position(nescafe).title("Lootere"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cocaCola, 18.0f));


    }
}