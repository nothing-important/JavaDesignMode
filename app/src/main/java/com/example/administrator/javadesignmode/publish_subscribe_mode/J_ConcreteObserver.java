package com.example.administrator.javadesignmode.publish_subscribe_mode;

public class J_ConcreteObserver implements J_Observer {
    @Override
    public void update(String state) {
        System.out.println("接收到主题角色状态更新的通知，状态更新为--->"+state);
    }
}
