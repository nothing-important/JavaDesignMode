package com.example.administrator.javadesignmode.function_factory_mode;

public class TestFncFactory {

    public static void main(String [] args){
        Factory factory = new FactoryAudi();
        Car car = factory.createCar();
        car.run();
        factory = new FactoryBMW();
        car = factory.createCar();
        car.run();
    }

}
