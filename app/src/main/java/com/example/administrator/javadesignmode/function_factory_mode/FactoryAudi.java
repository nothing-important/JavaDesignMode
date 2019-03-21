package com.example.administrator.javadesignmode.function_factory_mode;

public class FactoryAudi implements Factory {
    @Override
    public Car createCar() {
        return new CarAudi();
    }
}
