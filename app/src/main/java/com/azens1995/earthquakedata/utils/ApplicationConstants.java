package com.azens1995.earthquakedata.utils;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class ApplicationConstants {
    //format=geojson&minlatitude=27&minlongitude=81&maxlatitude=29&maxlongitude=87&
    // starttime=2014-01-01&endtime=2019-07-16&orderby=time
    public static final String KEY_DATA_FORMAT= "format";
    public static final String VAL_DATA_TYPE = "geojson";

    // LATITUDE
    public static final String KEY_MIN_LATITUDE = "minlatitude";
    public static final int VAL_MIN_LATITUDE = 27;
    public static final String KEY_MAX_LATITUDE = "maxlatitude";
    public static final int VAL_MAX_LATITUDE = 29;

    // LONGITUDE
    public static final String KEY_MIN_LONGITUDE = "minlongitude";
    public static final int VAL_MIN_LONGITUDE = 81;
    public static final String KEY_MAX_LONGITUDE = "maxlongitude";
    public static final int VAL_MAX_LONGITUDE = 89;

    // time
    public static final String KEY_START_TIME = "starttime";
    public static final String VAL_START_TIME = "2014-01-01";
    public static final String KEY_END_TIME = "endtime";


}
