package com.design_patterns.observer;

import com.design_patterns.toast.ToastUtils;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述：观察者-当前气象状态
 *
 * @author wmm
 * @time 2017/7/25 17:52
 */

public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDate) {
            WeatherDate weatherDate = (WeatherDate) arg;
            this.temperature = weatherDate.getTemperature();
            this.humidity = weatherDate.getHumidity();
            display();
        }
    }

    public void display() {
        ToastUtils.showToasts("current conditions：" + temperature + "F degrees add" + humidity + "& humidity");
    }
}
