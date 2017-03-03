package com.spsc.mvpdemo.weather.model;


import com.spsc.mvpdemo.bean.WeatherBean;

public interface OnResultListener {
    /**
     * 加载失败
     */
    void onFailure();

    /**
     * 加载成功
     */
    void onSuccess(WeatherBean bean);
}
