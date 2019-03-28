package com.example.administrator.javadesignmode.facade_mode;

/**
 * 外观角色
 * 客户端不需要亲自调用子系统中的A、B、C模块，也不需要知道内部的实现细节，甚至不需要知道
 * A、B、C模式是否存在，客户端只需要和Facade进行交互，从而实现了客户端和A、B、C模块的解耦
 * 让客户端更容易使用系统
 */
public class Facade {

    public void test(){
        OperationOne one = new OperationOne();
        one.openTheDoor();
        OperationTwo two = new OperationTwo();
        two.letIn();
        OperationThree three = new OperationThree();
        three.closeTheDoor();
    }

}
