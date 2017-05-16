package com.example.android.aradtour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

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
    public View getView(int position, View listItemView, ViewGroup parent) {

        //using a ViewHolder to reference the child views for later actions
        ViewHolder holder;
        if (listItemView != null) {
            holder = (ViewHolder) listItemView.getTag();
        } else {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            holder = new ViewHolder(listItemView);
            listItemView.setTag(holder);
        }

        Location currentLocation = getItem(position);
        if (currentLocation != null) {
            holder.placeName.setText(currentLocation.getPlaceName());
            holder.placeAddress.setText(currentLocation.getPlaceAddress());
        }

        if (currentLocation.hasImage()) {
            holder.imageView.setImageResource(currentLocation.getImageResourceId());
            holder.imageView.setVisibility(View.VISIBLE);
        } else {
            holder.imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }

    static class ViewHolder {
        @BindView(R.id.place_name)
        TextView placeName;
        @BindView(R.id.place_address)
        TextView placeAddress;
        @BindView(R.id.image)
        ImageView imageView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}