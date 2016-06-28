package com.silencedut.behavioral_patterns.observer;

/**
 * Created by SilenceDut on 16/6/27.
 */

public class ObserverTest {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();
        TemperatureObserver temperatureObserver = new TemperatureObserver(weatherDate);
        WindObserver windObserver = new WindObserver(weatherDate);
        weatherDate.setDate();
    }
}
