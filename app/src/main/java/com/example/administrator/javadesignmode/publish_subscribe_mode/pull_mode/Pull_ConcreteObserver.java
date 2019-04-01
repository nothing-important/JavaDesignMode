package com.example.administrator.javadesignmode.publish_subscribe_mode.pull_mode;

public class Pull_ConcreteObserver implements Pull_Observer {
    @Override
    public void update(Pull_Observable pull_observable) {
        Pull_ConcreteObservable pull_concreteObservable = (Pull_ConcreteObservable) pull_observable;
        System.out.println("观察者接收到主题角色状态更新消息，状态更新为--->"+pull_concreteObservable.getState());
    }
}
