package com.ak.filelogger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ak.mylibrary.FileLogger;

/**
 * Created by developer on 21/9/17.
 */

public class LoggerFileActivity extends Activity {
    FileLogger logger;
    String TAG = LoggerFileActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logger = FileLogger.getInstance();
        logger.startLoggerForTag(TAG);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        logger.appendLog(TAG, "Onstart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        logger.appendLog(TAG, "Onstart");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logger.appendLog(TAG, "onDestroy");
        logger.flush(TAG);
    }
}
