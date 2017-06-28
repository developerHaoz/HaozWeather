package com.example.developerhaoz.haozweather.ui;

import android.app.Application;

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
    }

    public static HaozWeatherApplication getInstance(){
        return sInstance;
    }
}
