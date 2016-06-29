package com.silencedut.creational_patterns.factory.simple_factory;

import com.silencedut.creational_patterns.factory.BWM;
import com.silencedut.creational_patterns.factory.Benz;
import com.silencedut.creational_patterns.factory.Car;

/**
 * Created by SilenceDut on 16/6/29.
 */

public class SimpleFactory {
    public static int BWM_TYPE = 0;
    public static int Benz_TYPE = 1;
    public static Car getCar(int type) {
        Car car = null;
        if(type==BWM_TYPE) {
            car = new BWM();
        }else if(type ==Benz_TYPE) {
            car =new Benz();
        }
        return car;
    }

}
