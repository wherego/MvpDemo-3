package com.spsc.mvpdemo.weather.model;

import android.os.Handler;


import com.google.gson.Gson;
import com.spsc.mvpdemo.bean.WeatherBean;
import com.spsc.mvpdemo.constant.UrlString;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherModelImpl implements WeatherModel {
    //得到数据，和服务端进行交互
    @Override
    public void loadWeatData(final OnResultListener listener) {
        //
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(UrlString.URL_WEATHER)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.onFailure();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                final WeatherBean bean = new Gson().fromJson(result, WeatherBean.class);
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.onSuccess(bean);
                    }
                });
            }
        });
    }

    Handler mHandler = new Handler();
}
