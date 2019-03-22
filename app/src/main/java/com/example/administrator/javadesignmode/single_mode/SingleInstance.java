package com.example.administrator.javadesignmode.single_mode;

public class SingleInstance {

    private static SingleInstance singleInstance;

    private SingleInstance(){}

    /**
     * 饿汉式
     * 多个线程调用时，会产生多个对象，线程不安全
     * @return
     */
    public static SingleInstance getInstanceA(){
        if (singleInstance == null){
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }

    /**
     * 加入synchronized
     * 优点：解决多线程问题，避免多线程调用产生多个对象
     * 缺点：不高效，任何时候只能有一个线程调用getInstanceB()函数，每次调用都会进行同步，但是同步操作只是在第一次调用时才需要
     * @return
     */
    public static synchronized SingleInstance getInstanceB(){
        if (singleInstance == null){
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }

    /**
     * 双重校验锁
     * 在同步块内、外各有一次校验instance == null
     * 优点：
     * 同步块外校验：避免已经有实例对象后每次调用时再次同步
     * 同步块内校验：避免多个线程同时通过外部判断进入后产生多个对象
     * 缺点：
     * singleInstance = new SingleInstance()为非原子操作，可能会崩溃，JVM在执行该句代码时做了三步操作：
     * 1.给singleInstance分配内存
     * 2.调用SingleInstance构造函数来初始化成员变量
     * 3.将singleInstance对象指向分配的内存空间
     * 在JVM的即时编译中存在指令重排序的优化，2.3步不能保证顺序执行，最终的执行顺序可能是1-2-3，也可能是1-3-2
     * 如果是1-3-2，在3执行完毕，2没有执行时，被线程二抢占，这时singleInstance为非空（但是却没有初始化），线程二直接返回singleInstance，然后使用，然后报错
     * 解决：
     * 将 instance 变量声明成 volatile ，禁止指令重排序优化，也就是说取得操作只能等1-2-3或者1-3-2完成之后才会执行
     * @return
     */
    public static SingleInstance getInstanceC(){
        if (singleInstance == null){
            synchronized (SingleInstance.class){
                if (singleInstance == null){
                    singleInstance = new SingleInstance();
                }
            }
        }
        return singleInstance;
    }

    /**
     * 饿汉式:优先创建实例对象，不存在同步问题和指令重排序问题
     * 缺点：
     * 在类加载时就被初始化，不符合懒加载
     * 如果实例的创建需要依赖初始参数，则同样不适用
     * private static SingleInstance singleInstance = new SingleInstance();
     * @return
     */
    public static SingleInstance getInstanceD(){
        return singleInstance;
    }

    /**
     * 静态内部类形式
     * 使用java本身机制保证线程安全
     *
     */
    private static class SingleInstanceHolder{
        private static final SingleInstance INSTANCE = new SingleInstance();
    }

    public static SingleInstance getInstanceE(){
        return SingleInstanceHolder.INSTANCE;
    }

}
