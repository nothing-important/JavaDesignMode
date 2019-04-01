package com.example.administrator.javadesignmode.publish_subscribe_mode.pull_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题对象
 */
public class Pull_Observable {

    private List<Pull_Observer> list = new ArrayList<>();

    public void attach(Pull_Observer pull_observer){
        list.add(pull_observer);
    }

    public void detach(Pull_Observer pull_observer){
        list.remove(pull_observer);
    }

    public void notifyAllObserver(){
        if (list.size() == 0){
            System.out.println("暂无任何观察者与该主题关联");
            return;
        }

        for (Pull_Observer o : list) {
            o.update(this);
        }
    }

}
