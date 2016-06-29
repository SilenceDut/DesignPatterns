package com.silencedut.creational_patterns.factoty;

import com.silencedut.creational_patterns.factoty.factory_method.BWMFactory;
import com.silencedut.creational_patterns.factoty.factory_method.BenzFactory;
import com.silencedut.creational_patterns.factoty.simlpe_factory.SimpleFactory;

/**
 * Created by SilenceDut on 16/6/29.
 */

public class FactoryTest {
    public static void main(String[] args) {
        Car car = SimpleFactory.getCar(SimpleFactory.Benz_TYPE);

        car.showName();
        car = SimpleFactory.getCar(SimpleFactory.BWM_TYPE);
        car.showName();
        car  = new BenzFactory().getCar();
        car.showName();
        car = new BWMFactory().getCar();
        car.showName();
        car = ReflectionFactory.getCar(Benz.class);
        car.showName();
        car = ReflectionFactory.getCar(BWM.class);
        car.showName();


    }
}
