package com.example.administrator.javadesignmode.wrapper_mode.example;

public class TestWrapper {

    public static void main(String [] args){
        //单层装饰
        TheGreatestSage sage = new Monkey();
        TheGreatestSage bird = new ChangeBird(sage);
        bird.move();
        System.out.println("***************************");
        //双层装饰
        TheGreatestSage greatestSage = new Monkey();
        TheGreatestSage greatestSageBird = new ChangeBird(greatestSage);
        TheGreatestSage greatestSageFish = new ChangeFish(greatestSageBird);
        greatestSageFish.move();
    }

}
