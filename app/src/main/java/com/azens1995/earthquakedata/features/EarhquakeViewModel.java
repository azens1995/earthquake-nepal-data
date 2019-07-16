package com.azens1995.earthquakedata.features;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.azens1995.earthquakedata.data.remote.response.GeoJsonResponse;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class EarhquakeViewModel extends AndroidViewModel {
    private EarthquakeRepository mEarthquakeRepository;
    public EarhquakeViewModel(@NonNull Application application) {
        super(application);
        mEarthquakeRepository = EarthquakeRepository.getInstance(application);
    }

    public LiveData<GeoJsonResponse> getEarthquakeData(){
        return mEarthquakeRepository.getGeoJsonData();
    }
}
