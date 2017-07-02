package com.example.developerhaoz.haozweather.utils;

import com.example.developerhaoz.haozweather.bean.WeatherBean;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 用于 Gson 解析的类
 *
 * Created by developerHaoz on 2017/7/2.
 */

public class GsonUtil {

    /**
     * 根据 json 类型的字符串获取 WeatherBean
     *
     * @param dataJson 一个 json 类型的字符串
     * @return
     */
    public static WeatherBean getWeatherBean(String dataJson){

        WeatherBean weatherBean = null;
        if (Check.isEmpty(dataJson)){
            weatherBean = new WeatherBean();
            return weatherBean;
        }
        try {
            JSONObject jsonObject = new JSONObject(dataJson);
            String resultJson = jsonObject.getJSONArray("HeWeather5").get(0).toString();
            Gson gson = new Gson();
            weatherBean = gson.fromJson(resultJson, WeatherBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return weatherBean;

    }
}
