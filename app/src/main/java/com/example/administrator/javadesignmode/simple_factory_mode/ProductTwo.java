package com.example.administrator.javadesignmode.simple_factory_mode;

/**
 * 具体产品
 */
public class ProductTwo implements Product {

    @Override
    public void commonFunction() {
        System.out.print("commonFunction: I am sure to make you happy");
    }

    @Override
    public void selfFunction() {
        System.out.print("selfFunction: Let's play LOL");
    }
}
