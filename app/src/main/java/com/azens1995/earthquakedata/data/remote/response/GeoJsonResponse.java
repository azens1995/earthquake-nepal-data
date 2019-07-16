package com.azens1995.earthquakedata.data.remote.response;

import java.util.List;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class GeoJsonResponse {
    private String type;
    private MetaDataResponse metadata;
    private List<String> bbox;
    private List<EarthquakeResponse> features;


    public GeoJsonResponse() {
    }

    public GeoJsonResponse(String type, MetaDataResponse metadata, List<String> bbox, List<EarthquakeResponse> features) {
        this.type = type;
        this.metadata = metadata;
        this.bbox = bbox;
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MetaDataResponse getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaDataResponse metadata) {
        this.metadata = metadata;
    }

    public List<String> getBbox() {
        return bbox;
    }

    public void setBbox(List<String> bbox) {
        this.bbox = bbox;
    }

    public List<EarthquakeResponse> getFeatures() {
        return features;
    }

    public void setFeatures(List<EarthquakeResponse> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "GeoJsonResponse{" +
                "type='" + type + '\'' +
                ", metadata=" + metadata +
                ", bbox=" + bbox +
                ", features=" + features +
                '}';
    }
}
