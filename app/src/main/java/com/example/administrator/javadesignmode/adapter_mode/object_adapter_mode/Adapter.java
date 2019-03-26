package com.example.administrator.javadesignmode.adapter_mode.object_adapter_mode;

public class Adapter{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee含有operationOne函数，适配器类直接委派即可
     */
    public void operationOne(){
        adaptee.operationOne();
    }

    /**
     * 源类Adaptee不含有operationTwo函数，适配器类需要补充该函数
     */
    public void operationTwo(){

    }
}
