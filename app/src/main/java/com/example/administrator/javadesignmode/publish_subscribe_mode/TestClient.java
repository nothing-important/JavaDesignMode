package com.example.administrator.javadesignmode.publish_subscribe_mode;

public class TestClient {

    public static void main(String [] args){
        //创建主题对象
        J_ConcreteObservable j_concreteObservable = new J_ConcreteObservable();
        //创建观察者对象
        J_ConcreteObserver j_concreteObserver = new J_ConcreteObserver();
        //添加关联关系
        j_concreteObservable.attach(j_concreteObserver);
        //主题对象状态改变，通知所有观察者对象
        j_concreteObservable.change("what??????????");
    }

}
