package com.azens1995.earthquakedata.utils;

import android.app.Application;

import com.azens1995.earthquakedata.BuildConfig;

import timber.log.Timber;

/**
 * Created by Azens Eklak on 2019-06-26.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new ReleaseTree());
        }
    }
}
