package com.example.developerhaoz.haozweather.base.fragment;

/**
 * 用于 DialogFragment 之间的数据监听
 *
 * Created by developerHaoz on 2017/6/28.
 */

interface IDialogResultListener<T> {
    void onDataResult(T result);
}
