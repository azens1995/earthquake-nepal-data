package com.azens1995.earthquakedata.features;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.azens1995.earthquakedata.R;
import com.azens1995.earthquakedata.data.remote.response.EarthquakeResponse;
import com.azens1995.earthquakedata.databinding.ListitemEarthquakeBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class EarthquakeAdapter extends RecyclerView.Adapter<EarthquakeAdapter.EarthquakeViewHolder> {

    private LayoutInflater layoutInflater;
    private List<EarthquakeResponse> mEarthquakeDataList = new ArrayList<>();

    public EarthquakeAdapter(List<EarthquakeResponse> earthquakeDataList) {
        this.mEarthquakeDataList = earthquakeDataList;
    }

    @NonNull
    @Override
    public EarthquakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ListitemEarthquakeBinding earthquakeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.listitem_earthquake, parent, false);
        return new EarthquakeViewHolder(earthquakeBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull EarthquakeViewHolder holder, int position) {
            holder.bind(mEarthquakeDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mEarthquakeDataList.size();
    }

    public void addEarthquakeNewData(List<EarthquakeResponse> earthquakeDataList){
        mEarthquakeDataList.clear();
        mEarthquakeDataList.addAll(earthquakeDataList);
        notifyDataSetChanged();
    }

    public class EarthquakeViewHolder extends RecyclerView.ViewHolder {
        private ListitemEarthquakeBinding earthquakeBinding;
        public EarthquakeViewHolder(ListitemEarthquakeBinding listitemEarthquakeBinding) {
            super(listitemEarthquakeBinding.getRoot());
            this.earthquakeBinding = listitemEarthquakeBinding;
        }

        public void bind(EarthquakeResponse earthquakeResponse){
            earthquakeBinding.setEarthquake(earthquakeResponse);

        }

    }
}
