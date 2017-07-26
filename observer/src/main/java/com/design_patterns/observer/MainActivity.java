package com.design_patterns.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.design_patterns.toast.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.init(this);
        WeatherDate weatherDate = new WeatherDate();
        new CurrentConditionsDisplay(weatherDate);
        //更新气象 通知内置观察
        weatherDate.setMeasurements(80, 65, 30.4f);
        weatherDate.setMeasurements(82, 70, 29.2f);
        weatherDate.setMeasurements(78, 90, 29.2f);
    }
}
