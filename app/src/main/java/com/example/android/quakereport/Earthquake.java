package com.example.android.quakereport;

/**
 * Created by Mukesh on 8/21/2017.
 */

public class Earthquake {


    private String mMagnitude;

    private String mLocation;

    private String mDate;

    private String mTime;

    public Earthquake(String magnitude, String location, String date, String time) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mTime = time;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmTime() {
        return mTime;
    }
}
