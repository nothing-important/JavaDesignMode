package com.example.administrator.javadesignmode.publish_subscribe_mode.push_mode;

public class TestClient {

    public static void main(String [] args){
        //创建主题对象
        Push_ConcreteObservable j_concreteObservable = new Push_ConcreteObservable();
        //创建观察者对象
        Push_ConcreteObserver j_concreteObserver = new Push_ConcreteObserver();
        //添加关联关系
        j_concreteObservable.attach(j_concreteObserver);
        //主题对象状态改变，通知所有观察者对象
        j_concreteObservable.change("what??????????");
    }

}
