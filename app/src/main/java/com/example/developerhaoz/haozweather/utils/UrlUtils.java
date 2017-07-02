package com.example.developerhaoz.haozweather.utils;

import com.example.developerhaoz.haozweather.common.AppConstants;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 处理 Url 的工具类
 *
 * Created by developerHaoz on 2017/7/2.
 */

public class UrlUtils {

    public static final String URL_COMPLETE = "https://free-api.heweather.com/v5/weather?city=yourcity&key=yourkey";

    /**
     * 根据城市名称，获取一个 encode 后的 Url
     *
     * @param cityName
     * @return
     */
    public static String getWeatherUrl(String cityName){
        StringBuilder stringBuilder = new StringBuilder();
        if(!Check.isEmpty(cityName)){
            stringBuilder.append("https://free-api.heweather.com/v5/weather?city=");
            stringBuilder.append(getUrlEncode(cityName));
            stringBuilder.append("&key=").append(AppConstants.KEY_WEATHER);
            return String.valueOf(stringBuilder);
        }
       return String.valueOf(stringBuilder);
    }


    /**
     * 将一个中文字符串进行 encode 处理
     *
     * @param string
     * @return
     */
    public static String getUrlEncode(String string){
        String urlEncode = null;
        String encodeType = "utf-8";
        try{
            urlEncode = URLEncoder.encode(String.valueOf(string), encodeType);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return urlEncode;
    }

}
