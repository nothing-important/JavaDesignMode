package com.example.administrator.javadesignmode.publish_subscribe_mode.pull_mode;

public class Pull_ConcreteObservable extends Pull_Observable {

    private String state;

    public String getState(){
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题角色状态改变--->"+newState);
        notifyAllObserver();
    }

}
