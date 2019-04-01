package com.example.administrator.javadesignmode.wrapper_mode.example;

/**
 * 装饰角色---七十二变
 */
public class Change implements TheGreatestSage{

    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
