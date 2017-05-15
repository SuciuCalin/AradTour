package com.example.android.aradtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.locations_list);

        // Creates a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.hotel_name_coandi, R.string.hotel_address_coandi));
        locations.add(new Location(R.string.hotel_name_alexander, R.string.hotel_address_alexander));
        locations.add(new Location(R.string.hotel_name_bestWestern, R.string.hotel_address_bestWestern));
        locations.add(new Location(R.string.hotel_name_queen, R.string.hotel_address_queen));
        locations.add(new Location(R.string.hotel_name_continentalForum, R.string.hotel_address_continentalForum));
        locations.add(new Location(R.string.hotel_name_iris, R.string.hotel_address_iris));
        locations.add(new Location(R.string.hotel_name_lotus, R.string.hotel_address_lotus));
        locations.add(new Location(R.string.hotel_name_parc, R.string.hotel_address_parc));
        locations.add(new Location(R.string.hotel_name_phoenix, R.string.hotel_address_phoenix));
        locations.add(new Location(R.string.hotel_name_miky, R.string.hotel_address_miky));
        locations.add(new Location(R.string.hotel_name_anaInn, R.string.hotel_address_anaInn));
        locations.add(new Location(R.string.hotel_name_leon, R.string.hotel_address_leon));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.locations_list);
        listView.setAdapter(adapter);
    }
}
