package com.example.administrator.javadesignmode.publish_subscribe_mode;

/**
 * 具体的被观察者角色（具体的主题角色）
 */
public class J_ConcreteObservable extends J_Observable{

    private String state;

    private String getState(){
        return state;
    }

    public void change(String newState){
        this.state = newState;
        System.out.println("主题角色状态更新--->"+newState);
        notifyAllObserver(newState);
    }

}
