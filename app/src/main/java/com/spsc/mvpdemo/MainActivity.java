package com.spsc.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.spsc.mvpdemo.bean.WeatherBean;
import com.spsc.mvpdemo.weather.presenter.WeatherPresenter;
import com.spsc.mvpdemo.weather.view.WeatherView;

public class MainActivity extends AppCompatActivity implements WeatherView {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        WeatherPresenter presenter = new WeatherPresenter(this);
        presenter.loadData();
    }

    @Override
    public void failure() {
        textView.setText("尼玛啊");
    }

    @Override
    public void success(WeatherBean bean) {
        String error_code = bean.getReason();
        textView.setText(error_code + "");
    }
}
