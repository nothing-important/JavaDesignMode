package com.example.administrator.javadesignmode.function_factory_mode;

public class FactoryBMW implements Factory {
    @Override
    public Car createCar() {
        return new CarBMW();
    }
}
