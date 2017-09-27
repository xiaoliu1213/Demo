package com.mxg.gitdemo;

import android.app.Activity;
import android.os.Bundle;

import com.mxg.gitdemo.utils.LogUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.e("mxg","Demo");

        // 调试AS的git版本控制
    }

}
