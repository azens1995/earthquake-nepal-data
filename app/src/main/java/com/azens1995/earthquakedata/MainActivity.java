package com.azens1995.earthquakedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.azens1995.earthquakedata.data.remote.response.EarthquakeResponse;
import com.azens1995.earthquakedata.databinding.ActivityMainBinding;
import com.azens1995.earthquakedata.features.EarhquakeViewModel;
import com.azens1995.earthquakedata.features.EarthquakeAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    private EarhquakeViewModel mEarthquakeViewModel;
    private List<EarthquakeResponse> mEarthquakeResponseList;
    private EarthquakeAdapter mEarthquakeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mEarthquakeResponseList = new ArrayList<>();
        mainBinding.earthquakeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEarthquakeAdapter = new EarthquakeAdapter(mEarthquakeResponseList);
        mainBinding.earthquakeRecyclerView.setAdapter(mEarthquakeAdapter);
        mainBinding.loading.setVisibility(View.VISIBLE);

        mEarthquakeViewModel = ViewModelProviders.of(this).get(EarhquakeViewModel.class);
        mEarthquakeViewModel.getEarthquakeData().observe(this, earthquakeResponse ->{
            mainBinding.loading.setVisibility(View.GONE);
            Timber.d("The response of the data are ->"+new Gson().toJson(earthquakeResponse.getFeatures()));
            mEarthquakeAdapter.addEarthquakeNewData(earthquakeResponse.getFeatures());
        });
    }
}
