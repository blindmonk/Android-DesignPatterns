package com.design_patterns.observer;

import java.util.*;

/**
 * 描述： 利用java内置的观察者模式做气象站
 *
 * @author wmm
 * @time 2017/7/25 17:42
 */

public class WeatherDate extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();//必要性
        notifyObservers(this);
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
