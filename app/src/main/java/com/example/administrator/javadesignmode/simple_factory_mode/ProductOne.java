package com.example.administrator.javadesignmode.simple_factory_mode;

/**
 * 具体产品
 */
public class ProductOne implements Product {

    @Override
    public void commonFunction() {
        System.out.print("commonFunction: I am sure to make you happy");
    }

    @Override
    public void selfFunction() {
        System.out.print("selfFunction: I also can make money");
    }
}
