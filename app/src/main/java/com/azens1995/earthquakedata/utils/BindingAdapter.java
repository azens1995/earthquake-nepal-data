package com.azens1995.earthquakedata.utils;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by Azens Eklak on 2019-07-16.
 * Ishani Technology Pvt. Ltc
 * azens1995@gmail.com
 */
public class BindingAdapter {

    @androidx.databinding.BindingAdapter("app:time")
    public static void setEventDate(TextView textView, long time){
        Date eventDate = new Date(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(eventDate);
        calendar.add(Calendar.HOUR_OF_DAY, 5);
        calendar.add(Calendar.MINUTE, 45);
        String eventModifiedDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(calendar.getTime());
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
