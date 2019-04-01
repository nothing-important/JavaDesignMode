package com.example.administrator.javadesignmode.wrapper_mode;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        //相关业务代码
        super.operation();
        //相关业务代码
    }
}
