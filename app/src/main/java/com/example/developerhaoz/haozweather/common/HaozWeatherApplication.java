package com.example.developerhaoz.haozweather.common;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import org.litepal.LitePalApplication;

/**
 * 自定义的 Application
 *
 * Created by developerHaoz on 2017/6/26.
 */

public class HaozWeatherApplication extends LitePalApplication {

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
