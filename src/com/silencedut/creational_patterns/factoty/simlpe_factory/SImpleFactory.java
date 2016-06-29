package com.silencedut.creational_patterns.factoty.simlpe_factory;

import com.silencedut.creational_patterns.factoty.BWM;
import com.silencedut.creational_patterns.factoty.Benz;
import com.silencedut.creational_patterns.factoty.Car;

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
