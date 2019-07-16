package com.azens1995.earthquakedata.data.remote.response;

import java.util.List;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class GeometryResponse {
    private String type;
    private List<String> coordinates;

    public GeometryResponse() {
    }

    public GeometryResponse(String type, List<String> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<String> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "GeometryResponse{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}

