package com.example.developerhaoz.haozweather.base.net;

/**
 * 网络请求结果的的回调接口
 *
 * Created by developerHaoz on 2017/6/30.
 */

public interface OnResponseCallback {
    void onSuccess(String response);
    void onError(Exception error);
}
