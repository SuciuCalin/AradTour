package com.example.android.aradtour;

/**
 * Created by JukUm on 5/13/2017.
 */

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;    //constant value that shows that no image was provided

    private int mPlaceName;                             //name of the location
    private int mPlaceAddress;                          //address of the location
    private int mImageResourceId = NO_IMAGE_PROVIDED;   //image ID for the location

    /**
     * create a new Location object with the place name, address, and image
     *
     * @param placeName       is the name of the location
     * @param placeAddress    is the address of the location
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     */
    public Location(int placeName, int placeAddress, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * create a new Location object with the place name and address
     *
     * @param placeName    is the name of the location
     * @param placeAddress is the address of the location
     */
    public Location(int placeName, int placeAddress) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
    }

    //get the name of the location
    public int getPlaceName() {
        return mPlaceName;
    }

    //get the address of the location
    public int getPlaceAddress() {
        return mPlaceAddress;
    }

    //get the image resource ID of the location
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //return whether or not there is an image for this location
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
