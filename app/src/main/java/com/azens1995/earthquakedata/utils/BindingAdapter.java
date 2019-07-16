package com.azens1995.earthquakedata.utils;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

import timber.log.Timber;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class BindingAdapter {

    @androidx.databinding.BindingAdapter("app:time")
    public static void setEventDate(TextView textView, long time){
        Date eventDate = new Date(time);
        Timber.d("Date before->"+new Gson().toJson(eventDate));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(eventDate);
        /*calendar.add(Calendar.HOUR_OF_DAY, 5);
        calendar.add(Calendar.MINUTE, 45);*/
        String eventModifiedDate = new SimpleDateFormat("hh:mm:ss a,\nEEEE\nyyyy-MM-dd", Locale.ENGLISH).format(calendar.getTime());
        Timber.d("Date after->"+new Gson().toJson(eventModifiedDate));
        textView.setText(eventModifiedDate);
    }

    @androidx.databinding.BindingAdapter("app:visible")
    public static void setVisibility(ConstraintLayout constraintLayout, String place){
        if (Pattern.compile(Pattern.quote("Nepal"), Pattern.CASE_INSENSITIVE).matcher(place).find()){
         constraintLayout.setVisibility(View.VISIBLE);
        }else {
            constraintLayout.setVisibility(View.GONE);
        }
    }
}
