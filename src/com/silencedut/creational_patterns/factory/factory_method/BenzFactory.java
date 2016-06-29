package com.silencedut.creational_patterns.factory.factory_method;

import com.silencedut.creational_patterns.factory.Benz;
import com.silencedut.creational_patterns.factory.Car;

/**
 * Created by SilenceDut on 16/6/29.
 */

public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
