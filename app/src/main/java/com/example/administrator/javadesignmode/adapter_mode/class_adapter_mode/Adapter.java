package com.example.administrator.javadesignmode.adapter_mode.class_adapter_mode;


/**
 * 扩展了Adaptee又实现了Target
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 该函数由Adaptee继承而来
     */
    @Override
    public void operationOne() {
        super.operationOne();
    }

    /**
     * 该函数由Target实现而来
     */
    @Override
    public void operationTwo() {

    }
}
