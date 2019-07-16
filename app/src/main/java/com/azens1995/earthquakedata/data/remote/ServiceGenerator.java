package com.azens1995.earthquakedata.data.remote;

import com.azens1995.earthquakedata.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Azens Eklak on 2019-06-25.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class ServiceGenerator {

    private static final String BASE_URL = "https://earthquake.usgs.gov/fdsnws/event/1/";

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static HttpLoggingInterceptor logging =
            new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();

    public static <S> S createService(
            Class<S> serviceClass) {
        if (BuildConfig.DEBUG) {
            if (!httpClient.interceptors().contains(logging)) {
                httpClient.addInterceptor(logging);
                builder.client(httpClient.build());
                retrofit = builder.build();
            }
        }else {
            builder.client(httpClient.build());
            retrofit = builder.build();
        }

        return retrofit.create(serviceClass);
    }

    public static Retrofit retrofit() {
        return retrofit;
    }
}
