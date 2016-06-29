package com.silencedut.creational_patterns.factory.factory_method;

import com.silencedut.creational_patterns.factory.BWM;
import com.silencedut.creational_patterns.factory.Car;

/**
 * Created by SilenceDut on 16/6/29.
 */

public class BWMFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
