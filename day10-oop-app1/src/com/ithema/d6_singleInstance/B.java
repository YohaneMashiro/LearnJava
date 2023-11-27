package com.ithema.d6_singleInstance;

/**
 *  单例设计模式--懒汉式单例
 * */

public class B {
    //2.定义一个类变量用于存储一个对象
    private static B b;

    //1.私有构造器
    private B(){}

    //3.定义一个类方法，保证调用时才创建一个对象，后面调用返回同一对象
    public static B getInstance(){
        if(b==null) b=new B();
        return b;
    }
}
