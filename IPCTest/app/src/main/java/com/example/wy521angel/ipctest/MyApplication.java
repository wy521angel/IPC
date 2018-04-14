package com.example.wy521angel.ipctest;

import android.app.Application;
import android.os.Process;
import android.util.Log;

import com.example.wy521angel.ipctest.utils.MyUtils;

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        String processName = MyUtils.getProcessName(getApplicationContext(),
                Process.myPid());
        Log.d(TAG, "application start, process name:" + processName);
    }
}
