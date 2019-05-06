package com.example.administrator.demo;

import android.content.Context;

/**
 * Created by Administrator on 2019/5/5 0005.
 */

public class ScreenUtil {
    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }


    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;

    }
}
