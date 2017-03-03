package com.spsc.mvpdemo.weather.view;

import com.spsc.mvpdemo.bean.WeatherBean;

/**
 * Created by allens on 2017/3/3.
 */

public interface WeatherView {

    void failure();

    void success(WeatherBean bean);

}
