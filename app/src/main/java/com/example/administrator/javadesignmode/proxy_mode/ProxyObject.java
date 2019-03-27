package com.example.administrator.javadesignmode.proxy_mode;

/**
 * 代理对象
 */
public class ProxyObject extends AbstractObject{

    RealObject realObject = new RealObject();

    @Override
    void operation() {
        //被代理对象在真实对象操作之前可以做些什么
        realObject.operation();
        //被代理对象在真实对象操作之后可以做些什么
    }
}
