package com.azens1995.earthquakedata.data.remote.response;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class EarthquakeResponse {
    private String id;
    private String type;
    private PropertiesResponse properties;
    private GeometryResponse geometry;

    public EarthquakeResponse() {
    }

    public EarthquakeResponse(String id, String type, PropertiesResponse properties, GeometryResponse geometry) {
        this.id = id;
        this.type = type;
        this.properties = properties;
        this.geometry = geometry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropertiesResponse getProperties() {
        return properties;
    }

    public void setProperties(PropertiesResponse properties) {
        this.properties = properties;
    }

    public GeometryResponse getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryResponse geometry) {
        this.geometry = geometry;
    }



    @Override
    public String toString() {
        return "EarthquakeResponse{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", properties=" + properties +
                ", geometry=" + geometry +
                '}';
    }
}
