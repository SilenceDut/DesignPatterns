package com.silencedut.creational_patterns.factoty.factory_method;

import com.silencedut.creational_patterns.factoty.BWM;
import com.silencedut.creational_patterns.factoty.Car;

/**
 * Created by SilenceDut on 16/6/29.
 */

public class BWMFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
