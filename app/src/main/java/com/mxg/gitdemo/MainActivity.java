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

        // 如何提交到master分支上面

        // 这次提交到哪里呢？

        // 再切换到1.0分支上面、

        // 回到正确的轨道上面来、

        // 可以直接更新下来最新的文件吗？ ----> 可以了吗？

        // 什么情况？demo1.0

    }

}
