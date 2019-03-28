package com.example.administrator.javadesignmode.facade_mode.extend_facade_mode;

public class ExFacade {

    /**
     * 外观类只提供系统愿意暴露给外部的函数
     */

    public void testA1(){
        ExModuleA exModuleA = new ExModuleA();
        exModuleA.testA1();
    }

    public void testB1(){
        ExModuleB exModuleB = new ExModuleB();
        exModuleB.testB1();
    }

    public void testC1(){
        ExModuleC exModuleC = new ExModuleC();
        exModuleC.testC1();
    }

}
