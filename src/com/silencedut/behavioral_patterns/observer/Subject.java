package com.silencedut.behavioral_patterns.observer;

/**
 * Created by SilenceDut on 16/6/27.
 */

 interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
