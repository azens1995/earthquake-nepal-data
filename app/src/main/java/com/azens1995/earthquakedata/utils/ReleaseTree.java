package com.azens1995.earthquakedata.utils;

import android.util.Log;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timber.log.Timber;

/**
 * Created by Azens Eklak on 2019-06-26.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class ReleaseTree extends Timber.Tree {
    @Override
    protected void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return;
        }
        //Crashlytics.log(priority,tag,message);
    }
}
