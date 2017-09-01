package com.example.android.quakereport;

/**
 * Created by Mukesh on 8/21/2017.
 */

public class Earthquake {


    private Double mMagnitude;

    private String mOffset;

    private String mPrimaryLocation;

    private String mDate;

    private String mTime;

    private String mUrl;

    public Earthquake(Double magnitude, String offset, String primaryLocation, String date, String time, String url) {
        mMagnitude = magnitude;
        mOffset = offset;
        mPrimaryLocation = primaryLocation;
        mDate = date;
        mTime = time;
        mUrl = url;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmOffset() {return mOffset; }

    public String getmPrimaryLocation() {
        return mPrimaryLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmUrl() {return mUrl; }
}
