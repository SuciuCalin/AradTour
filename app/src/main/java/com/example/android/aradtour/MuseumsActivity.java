package com.example.android.aradtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.locations_list);

        /// Creates a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.museum_name_art, R.string.museum_address_art, R.drawable.art_museum));
        locations.add(new Location(R.string.museum_name_CountyHistory, R.string.museum_address_CountyHistory, R.drawable.country_history_museum));
        locations.add(new Location(R.string.museum_name_NaturalSiences, R.string.museum_address_NaturalSiences, R.drawable.natural_sciences_museum));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.locations_list);
        listView.setAdapter(adapter);
    }
}
