package com.example.developerhaoz.haozweather.base.net;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * 网络请求的工具类
 *
 * Created by developerHaoz on 2017/6/30.
 */

public class HttpUtil {


    public static void sendHttpGet(Context context, String url, final OnResponseCallback callback){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url
                , new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                callback.onSuccess(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callback.onError(error);
            }
        });
        requestQueue.add(stringRequest);
    }
//    public static void sendHttpGet(Context context, String url, final OnResponseCallback callback){
//        RequestQueue requestQueue = Volley.newRequestQueue(context);
//        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String s) {
//                callback.onSuccess(s);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                callback.onError(error);
//            }
//        });
//        requestQueue.add(stringRequest);
//    }

}












