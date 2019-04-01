package com.example.administrator.javadesignmode.wrapper_mode.example;

public class ChangeFish extends Change {
    public ChangeFish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("fish move");
    }
}
