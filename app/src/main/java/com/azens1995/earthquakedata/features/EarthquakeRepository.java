package com.azens1995.earthquakedata.features;

import android.app.Application;
import android.provider.Telephony;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.azens1995.earthquakedata.data.remote.ApiService;
import com.azens1995.earthquakedata.data.remote.ServiceGenerator;
import com.azens1995.earthquakedata.data.remote.response.GeoJsonResponse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

import static com.azens1995.earthquakedata.utils.ApplicationConstants.VAL_DATA_TYPE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.VAL_MAX_LATITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.VAL_MAX_LONGITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.VAL_MIN_LATITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.VAL_MIN_LONGITUDE;
import static com.azens1995.earthquakedata.utils.ApplicationConstants.VAL_START_TIME;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class EarthquakeRepository {

    private ApiService apiService;
    private static EarthquakeRepository INSTANCE;
    private Executor executor = Executors.newSingleThreadExecutor();
    private MutableLiveData<GeoJsonResponse> geoJsonData = new MutableLiveData<>();

    public static EarthquakeRepository getInstance(Application application){
        if (INSTANCE == null){
            INSTANCE = new EarthquakeRepository(application);
        }
        return INSTANCE;
    }

    public EarthquakeRepository(Application application) {
    }

    public LiveData<GeoJsonResponse> getGeoJsonData() {
        getEarthquakeData();
        return geoJsonData;
    }

    public void getEarthquakeData(){
        apiService = ServiceGenerator.createService(ApiService.class);

        Call<GeoJsonResponse> call = apiService.getAllEarthQuakeData(VAL_DATA_TYPE,
                VAL_MIN_LATITUDE, VAL_MAX_LATITUDE,
                VAL_MIN_LONGITUDE, VAL_MAX_LONGITUDE,
                VAL_START_TIME, presentDate());
        call.enqueue(new Callback<GeoJsonResponse>() {
            @Override
            public void onResponse(Call<GeoJsonResponse> call, Response<GeoJsonResponse> response) {
                if (response.isSuccessful() && response.code() == 200){
                    geoJsonData.setValue(response.body());
                }else {
                    geoJsonData.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<GeoJsonResponse> call, Throwable t) {
                Timber.d(t.getMessage());
            }
        });
    }

    private String presentDate(){
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

}
