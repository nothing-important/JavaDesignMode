package com.example.administrator.javadesignmode.factory_mode;

public class ProductManager {

    public static Product factory(ProductType productType){
        if (productType == ProductType.PRODUCT_ONE){
            return new ProductOne();
        }else if (productType == ProductType.PRODUCT_TWO){
            return new ProductTwo();
        }else {
            throw new RuntimeException("no product");
        }
    }

}
