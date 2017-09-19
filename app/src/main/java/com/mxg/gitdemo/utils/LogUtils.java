package com.mxg.gitdemo.utils;

import android.util.Log;

/**
 * Created by mxg on 2017/9/19.
 */

public class LogUtils {

    public static final String TAG = "soolife";
    public static final String COLON = ": ";

    /** 日志总开 */
    private static boolean isOn = true ;

    /**
     * 设置日志总开
     * @param isLogOn 开关
     */
    public static void setLogOn(boolean isLogOn){
        isOn = isLogOn;
    }

    public static void e(String tag, String msg) {
        if(isOn) {
            Log.v(TAG, tag + COLON + msg);
        }
    }

}
