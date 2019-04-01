package com.example.administrator.javadesignmode.wrapper_mode;

/**
 * 装饰角色
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        //将任务委派给构件
        component.operation();
    }
}
