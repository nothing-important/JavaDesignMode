package com.example.administrator.javadesignmode.publish_subscribe_mode.pull_mode;

public class TestClient {

    public static void main(String [] args){
        Pull_ConcreteObservable pull_concreteObservable = new Pull_ConcreteObservable();
        Pull_ConcreteObserver pull_concreteObserver = new Pull_ConcreteObserver();
        pull_concreteObservable.attach(pull_concreteObserver);
        pull_concreteObservable.change("hahahahah");
    }

}
