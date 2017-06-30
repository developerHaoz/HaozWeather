package com.example.developerhaoz.haozweather.common;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * 自定义的 Application
 *
 * Created by developerHaoz on 2017/6/26.
 */

public class HaozWeatherApplication extends Application {

    private static HaozWeatherApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public static HaozWeatherApplication getInstance(){
        return sInstance;
    }
}
