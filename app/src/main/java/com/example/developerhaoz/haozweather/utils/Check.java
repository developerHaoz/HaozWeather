package com.example.developerhaoz.haozweather.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 辅助判断
 *
 * Created by developerHaoz on 2017/6/28.
 */

public class Check {

    public static boolean isEmpty(CharSequence str) {
        return isNull(str) || str.length() == 0;
    }

    public static boolean isEmpty(Object[] objects) {
        return isNull(objects) || objects.length == 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return isNull(collection) || collection.size() == 0;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return isNull(map) || map.size() == 0;
    }


    private static boolean isNull(Object o) {
        return o == null;
    }

}

















