package com.silencedut.creational_patterns.factoty;

/**
 * Created by SilenceDut on 16/6/29.
 */

 class ReflectionFactory {
     static  <T extends Car> T getCar(Class<T> carClass) {
        T car =null;
        try {
            car = carClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
         return car;
    }
}
