package com.azens1995.earthquakedata.data.remote;

import com.azens1995.earthquakedata.data.remote.response.GeoJsonResponse;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_DATA_FORMAT;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_END_TIME;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_MAX_LATITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_MAX_LONGITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_MIN_LATITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_MIN_LONGITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.KEY_START_TIME;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public interface ApiService {

    //https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minlatitude=27&minlongitude=81&maxlatitude=29&maxlongitude=87&starttime=2014-01-01&endtime=2019-07-16&orderby=time
    @GET("query")
    Call<GeoJsonResponse> getAllEarthQuakeData(@Query(KEY_DATA_FORMAT) String format,
                                               @Query(KEY_MIN_LATITUDE) int minlatitude,
                                               @Query(KEY_MAX_LATITUDE) int maxlatitude,
                                               @Query(KEY_MIN_LONGITUDE) int minlongitude,
                                               @Query(KEY_MAX_LONGITUDE) int maxlongitude,
                                               @Query(KEY_START_TIME) String starttime,
                                               @Query(KEY_END_TIME) String endtime);
}
