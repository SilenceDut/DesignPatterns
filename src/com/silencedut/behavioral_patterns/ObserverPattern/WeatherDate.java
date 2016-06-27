package com.silencedut.behavioral_patterns.ObserverPattern;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by SilenceDut on 16/6/27.
 */

public class WeatherDate implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index!=-1){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            if(observer!=null) {
                observer.update();
            }
        }
    }

    public void setDate() {
        notifyObservers();
    }


}
