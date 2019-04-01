package com.example.administrator.javadesignmode.wrapper_mode;

/**
 * 具体构件角色
 */
public class ConcreteComponent implements Component {


    @Override
    public void operation() {
        //该构件应做什么样的具体操作
        System.out.print("具体构件角色去做具体的任务");
    }
}
