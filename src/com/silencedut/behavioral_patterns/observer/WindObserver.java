package com.silencedut.behavioral_patterns.observer;

/**
 * Created by SilenceDut on 16/6/27.
 */

public class WindObserver implements Observer {
    Subject mSubject;
    WindObserver(Subject subject) {
        this.mSubject = subject;
        mSubject.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println("WindObserver update");
    }
    public void removeObserver() {
        mSubject.removeObserver(this);
    }
}
