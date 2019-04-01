package com.example.administrator.javadesignmode.wrapper_mode.example;

public class ChangeBird extends Change {
    public ChangeBird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("bird fly");
    }
}
