package com.spsc.mvpdemo.weather.presenter;


import com.spsc.mvpdemo.bean.WeatherBean;
import com.spsc.mvpdemo.weather.model.OnResultListener;
import com.spsc.mvpdemo.weather.model.WeatherModel;
import com.spsc.mvpdemo.weather.model.WeatherModelImpl;
import com.spsc.mvpdemo.weather.view.WeatherView;

public class WeatherPresenter {
    private WeatherModel mWeatherModel;
    private WeatherView mWeatherView;

    public WeatherPresenter(WeatherView weatherView) {
        mWeatherModel = new WeatherModelImpl();
        mWeatherView = weatherView;
    }

    public void loadData() {
        mWeatherModel.loadWeatData(new OnResultListener() {
            @Override
            public void onFailure() {
                mWeatherView.failure();
            }

            @Override
            public void onSuccess(WeatherBean bean) {
                mWeatherView.success(bean);
            }
        });
    }

}
