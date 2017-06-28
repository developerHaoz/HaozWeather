package com.example.developerhaoz.haozweather.base.bus;

import org.greenrobot.eventbus.EventBus;

/**
 * EventBus 的包装类，方便进行配置
 *
 * Created by developerHaoz on 2017/6/28.
 */

public class EventBusUtils {

    private static final EventBus INSTANCE = EventBus.getDefault();

    // 对 EventBus 进行包装，方便以后进行修改
    public static EventBus getInstance(){
        return INSTANCE;
    }

    public static void post(Object object){
        INSTANCE.post(object);
    }

    public static void postSticky(Object object){
        INSTANCE.postSticky(object);
    }

    public static void register(Object object){
        if(!INSTANCE.isRegistered(object)){
            INSTANCE.register(object);
        }
    }

    public static void unregister(Object object){
        if(INSTANCE.isRegistered(object)){
            INSTANCE.unregister(object);
        }
    }


}





















