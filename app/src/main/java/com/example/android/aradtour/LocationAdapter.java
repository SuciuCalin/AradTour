package com.example.android.aradtour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by JukUm on 5/13/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * create a new LocationAdapter object
     *
     * @param context   is the current context that the adapter is being created in
     * @param locations is the list of Locations to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //find and set the location Name in the list
        Location currentLocation = getItem(position);
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        if (currentLocation != null) {
            placeName.setText(currentLocation.getPlaceName());
        }

        //find and set the location Address in the list
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.place_address);
        if (currentLocation != null) {
            placeAddress.setText(currentLocation.getPlaceAddress());
        }

        //find and set the location Image in the list
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentLocation != null) {
            if (currentLocation.hasImage()) {
                imageView.setImageResource(currentLocation.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
        }

        return listItemView;
    }
}
