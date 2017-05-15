package com.example.android.aradtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.locations_list);

        // Creates a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.restaurant_name_emaDelMar, R.string.restaurant_address_emaDelMar));
        locations.add(new Location(R.string.restaurant_name_ratio, R.string.restaurant_address_ratio));
        locations.add(new Location(R.string.restaurant_name_don, R.string.restaurant_address_don));
        locations.add(new Location(R.string.restaurant_name_pergola, R.string.restaurant_address_pergola));
        locations.add(new Location(R.string.restaurant_name_curteaVeche, R.string.restaurant_address_curteaVeche));
        locations.add(new Location(R.string.restaurant_name_euphoriaBiergarten, R.string.restaurant_address_euphoriaBiergarten));
        locations.add(new Location(R.string.restaurant_name_ratioBeach, R.string.restaurant_address_ratioBeach));
        locations.add(new Location(R.string.restaurant_name_apetitBistro, R.string.restaurant_address_apetitBistro));
        locations.add(new Location(R.string.restaurant_name_casaJelen, R.string.restaurant_address_casaJelen));
        locations.add(new Location(R.string.restaurant_name_casaBulzan, R.string.restaurant_address_casaBulzan));
        locations.add(new Location(R.string.hotel_name_coandi, R.string.hotel_address_coandi));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.locations_list);
        listView.setAdapter(adapter);
    }
}
