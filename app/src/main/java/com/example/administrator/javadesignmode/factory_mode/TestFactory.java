package com.example.administrator.javadesignmode.factory_mode;


/**
 * 代码总体量并没有减少，但代码的耦合度降低了，由ProductManager统一管理不同情况，
 * 外部调用者不需要知道内部逻辑
 */
public class TestFactory {

    /**
     * 使用工厂模式
     */
    public static void main(String [] args){
        ProductType productType = ProductType.PRODUCT_ONE;
        Product product = ProductManager.factory(productType);
        product.commonFunction();
        product.selfFunction();
    }

    /**
     * 不使用工厂模式
     */
//    public static void main(String [] args){
//        ProductType productType = ProductType.PRODUCT_TWO;
//        Product product = null;
//        if (productType == ProductType.PRODUCT_ONE){
//            product = new ProductOne();
//        }else if (productType == ProductType.PRODUCT_TWO){
//            product = new ProductTwo();
//        }
//        product.commonFunction();
//        product.selfFunction();
//    }

}
