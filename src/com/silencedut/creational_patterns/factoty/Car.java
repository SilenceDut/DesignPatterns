package com.silencedut.creational_patterns.factoty;

/**
 * Created by SilenceDut on 16/6/29.
 */

public abstract class Car {
    void showName (){
        System.out.println(name());
    }
    public abstract String name();
}
