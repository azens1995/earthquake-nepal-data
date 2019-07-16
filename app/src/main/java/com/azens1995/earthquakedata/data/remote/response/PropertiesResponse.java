package com.azens1995.earthquakedata.data.remote.response;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */

public class PropertiesResponse {
    private float mag;
    private String place;
    private long time;
    private long updated;
    private long tz;
    private String url;
    private String detail;
    private float felt;
    private float cdi;
    private float mmi;
    private String alert;
    private String status;
    private float tsunami;
    private float sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private String nst;
    private float dmin;
    private float rms;
    private float gap;
    private String magType;
    private String type;

    public PropertiesResponse() {
    }

    public PropertiesResponse(float mag, String place, long time, long updated, long tz, String url, String detail, float felt, float cdi, float mmi, String alert, String status, float tsunami, float sig, String net, String code, String ids, String sources, String types, String nst, float dmin, float rms, float gap, String magType, String type) {
        this.mag = mag;
        this.place = place;
        this.time = time;
        this.updated = updated;
        this.tz = tz;
        this.url = url;
        this.detail = detail;
        this.felt = felt;
        this.cdi = cdi;
        this.mmi = mmi;
        this.alert = alert;
        this.status = status;
        this.tsunami = tsunami;
        this.sig = sig;
        this.net = net;
        this.code = code;
        this.ids = ids;
        this.sources = sources;
        this.types = types;
        this.nst = nst;
        this.dmin = dmin;
        this.rms = rms;
        this.gap = gap;
        this.magType = magType;
        this.type = type;
    }

    public float getMag() {
        return mag;
    }

    public void setMag(float mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public long getTz() {
        return tz;
    }

    public void setTz(long tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getFelt() {
        return felt;
    }

    public void setFelt(float felt) {
        this.felt = felt;
    }

    public float getCdi() {
        return cdi;
    }

    public void setCdi(float cdi) {
        this.cdi = cdi;
    }

    public float getMmi() {
        return mmi;
    }

    public void setMmi(float mmi) {
        this.mmi = mmi;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTsunami() {
        return tsunami;
    }

    public void setTsunami(float tsunami) {
        this.tsunami = tsunami;
    }

    public float getSig() {
        return sig;
    }

    public void setSig(float sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getNst() {
        return nst;
    }

    public void setNst(String nst) {
        this.nst = nst;
    }

    public float getDmin() {
        return dmin;
    }

    public void setDmin(float dmin) {
        this.dmin = dmin;
    }

    public float getRms() {
        return rms;
    }

    public void setRms(float rms) {
        this.rms = rms;
    }

    public float getGap() {
        return gap;
    }

    public void setGap(float gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PropertiesResponse{" +
                "mag=" + mag +
                ", place='" + place + '\'' +
                ", time=" + time +
                ", updated=" + updated +
                ", tz=" + tz +
                ", url='" + url + '\'' +
                ", detail='" + detail + '\'' +
                ", felt=" + felt +
                ", cdi=" + cdi +
                ", mmi=" + mmi +
                ", alert='" + alert + '\'' +
                ", status='" + status + '\'' +
                ", tsunami=" + tsunami +
                ", sig=" + sig +
                ", net='" + net + '\'' +
                ", code='" + code + '\'' +
                ", ids='" + ids + '\'' +
                ", sources='" + sources + '\'' +
                ", types='" + types + '\'' +
                ", nst='" + nst + '\'' +
                ", dmin=" + dmin +
                ", rms=" + rms +
                ", gap=" + gap +
                ", magType='" + magType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
