package com.mxg.gitdemo.base;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

    public Activity activity;
    public Context context;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        context = getApplicationContext();
        
    }
    
}
