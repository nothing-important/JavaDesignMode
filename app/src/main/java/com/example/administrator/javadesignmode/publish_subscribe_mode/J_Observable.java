package com.example.administrator.javadesignmode.publish_subscribe_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的被观察者角色（抽象主题角色）
 */
public abstract class J_Observable {

    private List<J_Observer> list = new ArrayList<>();

    public void attach(J_Observer j_observer){
        list.add(j_observer);
        System.out.println("attach a new observer");
    }

    public void detach(J_Observer j_observer){
        list.remove(j_observer);
        System.out.println("detach an observer");
    }

    public void notifyAllObserver(String state){
        if (list.size() == 0){
            System.out.println("该主题对象没有关联任何观察者");
            return;
        }
        for (J_Observer j : list) {
            j.update(state);
        }
    }

}
