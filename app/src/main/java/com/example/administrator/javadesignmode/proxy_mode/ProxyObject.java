package com.example.administrator.javadesignmode.proxy_mode;

/**
 * 代理对象
 */
public class ProxyObject extends AbstractObject{

    private RealObject realObject = new RealObject();

    @Override
    void operation() {
        System.out.print("\n在真实对象操作之前你可以做些什么\n");
        realObject.operation();
        System.out.print("\n在真实对象操作之后你可以做些什么\n");
    }
}
