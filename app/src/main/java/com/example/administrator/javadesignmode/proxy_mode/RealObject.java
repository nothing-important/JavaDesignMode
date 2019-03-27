package com.example.administrator.javadesignmode.proxy_mode;

/**
 * 真实对象，要被代理的对象
 */
public class RealObject extends AbstractObject {
    @Override
    void operation() {
        System.out.print("真实对象可以做些什么");
    }
}
