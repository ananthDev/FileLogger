package com.ak.filelogger;

import android.app.Application;

import com.ak.mylibrary.FileLogger;

/**
 * Created by developer on 22/9/17.
 */

public class Appcontroller extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FileLogger.getInstance().attachApplication(this);
    }
}
