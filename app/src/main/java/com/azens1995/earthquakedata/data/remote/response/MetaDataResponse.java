package com.azens1995.earthquakedata.data.remote.response;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class MetaDataResponse {
    private long generated;
    private String url;
    private String api;
    private String count;
    private int status;

    public MetaDataResponse() {
    }

    public MetaDataResponse(long generated, String url, String api, String count, int status) {
        this.generated = generated;
        this.url = url;
        this.api = api;
        this.count = count;
        this.status = status;
    }

    public long getGenerated() {
        return generated;
    }

    public void setGenerated(long generated) {
        this.generated = generated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MetaDataResponse{" +
                "generated=" + generated +
                ", url='" + url + '\'' +
                ", api='" + api + '\'' +
                ", count='" + count + '\'' +
                ", status=" + status +
                '}';
    }
}
